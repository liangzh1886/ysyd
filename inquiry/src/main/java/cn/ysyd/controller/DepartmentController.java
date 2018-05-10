package cn.ysyd.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.ysyd.model.Department;
import cn.ysyd.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/toAdd")
	public String toAdd(){
		return "department/add";
	}
	
	@PostMapping("/add")
	public String add(Department department,Model model){
		department.setCreateTime(new Date());
		departmentService.insert(department);
		return "redirect:list";
	}
	
	@GetMapping("/list")
	public String list(Model model){
		model.addAttribute("departmentList", departmentService.getAll());
		return "department/list";
	}
	
	@GetMapping("/toEdit")
	public String toEdit(@RequestParam(value="id",required=true) Integer id,Model model){
		Department department = departmentService.findById(id);
		model.addAttribute("department", department);
		return "department/edit";
	}
	
	@PostMapping("/edit")
	public String edit(Department department){
		Department dept = departmentService.findById(department.getId());
		dept.setName(department.getName());
		departmentService.update(dept);
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam(value="id",required=true)Integer id){
		departmentService.deleteById(id);
		return "redirect:list";
	}
}
