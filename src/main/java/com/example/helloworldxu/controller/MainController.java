package com.example.helloworldxu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * 主页控制器.
 */
@Controller
public class MainController {
	
	
	@GetMapping("/*/")
	public String index(Model model) {		
		model.addAttribute("getusername", "rp");		
		return "index";
	}

	
}
