package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        
        for(int i =0; i<3; i++)
        {
        	friendArray[i] = new Friend();
        	friendArray[i].setInfo(sc.next(),sc.next(),sc.next());
        }
       
        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo();
        }

        sc.close();
    }

}
