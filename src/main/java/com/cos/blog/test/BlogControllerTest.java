package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //스프링 com.cos.blog패키지 이하 스캔 -> 특정 어노테이션이 붙은 클래스 파일을 new해서 스프링 컨테이너에 관리해준다.
public class BlogControllerTest {
	
	//http://localhost:8081/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	} 
	
}
