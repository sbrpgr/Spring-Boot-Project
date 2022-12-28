package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {
		
		@GetMapping("http/get")
		public String getTest(@RequestParam int id) {
			return "get요청"+id;
		}
		@GetMapping("http/post")
		public String postTest() {
			return "포스트 요청";
		}
		@GetMapping("http/put")
		public String putTest() {
			return "풋 요청";
		}
		@GetMapping("http/delete")
		public String deleteTest() {
			return "딜리트 요청";
		}
}
