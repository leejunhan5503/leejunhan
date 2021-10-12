package org.clickMe.Member.model.service;

import static org.clickMe.common.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.clickMe.Member.model.dao.MemMapper;
import org.clickMe.common.model.dto.UserDTO;

/* service 부분에는 이상이 없음 */
	public class MemService {

	public List<UserDTO> selectAllUserList() {
		
		SqlSession sqlSession = getSqlSession();
		MemMapper memMapper = sqlSession.getMapper(MemMapper.class);
		List<UserDTO> userList = memMapper.selectAllUser();
		System.out.println(userList);
		
		// 매퍼 인터페이스 활용 remix
		sqlSession.close();
		
		return userList;
	}
//클리어
	public boolean insertUser(UserDTO user) {
		
		SqlSession sqlSession = getSqlSession();
		
		MemMapper memMapper = sqlSession.getMapper(MemMapper.class);
		
		int result = memMapper.insertUser(user);
		
		
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0 ? true : false;
	}

	public List<UserDTO> selectUserLogin() {
		SqlSession sqlSession = getSqlSession();
		MemMapper memMapper = sqlSession.getMapper(MemMapper.class);
		List<UserDTO> memList = memMapper.selectUserLogin();
		System.out.println(memList);
		sqlSession.close();
		
		return memList;
	}

}

