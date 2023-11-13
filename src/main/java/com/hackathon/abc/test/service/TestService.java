package com.hackathon.abc.test.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon.abc.test.dao.TestDAO;
import com.hackathon.abc.test.dto.TestDTO;

@Service
@Transactional
public class TestService {
	
	@Autowired
	TestDAO dao;
	
	public List<TestDTO> testSelect() {
		return dao.testSelect();
	}
	
}
