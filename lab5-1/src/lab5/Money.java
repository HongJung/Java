package lab5;

import java.text.DecimalFormat;

public class Money {

	// Create the attributes of the class: dollars, cents
	private long dollars, cents;

	// Create a constructor that accepts a double value representing a dollar
	// amount.
	// The constructor must separate the dollar value from the cents value and
	// assign the to the attributes of the class.
	// If the amount is negative, exit the applicatioin.
	public Money(double amount) {
		if (amount < 0) {
			System.out.println("Negative amount is not allowed.");
			System.exit(0);
		}

		DecimalFormat df = new DecimalFormat("0.00");
		String num = df.format(amount);
		int pos = num.indexOf(".");
		String d = num.substring(0, pos);
		String c = num.substring(pos + 1);

		this.dollars = Long.parseLong(d);
		this.cents = Long.parseLong(c);
	}

	// Create a method add that receives a Money amount as parameter and adds
	// the amount to the attributes of the class.
	// The method must return the new Money amount after the operation.
	public Money(Money object1) {
		this.dollars = object1.dollars;
		this.cents = object1.cents;
	}

	public Money add(Money amount) {
		long c = this.cents + amount.cents;
		long r = c % 100;
		this.cents = r;

		long d = this.dollars + amount.dollars;
		if (c > 100) {
			d++;
		}
		this.dollars = d;
		return new Money(this);
	}

	// Create a method subtract that receives a Money amount as parameter and
	// subtracts the amount from the attributes of the class.
	// The method must return the new Money amount after the operation

	public Money subtract(Money amount) {
		if (this.cents < amount.cents) {
			this.dollars--;
		}
		long d = this.dollars - amount.dollars;
		this.dollars = d;

		long c = (this.cents + 100) - amount.cents;
		this.cents = c;
		return new Money(this);
	}

	// Create the toString method to return the following String format:$
	// dolarAmount dollars and centsAmount cents.
	public String toString() {
		return "$" + this.dollars + "." + this.cents + "(" + this.dollars
				+ " dollars and" + this.cents + "cents)";
	}

	public int compareTo(Money object1) {
		if (this.dollars < object1.dollars) {
			return -1;
		} else if (this.dollars > object1.dollars) {
			return 1;
		} else if (this.cents < object1.cents) {
			return -1;
		} else if (this.cents > object1.cents) {
			return 1;
		} else {
			return 0;
		}
	}

}
