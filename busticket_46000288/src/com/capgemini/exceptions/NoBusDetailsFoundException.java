package com.capgemini.exceptions;

public class NoBusDetailsFoundException extends RuntimeException{
	public NoBusDetailsFoundException(String msg){
		super(msg);
	}

}
