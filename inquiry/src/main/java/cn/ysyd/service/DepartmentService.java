package cn.ysyd.service;

import java.util.List;

import cn.ysyd.model.Department;

public interface DepartmentService {
	public int insert(Department department);
	
	public int deleteById(Integer id);
	
	public Department findById(Integer id);
	
	public List<Department> getAll();
	
	public int update(Department department);
}
