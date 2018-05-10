package cn.ysyd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ysyd.mapper.PatientMapper;
import cn.ysyd.model.Patient;
@Service
public class PatientServiceImpl implements cn.ysyd.service.PatientService {
	@Autowired
	private PatientMapper patientMapper;

	public void insert(Patient patient) {

	}

	public void deleteById(Integer id) {

	}

	public Patient findById(Integer id) {
		Patient patient = patientMapper.selectByPrimaryKey(id);
		
		return patient;
	}

}
