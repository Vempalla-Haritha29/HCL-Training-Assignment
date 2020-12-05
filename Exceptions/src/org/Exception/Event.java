package org.Exception;

public class Event {
	private String name;
	private String detail;
	private String ownername;
	private Long typeid;

	public Event() {

	}

	public Event(String name, String detail, String ownername, Long typeid) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownername = ownername;
		this.typeid = typeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public Long getTypeid() {
		return typeid;
	}

	public void setTypeid(Long typeid) {
		this.typeid = typeid;
	}

	public String toString() {
		System.out.println("name:" + this.name);
		System.out.println("detail:" + this.detail);
		System.out.println("ownername:" + this.ownername);
		System.out.println("typeid:" + this.typeid);
		return detail;
	}
}
