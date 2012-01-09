/* Copyright 2010 University of Cambridge
 * Licensed under the Educational Community License (ECL), Version 2.0. You may not use this file except in 
 * compliance with this License.
 *
 * You may obtain a copy of the ECL 2.0 License at https://source.collectionspace.org/collection-space/LICENSE.txt
 */
package org.collectionspace.chain.csp.persistence.services.connection;

import org.apache.commons.httpclient.HttpMethod;

public class ReturnedNone implements Returned {
	private int status;
	
	public void setResponse(HttpMethod method, int status) throws Exception {
		this.status=status;
	}
	
	public int getStatus() { return status; }
}
