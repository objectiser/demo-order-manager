package org.hawkular.apm.example.ordermgr.orders;

public class Account {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + "]";
	}

}
