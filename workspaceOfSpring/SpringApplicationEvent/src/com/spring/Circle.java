package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Circle implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	
	void draw() {
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	
	@Autowired
	public void setApplicationEventPublisher(ApplicationEventPublisher publisheer) {
		this.publisher = publisheer;

	}

}
