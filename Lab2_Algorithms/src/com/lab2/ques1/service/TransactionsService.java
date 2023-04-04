package com.lab2.ques1.service;

import com.lab2.ques1.model.Transactions;

public class TransactionsService {

	public void checkTarget(Transactions t) {
		int sumTransactions = 0;
		boolean targetMet = false;
		int[] transactions = t.getTransactionArray();
		
		for(int i=0; i<t.getNumberOfTransactions(); i++) {
			sumTransactions = sumTransactions + transactions[i];
			if(sumTransactions >= t.getTarget()) {
				System.out.println("Target achieved after " + (i+1) + " transactions.");
				targetMet = true;
				break;
			}
		}
		
		if(!targetMet) {
			System.out.println("Given target is not achieved.");
		}
	}

}
