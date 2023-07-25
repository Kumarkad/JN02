package com.tnsif.dayone;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.rollNo=100;
		s1.name="Rocky";
		s1.m1=76;
		s1.m2=36;
		s1.m3=38;
		s1.show();
		
		Student s2=new Student(101,"Kumar",98,80,95);
		s2.show();

	}

}
