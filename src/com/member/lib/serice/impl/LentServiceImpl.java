package com.member.lib.serice.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.dao.LentDAO;
import com.member.lib.dao.impl.LentDAOImpl;
import com.member.lib.serice.BookService;
import com.member.lib.serice.LentService;

public class LentServiceImpl implements LentService {

	private LentDAO lentDAO = new LentDAOImpl();
	@Override
	public Map<String, Object> insertLent(Map<String, Object> lent) {
		int result = lentDAO.insertLent(lent);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg", (result==1)?"성":"실");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> updateLent(Map<String, Object> lent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deleteLent(int lNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> selectLentList(Map<String, Object> lent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> selectLent(int lNum) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		LentService lentService = new LentServiceImpl();
		Map<String,Object> map = new HashMap<>();
		map.put("m_num", 1);
		map.put("b_num", 1);
		System.out.println(lentService.insertLent(map));
	}
}
