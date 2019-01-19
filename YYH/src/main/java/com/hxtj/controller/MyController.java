package com.hxtj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/myspringboot")
public class MyController {
	//返回成功
	@GetMapping("/success")
	public String get() {
		return "success";
	}

}
