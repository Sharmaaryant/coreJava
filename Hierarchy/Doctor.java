package Hierarchy;

import java.util.Date;

public class Doctor extends Person{
private String RegistrationNo;

public Doctor(String name, String address, Date dob, String registrationNo) {
	super(name, address, dob);
	RegistrationNo = registrationNo;
}

public String getRegistrationNo() {
	return RegistrationNo;
}

}
