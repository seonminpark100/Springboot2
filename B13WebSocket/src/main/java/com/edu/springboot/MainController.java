package com.edu.springboot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController
{
	
	@GetMapping("/notview")
	@ResponseBody
	public String main() {
		return "view 없이 컨트롤러에서 즉시 출력";
	}
	
	@GetMapping("/")
	public String home(){
		return "home";
	}
	@RequestMapping("/chatMain.do")
	public String chatMain() {
		return "chatMain";
	}
	@RequestMapping("/chatWindow.do")
	public String chatWindow() {
		return "chatWindow";
	}
}
