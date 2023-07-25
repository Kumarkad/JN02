package com.tnsif.dayone;

public class Student {
	int rollNo;
	String name;
	int m1,m2,m3;
	float per;
	
	Student(){
		System.out.println("Default Constructor");
	}
	Student(int rollNo, String name, int m1, int m2, int m3)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	
	}
	void show()
	{
		per=(m1+m2+m3)/3.0f;
		System.out.println("-------------Student  information------------");
		System.out.println("Roll No : "+rollNo+"\tName : "+name+"\tM1 : "+m1+"\tM2 : "+m2+"\tM3 : "+m3+"\tPercentage : "+per);
	}
}
