package com.Tree;

import java.util.Scanner;

public class Program 
 {
	static Scanner sc=new Scanner(System.in);
	static int menuList()
	{
		System.out.println("\n1.Insert");
		System.out.println("2.Print");
		System.out.println("Enter Your Choice");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		int choice;
		Operations op=new Operations();
		while ((choice=menuList())!=0) 
		{
			switch (choice) {
			case 1:
				System.out.println("Enter Data to insert");
				op.insert(sc.nextInt());
				
				break;
			case 2:
				op.inorder();
				break;
			default:
				break;
			}
			
		}
		
	}
}
