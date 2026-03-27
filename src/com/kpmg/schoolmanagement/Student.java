package com.kpmg.schoolmanagement;

public class Student {
	private int id;
	private String name;
	private String mailId;
	private double percentage;
	private static String schoolName;

	public Student(int id) {
		if (id >= 100) {
			this.id = id;
		}
		System.out.println(this);
	}
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public Student(String name,int id)
	{
		this(id,name);
	}

	// setter - write
	public void setName(String name) {
		this.name=name;
	}

	// getter - read
	public String getName() {
		return name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		
		if(mailId.contains("@global.com"))
		{
			this.mailId = mailId;
		}
	}

}
