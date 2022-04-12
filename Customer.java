package mypack;

public class Customer {
	
	private int customerid;
	private String name;
	private String address;
	private String line2;
	private String city;
	private String state;
	private String country;
	private String pin;
	private String phone;
	private String email;
	private Lawyer responlaw;
	
	public Customer(int customerid, String name, String address, String line2, String city, String state, String country,
			String pin, String phone, String email, Lawyer responlaw) {
		super();
		this.customerid = customerid;
		this.name = name;
		this.address = address;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
		this.phone = phone;
		this.email = email;
		this.responlaw = responlaw; //Responsible lawyer for that customers case
		
	}
	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Lawyer getResponlaw() {
		return responlaw;
	}

	public void setResponlaw(Lawyer responlaw) {
		this.responlaw = responlaw;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", name=" + name + ", address=" + address + ", line2=" + line2
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pin=" + pin + ", phone=" + phone
				+ ", email=" + email +  ", responlaw=" + responlaw+ "]";
	}
	
}
