package com.example.demo.exception;

public class NoDataFoundException extends RuntimeException{
	
	public NoDataFoundException(String msg) {
		super(msg);
	}
}
