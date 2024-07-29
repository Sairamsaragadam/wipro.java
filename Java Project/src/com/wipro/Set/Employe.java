package com.wipro.Set;

public class Employe implements Comparable<Employe> {
	public int emid;
	public String sname;
	
	public Employe(int emid, String sname) {
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
	public int compareTo(Employe other) {
		return Integer.compare(this.emid, other.emid);
	}
	@Override
    public String toString() {
        return emid + " " + sname;
    
}

}
