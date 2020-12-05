package org.collections;

public class TicketBooking {
	private String CustomerName;
	private Integer price;

	public TicketBooking() {

	}

	public TicketBooking(String customerName, Integer price) {
		super();
		CustomerName = customerName;
		this.price = price;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public int compareTo(TicketBooking ticketbooking) {
		if (this.price < ticketbooking.getPrice())
			return -1;
		else if (this.price > ticketbooking.getPrice())
			return 1;
		else

			return 0;

	}
}
