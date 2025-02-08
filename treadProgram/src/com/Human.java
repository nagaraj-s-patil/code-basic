package com;

public class Human {

	 final Heart h;
	
	Human(Heart h){
		this.h=h;
	}
	
	public static void main(String[] args) {
		
		Heart h1=new Heart();
		
		Human m=new Human(h1);
	}
}
