package com.vaccineRegistration.exception;

import org.apache.tomcat.util.collections.SynchronizedQueue;

public class ServiceBookingException extends RuntimeException{
	
	private String errorMessage;
	private static final long serialVersionUID = 1L;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ServiceBookingException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	public ServiceBookingException() {
		super();
		
	}
	
	
	

}
