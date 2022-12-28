package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
    public @ResponseBody String root_test() throws Exception{
        return "Hello World";
    
}}
