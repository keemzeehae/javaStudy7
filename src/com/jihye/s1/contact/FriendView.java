package com.jihye.s1.contact;


import java.util.List;

public class FriendView {
	
	public void view(List<FriendDTO> ar) {
		
		for(int i=0; i<ar.size();i++) {
			this.view(ar.get(i));
			
			
		}
		
		//선생님 코드
//		for(int i=0; ar.size();i++) {
//			FriendDTO freindDTO = ar.get(i); -> 생성과 선언 같이 
//			System.out.println("이름: "+friendDTO.getName());
//			System.out.println("메모: "+friendDTO.getMemo());
//			System.out.println("이메일: "+friendDTO.getEmail());
//			System.out.println("전화번호: "+friendDTO.getNumber());
//			System.out.println("생일: "+friendDTO.getBirth());
//			System.out.println("=================================");
//			
//		}
		
	}
	
	public void view(FriendDTO friendDTO) {
		//이름, 별명, 이메일, 전화번호, 생일
	
		System.out.println("이름: "+friendDTO.getName());
		System.out.println("메모: "+friendDTO.getMemo());
		System.out.println("이메일: "+friendDTO.getEmail());
		System.out.println("전화번호: "+friendDTO.getNumber());
		System.out.println("생일: "+friendDTO.getBirth());
		System.out.println("=================================");
	}
	
	
	
	
	public void message(String str) {
		System.out.println("==============================");
		System.out.println(str);
		System.out.println("==============================");
	}

}
