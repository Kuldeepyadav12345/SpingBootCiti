package com.example.boot.service;

import org.springframework.stereotype.Service;

@Service("myNotificationService")
public class NotificatonService {
public NotificatonService()
{
	System.out.println("Notification Service Instanciated");
}
public void send()
{
	System.out.println("Snchronous Send() Invked....");
}
public void sendAsync()
{
	System.out.println("Asynchronozation send() invoked.......");
}

@Override
public String toString()
{
	return "Notification Service";
	
}
}
