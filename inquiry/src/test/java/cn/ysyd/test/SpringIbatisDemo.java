package cn.ysyd.test;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ysyd.mapper.PatientMapper;
import cn.ysyd.model.Patient;

public class SpringIbatisDemo {
	ApplicationContext app = null;
	@Before
	public void init(){
		app = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	
	@Test
	public void save(){
		SqlSessionFactory factory = app.getBean("sqlSessionFactory",SqlSessionFactory.class);
		Patient patient = new Patient();
		patient.setCreateTime(new Date());
		patient.setPass("123456");
		patient.setRealname("zhangsan");
		patient.setUsername("zs");
		
		SqlSession session = factory.openSession();
		PatientMapper mapper = session.getMapper(PatientMapper.class);
		mapper.insert(patient);
		
		session.close();
		
	}
}
