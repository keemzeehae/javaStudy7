package com.jihye.s1.contact;

import java.util.Scanner;

public class FriendInfo {
	
	private Scanner sc;
	public FriendInfo() {
		sc= new Scanner(System.in);
	}
	
	public FriendDTO addFriend(){
		FriendDTO friendDTO = new FriendDTO();
		System.out.println("이름");
		friendDTO.setName(sc.next()); 
		System.out.println("메모");
		friendDTO.setMemo(sc.next());
		System.out.println("이메일");
		friendDTO.setEmail(sc.next());
		System.out.println("010제외한 전화번호");
		friendDTO.setNumber(sc.nextInt());
		System.out.println("생일");
		friendDTO.setBirth(sc.next());
		
		return friendDTO;
	}

}
