package com.zdq.controller;

import com.zdq.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "123";
	}
	
	@RequestMapping("/main")
	public String main(String name,Model model){
		logger.info("controller hello {}",name);
		model.addAttribute("msg",demoService.say(name));
		return "main";
	}
}

