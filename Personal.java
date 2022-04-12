package mypack;

public class Personal {
	private int personalid;       // unique and auto incerement
	private String name;
	private String surname;
	private String address;
	private String line2;
	private String city;
	private String state;
	private String country;
	private String pin;
	private String phone;
	private String email;	
	private String birthday;
	private char job;             // l for lawyer , p for paralegal, s for secretar

	public Personal() {
		
	}

	public Personal(int personalid, String name, String surname, String address, String line2, String city, String state, String country,
			String pin, String phone, String email, String birthday, char job) {
		super();
		this.personalid = personalid;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
		this.phone = phone;
		this.email = email;
		this.birthday = birthday;
		this.setJob(job);
	}
	
	public int getPersonalid() {
		return personalid;
	}

	public void setPersonalid(int personalid) {
		this.personalid = personalid;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public char getJob() {
		return job;
	}

	public void setJob(char job) {
		this.job = job;
	}

	public String getFullname() {
		return name + surname ;
	}
	
	@Override
	public String toString() {
		return "Personal [ personalid =" + personalid +", name=" + name + "surname= + surname +, address=" + address + ", line2=" + line2
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pin=" + pin + ", phone=" + phone
				+ ", email=" + email +  ", birthday=" + getBirthday()+"]";
	}



	
}
	

