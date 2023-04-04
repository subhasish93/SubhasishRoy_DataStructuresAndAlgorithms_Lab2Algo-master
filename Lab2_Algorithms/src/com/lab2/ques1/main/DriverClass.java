package com.lab2.ques1.main;

import java.util.Scanner;

import com.lab2.ques1.model.Transactions;
import com.lab2.ques1.service.TransactionsService;

public class DriverClass {

	public static void main(String args[]) {
		Transactions tr = new Transactions();
		TransactionsService trs = new TransactionsService();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		tr.setNumberOfTransactions(sc.nextInt());
		
		int temp = 0;
		int[] array = new int[tr.getNumberOfTransactions()];
		System.out.println("Enter the values of array");
		while(temp < tr.getNumberOfTransactions()) {
			array[temp] = sc.nextInt();
			temp++;
		}
		tr.setTransactionArray(array);
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		tr.setTargetCount(sc.nextInt());
		for(temp = 0; temp<tr.getTargetCount(); temp++) {
			System.out.println("Enter the value of target");
			tr.setTarget(sc.nextInt());
			trs.checkTarget(tr);
		}
		
		sc.close();
	}

}