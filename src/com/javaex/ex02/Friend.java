package com.javaex.ex02;

public class Friend {

    private String name;
    private String hp;
    private String school;

   public Friend() {
	   
   }
   public Friend(String name, String hp, String school) {
	   this.name = name;
	   this.hp = hp;
	   this.school = school;
   }
@Override
public String toString() {
	return "이름:" + name + " 핸드폰:" + hp + " 학교:" + school;
}


}
