package com.tnsif.daytwo;

public class JN02BatchDriver {

	public static void main(String[] args) {
		System.out.println("--------------- In Main------------------------");
		System.out.println(JN02Batch.getCollegeName());
		System.out.println(JN02Batch.getSsTrainer());
		System.out.println(JN02Batch.getTtTrainer());
		
		JN02Batch s1,s2,s3;
		 s1=new JN02Batch("100","kumar","Computer",1236547890);
		 System.out.println(s1);
		 

	}

}
