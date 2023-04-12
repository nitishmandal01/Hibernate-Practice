package hasARelationship;

import javax.annotation.processing.Generated;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Employee {
	
@Id	
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int eid;
private String  ename;
private int salary;

@Embedded
private Address addr;


public Employee() {
	super();
}

public Employee(String ename, int salary, Address addr) {
	this.ename = ename;
	this.salary = salary;
	this.addr = addr;
}


public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public Address getAddr() {
	return addr;
}

public void setAddr(Address addr) {
	this.addr = addr;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", addr=" + addr + "]";
}


}
