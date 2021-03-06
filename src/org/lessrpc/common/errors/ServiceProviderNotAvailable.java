package org.lessrpc.common.errors;

import org.lessrpc.common.info.ServiceInfo;

public class ServiceProviderNotAvailable extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceProviderNotAvailable(ServiceInfo<?> info) {
		super("NameService didn't return an ServiceProviderInfo for service: " + info);
	}

}
