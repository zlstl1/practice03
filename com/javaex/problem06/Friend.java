package com.javaex.problem06;

public class Friend {

    private String name;
    private String hp;
    private String school;

    public void setInfo(String name,String hp,String school)
    {
    	this.name = name;
    	this.hp = hp;
    	this.school = school;
    } 
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
