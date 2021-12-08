package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	List<Friend> fList = new ArrayList<Friend>();
   
    	System.out.println("친구를 3명 등록해 주세요");
    	for(int i=0; i<3; i++) {
    		//친구의 정보를 입력받아 Friend 객체를 생성하고 이들을 ArrayList에 저장
    		String put = sc.nextLine();
    		String[] sArray = put.split(" ");
    		Friend f = new Friend(sArray[0],sArray[1], sArray[2]);
    		fList.add(f);
    	}
    	
    	//친구 객체를 화면에 출력
    	for(Friend f:fList) {
    		System.out.println(f.toString());
    	}
    	
    	sc.close();

    	
    	
    }

}
