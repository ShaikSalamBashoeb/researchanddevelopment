package com.spring;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

	public DrawEvent(Object source) {
		super(source);
		System.out.println("Draw Event Constructor");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5723835234984578072L;

}
