package com.jihye.s1.contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendUtil {

	public void choose() {

		Scanner sc = new Scanner(System.in);
		boolean check = true;
		FriendInfo friendInfo = new FriendInfo();
		FriendView friendView = new FriendView();
		ArrayList<FriendDTO> ar = new ArrayList<>();
		while (check) {
			System.out.println("1. 전체 출력");
			System.out.println("2. 사람 검색");
			System.out.println("3. 명단 추가");
			System.out.println("4. 명단 삭제");
			System.out.println("5. 종료");
			System.out.println("번호를 선택하세요!!!");
			int choose = sc.nextInt();

			if (choose == 1) {
				System.out.println("1번 전체출력 선택");
				friendView.view(ar);

			} else if (choose == 2) {
				System.out.println("2번 검색 선택");
				if (ar != null) {
					FriendDTO friendDTO = friendInfo.search(ar);
					friendView.view(friendDTO);
				} else {
					System.out.println("검색하신 이름이 없습니다");
				}
			} else if (choose == 3) {
				System.out.println("3번 명단추가 선택");
				FriendDTO friendDTO = friendInfo.addFriend();
				ar.add(friendDTO);
				System.out.println(ar);
			} else if (choose == 4) {
				System.out.println("4번 명단삭제 선택");
			} else {
				System.out.println("Finish");
				break;
			}
		}
	}

}
