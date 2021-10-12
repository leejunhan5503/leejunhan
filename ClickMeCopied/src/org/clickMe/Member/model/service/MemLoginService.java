package org.clickMe.Member.model.service;

import org.apache.ibatis.session.SqlSession;
import org.clickMe.Member.model.dao.MemMapper;
import org.clickMe.common.model.dto.UserDTO;
import static org.clickMe.common.Template.getSqlSession;

public class MemLoginService {

public boolean userSignup(UserDTO user) {
		
		SqlSession sqlSession = getSqlSession();
		
		MemMapper userMapper = sqlSession.getMapper(MemMapper.class);
		
		int result = userMapper.insertUser(user);
		
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0 ? true : false;
		
	}
}
