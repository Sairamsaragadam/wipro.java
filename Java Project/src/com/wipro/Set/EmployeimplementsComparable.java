package com.wipro.Set;

public class EmployeimplementsComparable {
	
	public int emid;
	public String sname;
	
	public EmployeimplementsComparable(int emid, String sname) {
		this.emid=emid;
		this.sname=sname;
	}
	public int getEmid() {
		return emid;
	}
	
	public String getSname() {
        return sname;
    }
	@Override
	public int compareTo(EmployeimplementsComparable other) {
		return Integer.compare(this.emid, other.emid);
	}
	@Override
    public String toString() {
        return emid + " " + sname;
    
}
	}
 