package com.example.boot.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.service.NotificatonService;

@RestController
public class MessageController {
private NotificatonService notificationService;

/*
@Autowired
// Setter method of injecting the beans 
public void setNotificationService(NotificatonService notificationService) {
	System.out.println("Setter method invoked");
	this.notificationService = notificationService;
}
*/
/*public MessageController()
{
	notificationService= new NotificatonService();
	
	// Manual way of creating the object for dependency injection 
}*/

@Autowired //Constructor injection Here autowire is wiring NotificationService bean into messageController
public MessageController(NotificatonService notificationService)
{
	System.out.println("Invoked through Constructor inection");
	this.notificationService=notificationService;
	
	// Manual way of creating the object for dependency injection 
}
@RequestMapping("/")
public String home()
{
	notificationService.send();
	return "Welcome to messageController";
}
}
