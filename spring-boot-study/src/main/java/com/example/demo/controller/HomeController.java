package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public HashMap<String, Object> index() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("abcaa", "ddeeed");
		
		return map;
  }
}
