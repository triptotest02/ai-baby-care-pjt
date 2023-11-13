package com.hackathon.abc.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.hackathon.abc.test.dto.TestDTO;

@Mapper
@Repository
public interface TestDAO {
	
	List<TestDTO> testSelect();
	
}
