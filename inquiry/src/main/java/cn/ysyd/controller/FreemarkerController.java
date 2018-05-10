package cn.ysyd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ysyd.model.Patient;
import cn.ysyd.service.PatientService;

@Controller
public class FreemarkerController {
	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/index")
	public String index(Model model){
		Patient patient = patientService.findById(1);
		model.addAttribute("patient", patient);
		return "index";
	}
}
