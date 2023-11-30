package com.FirstApp2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myview")
public class MyViewResolver{
	@Value("${my.loc}")
	private String location;
	@Value("${my.exe}")
	private String extension;
	@Override
	public String toString() {
		return "MyViewResolver [location=" + location + ", extension=" + extension + "]";
	}
	
}

