package mypack;

public class Case {
	private int caseid;
	private String caseno;
	private String dateinstitution;
	private String datesummon;
	private String title;	
	private String designation;
	private String court;
	private String state;
	private String counter;
	private String address;
	private String cateogry;
	private String nexthearing;
	private String status;
	private Payment payment;
	private UpdateCase updatecase;
	private Lawyer lawyer;
	
	public Case() {
		
	}
	
	public Case(int caseid, String caseno, String dateinstitution, String datesummon, String title, String designation, String state,String court,
			String counter, String address,String status, Payment payment, Lawyer lawyer, UpdateCase updatecase) {
		super();
		this.caseid = caseid;
		this.caseno = caseno;
		this.court = court;
		this.dateinstitution = dateinstitution;
		this.datesummon = datesummon;
		this.title = title;

		this.designation = designation;
		this.state = state;
		this.counter = counter;
		this.address = address;
		this.status = status;
		this.payment = payment;
		this.lawyer = lawyer;
		this.updatecase = updatecase;
	}

	public int getCaseid() {
		return caseid;
	}

	public void setCaseid(int caseid) {
		this.caseid = caseid;
	}

	public String getCaseno() {
		return caseno;
	}
	public void setCaseno(String caseno) {
		this.caseno = caseno;
	}
	
	public String getDateinstitution() {
		return dateinstitution;
	}

	public void setDateinstitution(String dateinstitution) {
		this.dateinstitution = dateinstitution;
	}

	public String getDatesummon() {
		return datesummon;
	}

	public void setDatesummon(String datesummon) {
		this.datesummon = datesummon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounter() {
		return counter;
	}

	public void setCounter(String counter) {
		this.counter = counter;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCateogry() {
		return cateogry;
	}

	public void setCateogry(String cateogry) {
		this.cateogry = cateogry;
	}

	public String getNexthearing() {
		return nexthearing;
	}

	public void setNexthearing(String nexthearing) {
		this.nexthearing = nexthearing;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public UpdateCase getUpdatecase() {
		return updatecase;
	}

	public void setUpdatecase(UpdateCase updatecase) {
		this.updatecase = updatecase;
	}

	public Lawyer getLawyer() {
		return lawyer;
	}

	public void setLawyer(Lawyer lawyer) {
		this.lawyer = lawyer;
	}



	public String toString() {
//		return view case no. with title 
		return caseno;
	}
	
}
