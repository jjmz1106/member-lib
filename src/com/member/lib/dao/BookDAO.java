package com.member.lib.dao;

import java.util.List;
import java.util.Map;

public interface BookDAO {
	
	int insertBook(Map<String,Object> board);
	int updateBook(Map<String,Object> board);
	int deleteBook(int bNum);
	List<Map<String,Object>> selectBookList(Map<String,Object> board);
	Map<String,Object> selectBook(int bNum);

}
