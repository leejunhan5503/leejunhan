package org.clickMe.Member.model.dao;

import java.util.List;

import org.clickMe.common.model.dto.UserDTO;

/* DAO 역할을 하는 LoginMapper 생성 */
	public interface MemMapper {
	
	/* 암호화 처리 된 비밀번호 조회용 메소드(로그인 확인용) */
		
	List<UserDTO> selectAllUser();
	
	UserDTO selectUserLogin(int code);
	List<UserDTO> selectUserLogin();
	int selectUserId(int id);
	int modifyUserPsw(int psw);

	int selectUserLogout(UserDTO logout);
	int insertUser(UserDTO user);
	
	





		
}