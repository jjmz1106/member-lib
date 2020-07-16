package com.member.lib.serice.impl;

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
		int result = lentDAO.insertLent(lent);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg", (result==1)?"대여정보 입력 성공":"실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> updateLent(Map<String, Object> lent) {
		int result = lentDAO.updateLent(lent);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg", (result==1)?"대여정보 업데이트 성공":"대여정보 업데이트 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> deleteLent(int lNum) {
		int result = lentDAO.deleteLent(lNum);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg", (result==1)?"대여정보 삭제 성공":"대여정보 삭제 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public List<Map<String, Object>> selectLentList(Map<String, Object> lent) {
		return lentDAO.selectLentList(lent);
	}

	@Override
	public Map<String, Object> selectLent(int lNum) {
		return lentDAO.selectLent(lNum);
	}
	public static void main(String[] args) {
		LentService lentService = new LentServiceImpl();
		Map<String,Object> map = new HashMap<>();
//		map.put("m_num", 1);
//		map.put("b_num", 1);
//		System.out.println(lentService.insertLent(map));
		
//		map.put("m_num", "1");
//		map.put("b_num", "1");
//		map.put("l_num", 23);
//		System.out.println(lentService.updateLent(map));
		
//		System.out.println(lentService.deleteLent(32));

//		List<Map<String,Object>> lentList = lentService.selectLentList(map);
//		for(Map<String,Object> mem:lentList) {
//			System.out.println(mem);
//		}
		
		System.out.println(lentService.selectLent(1));
		
	}
}
