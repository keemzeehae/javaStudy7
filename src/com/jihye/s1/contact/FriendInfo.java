package com.jihye.s1.contact;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class FriendInfo {
	
	private Scanner sc;
	
	public FriendInfo() {
		sc= new Scanner(System.in);
	}
	
	public FriendDTO remove(List<FriendDTO> ar) {
		
		System.out.println("삭제할 이름을 입력하세요");
		String friend = sc.next();
		
		boolean result = false;
		FriendDTO friendDTO = null;
		for (int i=0;i<ar.size();i++) {
			if(friend.equals(ar.get(i).getName())) {
				friendDTO = ar.get(i);
//				result = ar.remove(ar.get(i)); -> 방법2
//				friendDTO = ar.remove(i); -> 방법1
				break;
			}
		}return friendDTO;
	
		
	}
	
	public FriendDTO search(List<FriendDTO> ar) {
		System.out.println("검색할 이름을 입력하세요");
		String friend = sc.next();
		FriendDTO friendDTO = null;
		for(int i=0;i<ar.size();i++) {
			if (friend.equals(ar.get(i).getName())) {
				friendDTO = ar.get(i);
				
				break;
			}
				
		}return friendDTO;
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
		String s = sc.next();//20001224
		int year=Integer.parseInt(s.substring(0,4));
		int month = Integer.parseInt(s.substring(4,6));
		int date = Integer.parseInt(s.substring(6)); //끝까지 가져오니까 
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year,month-1, date,0,0,0);
		friendDTO.setBirth(calendar);
		
	
		return friendDTO;
	}

}
