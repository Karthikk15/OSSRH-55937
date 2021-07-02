package GradleJenkins;

public class Employee {

private String _name;
private byte _age;
private String _country;
private int _id;

public String getName() {
	return _name;
}
public void setName(String value) {
	_name = value;
}
public byte getAge() {
	return _age;
}
public void setAge(byte value) {
	_age = value;
}
public String getCountry() {
	return _country;
}
public void setCountry(String value) {
	_country = value;
}

public int getId() {
	return _id;
}
public void setId(int value) {
	_id = value;
}

public String getEmployeeType() {
	return "Base Employee";
}

	
}
