package com.cjc.conroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@RequestMapping("/")
	public String prelogin()
	{
		return "Wel come";
	}

}
