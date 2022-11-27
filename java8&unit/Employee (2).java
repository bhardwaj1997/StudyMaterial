package com.collections;

public class Employee {
private int eid;
private String ename;
private String eadd;
private float esal;



@Override
public String toString() {
	return "Employee info :eid=" + eid + ", ename=" + ename + ", eadd=" + eadd + ", esal=" + esal + "]";
}
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int eid, String ename, String eadd, float esal) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.eadd = eadd;
	this.esal = esal;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEadd() {
	return eadd;
}
public void setEadd(String eadd) {
	this.eadd = eadd;
}
public float getEsal() {
	return esal;
}
public void setEsal(float esal) {
	this.esal = esal;
}

}
