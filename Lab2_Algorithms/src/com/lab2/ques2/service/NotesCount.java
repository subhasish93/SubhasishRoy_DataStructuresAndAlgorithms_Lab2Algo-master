package com.lab2.ques2.service;

import com.lab2.ques2.model.CurrencyDM;

public class NotesCount {

	public void currencyDistribution(CurrencyDM c, int amount) {
		int[] notesDistribution = new int[c.getNumberOfDenominations()];
		int[] notes = c.getDenominationArray();
		try {
			for (int i = 0; i < c.getNumberOfDenominations(); i++) {
				if (amount >= notes[i]) {
					notesDistribution[i] = amount / notes[i];
					amount = amount - (notesDistribution[i] * notes[i]);
				}
			}
			if (amount > 0) {
				System.out.println("Exact amount cannot be given with highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < c.getNumberOfDenominations(); i++) {
					if (notesDistribution[i] != 0) {
						System.out.println(notes[i] + ":" + notesDistribution[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + "notes of denomination 0 is invalid");
		}
	}

}