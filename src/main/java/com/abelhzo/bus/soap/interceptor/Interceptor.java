package com.abelhzo.bus.soap.interceptor;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptorAdapter;

public class Interceptor extends ChannelInterceptorAdapter {

	public Message<?> preSend(Message<?> message, MessageChannel channel) {
		System.out.println("*************************************************");
		System.out.println("PRE ENVIANDO: " + channel.toString());
		System.out.println("PRE ENVIANDO: " + message.getPayload());
		System.out.println("*************************************************");
		return message;
	}
	
	public void postSend(Message<?> message, MessageChannel channel, boolean sent) {
		System.out.println("*************************************************");
		System.out.println("POST ENVIANDO: " + channel.toString());
		System.out.println("POST ENVIANDO: " + message.getPayload());
		System.out.println("*************************************************");
	}
	

	public boolean preReceive(MessageChannel channel) {
		System.out.println("*************************************************");
		System.out.println("PRE RECIBIENDO: " + channel.toString());
		System.out.println("*************************************************");
		return true;
	}

	public Message<?> postReceive(Message<?> message, MessageChannel channel) {
		System.out.println("*************************************************");
		System.out.println("POST RECIBIENDO: " + channel.toString());
		System.out.println("POST RECIBIENDO: " + message.getPayload());
		System.out.println("*************************************************");
		return message;
	}

}
