package mypack;

public class Payment {
	private int paymentid;
	private long total;
	private long paid;
	private long balance;
	private String type;
	private String bill;
	private String remarks;
	
	public Payment() {
		
	}
	
	
	

	public Payment(int paymentid, long total, long paid, long balance, String type, String bill, String remarks) {
		super();
		this.paymentid = paymentid;
		this.total = total;
		this.paid = paid;
		this.balance = balance;
		this.type = type;
		this.bill = bill;
		this.remarks = remarks;
		
	}


	public int getPaymentid() {
		return paymentid;
	}


	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}


	public long getTotal() {
		return total;
	}


	public void setTotal(long total) {
		this.total = total;
	}


	public long getPaid() {
		return paid;
	}


	public void setPaid(long paid) {
		this.paid = paid;
	}


	public long getBalance() {
		return balance;
	}


	public void setBalance(long balance) {
		this.balance = balance;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getBill() {
		return bill;
	}


	public void setBill(String bill) {
		this.bill = bill;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}

