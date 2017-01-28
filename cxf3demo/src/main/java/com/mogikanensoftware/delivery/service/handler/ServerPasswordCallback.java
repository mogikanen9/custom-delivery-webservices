package com.mogikanensoftware.delivery.service.handler;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class ServerPasswordCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {
    	
    	System.out.println("ServerPasswordCallback...");
    	
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];

        System.out.println("pc.getIdentifier()->"+pc.getIdentifier());
        System.out.println("pc.getPassword()->"+pc.getPassword());
        System.out.println("pc.getType()->"+pc.getType());
        System.out.println("pc.getAlgorithm()->"+pc.getAlgorithm());
        
        
        if ("joe".equals(pc.getIdentifier())) {
           pc.setPassword("joespassword23"); 
        }
    }
       
}
