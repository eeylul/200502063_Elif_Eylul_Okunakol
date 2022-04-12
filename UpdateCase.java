package mypack;

public class UpdateCase {
	private int updateid;
	private String caseno;
	private String connected;
	private String lasthearing;
	private String nexthearing;
	private String status;
	private String title;
	private String court;
	
	public UpdateCase() {
		
	}
	
	public UpdateCase(int updateid, String caseno,String connected, String lasthearing,
			String nexthearing, String status, String court) {
		super();
		this.updateid = updateid;
		this.setCaseno(caseno);
		this.connected = connected;
		this.lasthearing = lasthearing;
		this.nexthearing = nexthearing;
		this.status = status;
		this.court = court;
	}
	public int getUpdateid() {
		return updateid;
	}
	public void setUpdateid(int updateid) {
		this.updateid = updateid;
	}
	
	public String getCaseno() {
		return caseno;
	}

	public void setCaseno(String caseno) {
		this.caseno = caseno;
	}
	
	public String getConnected() {
		return connected;
	}
	public void setConnected(String connected) {
		this.connected = connected;
	}

	public String getLasthearing() {
		return lasthearing;
	}
	public void setLasthearing(String lasthearing) {
		this.lasthearing = lasthearing;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}




}
