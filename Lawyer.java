package mypack;

import java.util.ArrayList;
import java.util.Collection;



public class Lawyer extends Personal {
	
	
	private Collection<Case> cases=new ArrayList<Case>();
	

	public Lawyer() {
		super();

		
	}
	
	public Collection<Case> getCases() {
		return cases;
	}

	public void setCases(Collection<Case> cases) {
		this.cases = cases;
	}
	


	

}
