package org.clickMe.Member.controller;

import java.util.List;
import java.util.Map;
import org.clickMe.Member.model.service.MemService;
import org.clickMe.common.model.dto.UserDTO;

/* service로 정보를 전달한 컨트롤러 형성 */
	public class MemController {
		MemService memService = new MemService();
		
//		public void selectUserLogin(Map<String, String> inputUserLogin) {
//			
//			List<UserDTO> login = userService.selectUserLogin();
//			
//			if(!login.isEmpty()) {
//				for(UserDTO loginUser : login) {
//					System.out.println(loginUser);
//				}
//			} else {
//				System.out.println("로그인 성공.");
//			}
//		}

		public void selectUserLogin(UserDTO userLogin) {
			
			List<UserDTO> login = memService.selectUserLogin();
			
			if(!login.isEmpty()) {
				for(UserDTO loginUser : login) {
					System.out.println(loginUser);
				}
			} else {
				System.out.println("로그인 성공.");
			}
		}	
//		
		public void selectUserLogout(Map<String, String> inputUserLogout) {
			
		}

		public void selectUserId(Map<String, String> inputUserLostId) {
			
		}

		public void modifyUserPsw(Map<String, String> inputModifyPsw) {

		}
		public void selectAllUser(Object search) {
			// TODO Auto-generated method stub
			
		}

		
	

}
