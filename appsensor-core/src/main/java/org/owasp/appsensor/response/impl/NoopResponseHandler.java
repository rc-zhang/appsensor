package org.owasp.appsensor.response.impl;

import org.owasp.appsensor.Logger;
import org.owasp.appsensor.Response;
import org.owasp.appsensor.ResponseHandler;
import org.owasp.appsensor.ServerObjectFactory;

/**
 * This class is a simple NO-OP response handler. Calls to this response handler simply 
 * log the action to the configured logger. 
 * 
 * @author johnmelton
 */
public class NoopResponseHandler implements ResponseHandler {

	private static Logger logger = ServerObjectFactory.getLogger().setLoggerClass(NoopResponseHandler.class);
	
	@Override
	public void handle(Response response) {
		logger.debug("NO-OP response handler invoked for action: " + response.getAction());
	}

}