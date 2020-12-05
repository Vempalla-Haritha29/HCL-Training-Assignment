package org.Exception;

public class EventType {
	private Long id;
	private String name;

	public EventType() {

	}

	public EventType(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		System.out.println("id:" + this.id);
		System.out.println("name:" + this.name);
		return name;

	}
}
