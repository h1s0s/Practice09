package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	List<Goods> gList = new ArrayList<Goods>();
    	int sum = 0;
    	
    	System.out.println("상품을 입력해주세요 (종료 q)");
    
    	while(true) {
    		String put = sc.nextLine();
    		if(put.equals("q")) {
    			System.out.println("[입력완료]");
    			System.out.println("=================");
    			for(Goods g:gList) {
    				System.out.println(g.showInfo());
    				sum = sum + g.getCount();
    			}
    			System.out.println("모든 상품의 갯수는 "+sum+"개 입니다.");
    			break;
    		}
    		String[] sArray = put.split(",");
    		String a01 = sArray[0];
    		int a02 = Integer.parseInt(sArray[1]);
    		int a03 = Integer.parseInt(sArray[2]);
    		
    		Goods g = new Goods(a01, a02, a03);
    		gList.add(g);
    		

    	}
    	
    	sc.close();
    }

}
