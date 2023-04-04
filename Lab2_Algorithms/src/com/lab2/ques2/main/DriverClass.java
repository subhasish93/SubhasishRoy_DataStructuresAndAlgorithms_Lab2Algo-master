package com.lab2.ques2.main;

import java.util.Scanner;

import com.lab2.ques2.model.CurrencyDM;
import com.lab2.ques2.service.MergeSort;
import com.lab2.ques2.service.NotesCount;

public class DriverClass {

	public static void main(String[] args) {
		CurrencyDM curr = new CurrencyDM();
		MergeSort merge = new MergeSort();
		NotesCount notesCount = new NotesCount();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		curr.setNumberOfDenominations(sc.nextInt());
		
		System.out.println("Enter the currency denominations value");
		int[] notes = new int[curr.getNumberOfDenominations()];
		int temp = 0;
		while(temp < curr.getNumberOfDenominations()) {
			notes[temp] = sc.nextInt();
			temp++;
		}
		curr.setDenominationArray(notes);
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		merge.sort(notes, 0, notes.length-1);
		notesCount.currencyDistribution(curr, amount);
		
		sc.close();
	}

}
