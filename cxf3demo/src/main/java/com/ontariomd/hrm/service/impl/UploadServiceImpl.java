package com.ontariomd.hrm.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

import org.apache.cxf.helpers.IOUtils;

import com.ontariomd.hrm.service.UploadService;
import com.ontariomd.hrm.service.bean.upload.UploadMessageRequest;
import com.ontariomd.hrm.service.bean.upload.UploadMessageResponse;

@MTOM(enabled=true)
@WebService(endpointInterface = "com.ontariomd.hrm.service.UploadService", portName="UploadServicePort", serviceName="UploadService", targetNamespace = "http://schemas.ontariomd.com/hrm/upload")
public class UploadServiceImpl implements UploadService {

	public UploadMessageResponse uploadMessage(UploadMessageRequest request) {
		UploadMessageResponse response = new UploadMessageResponse();

		response.setResponseTransactionUid("UPL-" + System.currentTimeMillis());

		OutputStream out = null;

		try {
			out = new FileOutputStream(new File("c:/temp/q1"+request.getRequestTransactionUid()+".jpg"));
			
			
			IOUtils.copy(request.getMessageContent().getInputStream(), out);			
			
						
			out.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return response;
	}

}
