package com.company.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.FirstDao;
import com.company.entity.First;
import com.company.service.FirstService;

@Service
public class FirstServiceImpl implements FirstService{

	@Resource
	private FirstDao dao;
	
	@Override
	public List<First> first() {
		List<First> first = dao.first();
		return first;
	}

	
}
