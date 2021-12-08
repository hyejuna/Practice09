package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	List<Goods> gList = new ArrayList<Goods>();
    	int sum = 0;
    	
    	System.out.println("상품을 입력해주세요(종료q)");
    	
    	while(true) {
    		String gInfo = sc.nextLine();
    		if(gInfo.equals("q")) {
    			break;
    		} else {
    			String[] gArray = gInfo.split(",");
    			Goods g = new Goods(gArray[0], Integer.parseInt(gArray[1]), Integer.parseInt(gArray[2]));
    			gList.add(g);
    			sum = sum + g.getCount();
    			
    		}
    	}
    	
    	System.out.println("[입력완료]");
    	System.out.println("=======================");
    	
    	for(Goods g : gList) {
    		g.showInfo();
    	}
    	System.out.println("모든 상품의 갯수는 " +sum+ "개입니다.");
    	
    	
    	
    	sc.close();
       
    }

}
