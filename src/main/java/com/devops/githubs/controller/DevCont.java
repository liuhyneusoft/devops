package com.devops.githubs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/test")
public class DevCont {
	@ApiOperation(value = "get scenarios", notes = "get scenarios")
	@RequestMapping(value = "/a", method = { RequestMethod.GET })
	public String a()  {
		return "test1";
	}
}
