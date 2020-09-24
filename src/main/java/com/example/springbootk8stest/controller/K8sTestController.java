package com.example.springbootk8stest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lct
 * @Description
 * @create 2020-09-23 11:22
 */
@RestController
public class K8sTestController {

	@RequestMapping("/hello")
	public String say(){
		return "Hello K8S";
	}
}
