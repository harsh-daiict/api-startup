package com.example.demo.response;

import com.example.demo.enums.Message;
import com.example.demo.enums.Status;

public class Response {
	
	private Status status;
	
	private Object data;
	
	private String msg;
	
	private Response(Status status, Object data, String msg)  {
		this.status = status;
		this.data = data;
		this.msg = msg;
	}

	public Status getStatus() {
		return status;
	}

	public Object getData() {
		return data;
	}

	public String getMsg() {
		return msg;
	}
	
	public static ResponseBuilder success() {
		return new ResponseBuilder(Status.SUCCESS);
	}
	
	public static ResponseBuilder error() {
		return new ResponseBuilder(Status.FAILURE);
	}
	
	public static Response empty() {
		return new ResponseBuilder(Status.SUCCESS).build();
	}
	
	public static class ResponseBuilder {

		Object data;
		
		String msg;
		
		Status status;
		
		private ResponseBuilder(Status status) {
			this.status = status;
		}

		public ResponseBuilder data(Object data) {
			this.data = data;
			return this;
		}

		public ResponseBuilder msg(String msg) {
			this.msg = msg;
			return this;
		}
		
		public ResponseBuilder msg(Message msg) {
			this.msg = msg.getMsg();
			return this;
		}
		
		public Response build() {
			return new Response(status, data, msg);
		}
	}
	
}
