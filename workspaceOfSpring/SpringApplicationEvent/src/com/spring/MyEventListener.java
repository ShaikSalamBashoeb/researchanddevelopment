package com.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<DrawEvent>{

	public void onApplicationEvent(DrawEvent event) {
		System.out.println("MyEventListener.onApplicationEvent()"+event.toString());
		
	}

	/*public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		System.out.println("MyEventListener.onApplicationEvent()");
		
	}*/

}
