package com.example.helloworld.app.echo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("echo")
public class EchoController {
	
	@ModelAttribute
	public EchoForm setUpEchoForm() {
		EchoForm form = new EchoForm();
		return form;
	}
	
	@RequestMapping
	public String index(Model model) {
		return "echo/index";
	}
	
	@RequestMapping(value="Hello", method=RequestMethod.POST)
	public String Hello(Model model, EchoForm form) {
		
		model.addAttribute("name",form.getName());
		return "echo/hello";
	}
}
