package cn.ysyd.service;

import cn.ysyd.model.Patient;

public interface PatientService {
	public void insert(Patient patient);
	
	public void deleteById(Integer id);
	
	public Patient findById(Integer id);
	
	
	
}
