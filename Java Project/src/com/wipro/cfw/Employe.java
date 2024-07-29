package com.wipro.cfw;

import java.util.Comparator;

public class Employe  {
	public Integer emid;
	public String name;
	
	public Employe(Integer emid, String name) {
		this.emid=emid;
		this.name=name;
	}
	public Integer getEmid() {
		return emid;
	}
	
	public String getname() {
        return name;
    }
	
	@Override
    public String toString() {
        return  emid + " " + name;
    
}

}



		
