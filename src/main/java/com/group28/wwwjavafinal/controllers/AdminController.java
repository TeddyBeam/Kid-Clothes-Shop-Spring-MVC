package com.group28.wwwjavafinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping(value = "/admin")
	public String openAdminPage() {
		return "admin/adminHome";
	}
}
