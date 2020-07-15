package com.member.lib.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.member.lib.common.Connector;
import com.member.lib.dao.LentDAO;

public class LentDAOImpl implements LentDAO {

	@Override
	public int insertLent(Map<String, Object> lent) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Connector.open();
			String sql = "insert into lent(l_num, l_lentdate, m_num, b_num)";
			sql += " values(seq_lent_l_num.nextval,sysdate,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, lent.get("l_lentdate").toString());
			result = ps.executeUpdate();
			con.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) {
					ps.close();
				}
				if(con!=null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int updateLent(Map<String, Object> lent) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		return 0;
	}

	@Override
	public int deleteLent(int lNum) {
		// TODO Auto-generated method stub
		return 0;
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

}
