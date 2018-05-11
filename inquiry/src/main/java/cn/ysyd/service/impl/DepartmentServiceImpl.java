package cn.ysyd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ysyd.mapper.DepartmentMapper;
import cn.ysyd.model.Department;
import cn.ysyd.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;

	public int insert(Department department) {
		return departmentMapper.insert(department);
	}

	public int deleteById(Integer id) {
		return departmentMapper.deleteByPrimaryKey(id);
	}


	public Department findById(Integer id) {
		return departmentMapper.selectByPrimaryKey(id);
	}
	
	public List<Department> getAll() {
		return departmentMapper.selectByExample(null);
	}
	
	public int update(Department department){
		return departmentMapper.updateByPrimaryKey(department);
	}
	
	public int test(){
		return 1;
	}

}
