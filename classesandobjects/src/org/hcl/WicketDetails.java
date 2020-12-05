package org.hcl;

public class WicketDetails {
	String playername;
	String bowlername;
	String wickettype;
	Long over;
	Long ball;

	public WicketDetails() {
		// TODO Auto-generated constructor stub
	}

	public WicketDetails(String playername, String bowlername, String wickettype, Long over, Long ball) {
		super();
		this.playername = playername;
		this.bowlername = bowlername;
		this.wickettype = wickettype;
		this.over = over;
		this.ball = ball;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getBowlername() {
		return bowlername;
	}

	public void setBowlername(String bowlername) {
		this.bowlername = bowlername;
	}

	public String getWickettype() {
		return wickettype;
	}

	public void setWickettype(String wickettype) {
		this.wickettype = wickettype;
	}

	public Long getOver() {
		return over;
	}

	public void setOver(Long over) {
		this.over = over;
	}

	public Long getBall() {
		return ball;
	}

	public void setBall(Long ball) {
		this.ball = ball;
	}

}
