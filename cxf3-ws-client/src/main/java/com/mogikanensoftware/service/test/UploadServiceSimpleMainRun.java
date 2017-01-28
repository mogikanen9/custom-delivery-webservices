package com.mogikanensoftware.service.test;

import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import com.mogikanensoftware.schemas.upload.UploadService;
import com.mogikanensoftware.schemas.upload.UploadService_Service;
import com.mogikanensoftware.schemas.upload.type.MessageType;
import com.mogikanensoftware.schemas.upload.type.RecipientIdentityType;
import com.mogikanensoftware.schemas.upload.type.UploadMessageMessageInfo;
import com.mogikanensoftware.schemas.upload.type.UploadMessagePatientInfo;
import com.mogikanensoftware.schemas.upload.type.UploadMessageRecipientInfo;
import com.mogikanensoftware.schemas.upload.type.UploadMessageRequest;
import com.mogikanensoftware.schemas.upload.type.UploadMessageResponse;

public class UploadServiceSimpleMainRun {

	//public final static QName SERVICE = new QName("http://schemas.mogikanensoftware.com/upload", "UploadServiceService");
	public final static QName SERVICE = new QName("http://schemas.mogikanensoftware.com/upload", "UploadService");
	private static final String UPLOAD_SERVICE_URL = "http://localhost:8180/cxf3demo/services/uploadService?wsdl";

	
	public static void main(String args[]){
		
		Service uploadService = null;
		
		try {
			uploadService = UploadService_Service.create(new URL(UPLOAD_SERVICE_URL), SERVICE);
			
			UploadService service = uploadService.getPort(UploadService_Service.UploadServicePort, UploadService.class);
			
			//enable MTOM
			Binding binding = ((BindingProvider)service).getBinding();
	        ((SOAPBinding)binding).setMTOMEnabled(true);
			
			UploadMessageRequest request = new UploadMessageRequest();
			request.setRequestTransactionUid(System.currentTimeMillis()+"");
			
			UploadMessageMessageInfo msgInfo = new UploadMessageMessageInfo();
			
			UploadMessagePatientInfo patientInfo =new UploadMessagePatientInfo();
			msgInfo.setPatientInfo(patientInfo);
			
			msgInfo.setMsgType(MessageType.MR);
			msgInfo.setSendingFacilityId("SF123");
			msgInfo.setMsgUid("MUID"+System.currentTimeMillis());
			
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(new Date());
			XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			msgInfo.setMessageReceivedDate(date2);
			
			UploadMessageRecipientInfo recipient = new UploadMessageRecipientInfo();
			recipient.setIdentityType(RecipientIdentityType.CPSO);
			recipient.setIdentityValue("12345");
			
			request.getRecipients().add(recipient);
			
			request.setMessageInfo(msgInfo);

			//read file data			
			DataHandler dataHanlder = new DataHandler(UploadServiceSimpleMainRun.class.getResource("/cross_promotion.jpg"));
			
			request.setMessageContent(dataHanlder);
			
			UploadMessageResponse response = service.uploadMessage(request);
			
			System.out.println("response.getResponseTransactionUid()->"+response.getResponseTransactionUid());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
