package com.company.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.company.dao.FirstDao;
import com.company.entity.First;

@Repository
public class FirstDaoImpl extends BaseDao<First> implements FirstDao{
	
	@Override
	public List<First> first() {
		 String hql = "from First";
		 List<First> list = list(hql);
		return list;
	}
	
}
