package org.collections;

public class User implements Comparable<User> {
	private String name;
	private Integer mobileNumber;
	private String username;
	private String password;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, Integer mobileNumber, String username, String password) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int compareTo(User user) {
		if (this.mobileNumber < user.getMobileNumber())
			return -1;
		else if (this.mobileNumber > user.getMobileNumber())
			return 1;
		else

			return 0;

	}
}
