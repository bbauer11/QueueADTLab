
public class Customer {

	private int transactionTime, customerNumber, arrivalTime;
	
	public Customer(int arrivalTime, int transactionTime, int customerNumber) {
		this.customerNumber = customerNumber;
		this.transactionTime = transactionTime;
		this.arrivalTime = arrivalTime;
	}


	public int getTransactionTime() {
		return this.transactionTime;
	}

	public int getArrivalTime() {
		return this.arrivalTime;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

}
