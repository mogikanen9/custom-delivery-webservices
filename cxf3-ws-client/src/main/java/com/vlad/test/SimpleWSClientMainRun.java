package com.vlad.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import com.ontariomd.schemas.hrm.delivery.DeliveryService;
import com.ontariomd.schemas.hrm.delivery.DeliveryServiceException_Exception;
import com.ontariomd.schemas.hrm.delivery.DeliveryService_Service;
import com.ontariomd.schemas.hrm.delivery.type.GetNewMessagesMessageInfo;
import com.ontariomd.schemas.hrm.delivery.type.GetNewMessagesRequest;
import com.ontariomd.schemas.hrm.delivery.type.GetNewMessagesResponse;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;

public class SimpleWSClientMainRun {

	 public final static QName SERVICE = new QName("http://schemas.ontariomd.com/hrm/delivery", "DeliveryServiceService");
	private static final String DELIVERY_SERVICE_URL = "http://localhost:8180/cxf3demo/services/deliveryService?wsdl";

	
	public static void main(String[] args) {
		Service deliveryService;
		try {
			deliveryService = DeliveryService_Service.create(new URL(DELIVERY_SERVICE_URL), SERVICE);
						
			
			DeliveryService service = deliveryService.getPort(DeliveryService_Service.DeliveryServicePort, DeliveryService.class);						
			
			Client client = ClientProxy.getClient( service );	   
			Endpoint endPoint = client.getEndpoint();   				       
	        			
			 Map<String, Object> outProperties = new HashMap<String, Object>();
	         outProperties.put( WSHandlerConstants.ACTION,
	               WSHandlerConstants.USERNAME_TOKEN );
	         outProperties.put( WSHandlerConstants.USER, "joe");
	         outProperties.put( WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_DIGEST );
	         outProperties.put( WSHandlerConstants.PW_CALLBACK_CLASS,
	        		 ClientPasswordCallback.class.getName() );
	         outProperties.put( WSHandlerConstants.MUST_UNDERSTAND,"false");
	         WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor( outProperties );
	         endPoint.getOutInterceptors().add( wssOut );
	         
	         LoggingInInterceptor lii = new LoggingInInterceptor();
	         lii.setPrettyLogging(true);
	         endPoint.getInInterceptors().add( lii );
	         
	         LoggingOutInterceptor loi = new LoggingOutInterceptor();
	         loi.setPrettyLogging(true);
	         endPoint.getOutInterceptors().add(loi);	         	         
			
			GetNewMessagesRequest request = new GetNewMessagesRequest();
			request.setRequestTransactionUid(System.currentTimeMillis()+"");
			request.setEmrInstanceKey("abc23");
										
			
			GetNewMessagesResponse response = service.getNewMessages(request);

			for(GetNewMessagesMessageInfo msgInfo:response.getMessages()){
				System.out.println(msgInfo.getMessageDeliveryUid());
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DeliveryServiceException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}

}
