package com.member.lib.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.dao.LentDAO;
import com.member.lib.dao.impl.LentDAOImpl;
import com.member.lib.service.BookService;
import com.member.lib.service.LentService;

public class LentServiceImpl implements LentService {

	private LentDAO lentDAO = new LentDAOImpl();
	@Override
	public Map<String, Object> insertLent(Map<String, Object> lent) {
		Map<String, Object> rMap = new HashMap<>();
		int result = lentDAO.insertLent(lent);
		rMap.put("msg", (result==1)?"대여입력 성공":"대여입력 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public int updateLent(Map<String, Object> lent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteLent(int lNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> selectLentList(Map<String, Object> lent) {
		return lentDAO.selectLentList(lent);
	}

	@Override
	public Map<String, Object> selectLent(int lNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> selectNoLentBookList() {
		return lentDAO.selectNoLentBookList();
	}
	
//	public static void main(String[] args) {
//		LentService lentService = new LentServiceImpl();
//		Map<String,Object> map = new HashMap<>();
//		map.put("m_num", 2);
//		map.put("b_num", 2);
//		System.out.println(lentService.insertLent(map));
		
//		map.put("m_num", 2);
//		map.put("b_num", 2);
//		map.put("l_num", 41);
//		System.out.println(lentService.updateLent(map));
		
//		System.out.println(lentService.deleteLent(32));

//		List<Map<String,Object>> lentList = lentService.selectLentList(map);
//		for(Map<String,Object> mem:lentList) {
//			System.out.println(mem);
//		}
		
//		System.out.println(lentService.selectLent(1));
		
//	}
}
