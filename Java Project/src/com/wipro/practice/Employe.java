package com.wipro.practice;

public class Employe {
	public Integer emid;
	public String name;
	
	public Employe(Integer emid, String name) {
		this.emid=emid;
		this.name=name;
	}
	public Integer getEmid() {
		return emid;
	}
	
	public String getName() {
        return name;
    }
	
	@Override
    public String toString() {
		return emid + " " + name;
	}
	

}
