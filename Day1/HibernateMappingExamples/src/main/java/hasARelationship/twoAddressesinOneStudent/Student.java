package hasARelationship.twoAddressesinOneStudent;

import javax.annotation.processing.Generated;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int sid;

private String sname;
private int marks;

@Embedded
@AttributeOverrides({
	@AttributeOverride(name="state", column=@Column(name="Home_State")),
	@AttributeOverride(name="city", column = @Column(name="Home_City")),
	@AttributeOverride(name = "pincode", column = @Column(name="Home_PIN"))
})
private Address homeaddr;

@Embedded
@AttributeOverrides({
	@AttributeOverride(name = "city", column = @Column(name="Office_City")),
	@AttributeOverride(name="state", column=@Column(name="Office_State")),
	@AttributeOverride(name="pincode", column=@Column(name="Office_PIN")),
})
private Address officeaddr;



public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(String sname, int marks, Address homeaddr, Address officeaddr) {
	super();
	this.sname = sname;
	this.marks = marks;
	this.homeaddr = homeaddr;
	this.officeaddr = officeaddr;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

public Address getHomeaddr() {
	return homeaddr;
}

public void setHomeaddr(Address homeaddr) {
	this.homeaddr = homeaddr;
}

public Address getOfficeaddr() {
	return officeaddr;
}

public void setOfficeaddr(Address officeaddr) {
	this.officeaddr = officeaddr;
}

@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", homeaddr=" + homeaddr + ", officeaddr="
			+ officeaddr + "]";
}


}
