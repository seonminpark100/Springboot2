package com.edu.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.springboot.mybatis.ISearchRadius;

@Controller
public class MainController {

	@Autowired
	ISearchRadius dao;
	
	@RequestMapping("/notview")
	@ResponseBody
	public String main() {
		return "View 없이 컨트롤러에서 즉시 출력";
	}
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	private static final String apikey = "AIzaSyADLRXzGCH1Ub0JuMgl3tEfd2g38uHr52g";
	
	@GetMapping("/01GeoLocation.do")
	public String geoFunc1(Model model) {
		return "01GeoLocation";
	}
	
	@GetMapping("/02GoogleMap.do")
	public String geoFunc2(Model model) {
		model.addAttribute("apikey", apikey);
		return "02GoogleMap";
	}
	@GetMapping("/03MyLocation.do")
	public String geoFunc3(Model model) {
		model.addAttribute("apikey", apikey);
		return "03MyLocation";
	}
}
 