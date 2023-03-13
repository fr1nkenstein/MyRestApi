package com.example.typedataforstudep;

public class StudDep {
	private String name;
	private String dept_name;

	public StudDep(String name, String dept_name, String email) {
		super();
		this.name = name;
		this.dept_name = dept_name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudDep [name=" + name + ", dept_name=" + dept_name + ", email=" + email + "]";
	}

	private String email;

}
