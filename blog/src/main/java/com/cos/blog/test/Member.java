package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

	private String id;
	private String username;
	private String password;
	private String email;
	
	
	
}
