package com.leelaavathi.assignment5;

public class TicketBooking {
	// Private attributes
	private String stageEvent;
	private String customer;
	private Integer noOfSeats;


	// Default constructor
	public TicketBooking() {
	}


	// Parameterized constructor
	public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
	this.stageEvent = stageEvent;
	this.customer = customer;
	this.noOfSeats = noOfSeats;
	}


	// Getters and Setters
	public String getStageEvent() {
	return stageEvent;
	}


	public void setStageEvent(String stageEvent) {
	this.stageEvent = stageEvent;
	}


	public String getCustomer() {
	return customer;
	}


	public void setCustomer(String customer) {
	this.customer = customer;
	}


	public Integer getNoOfSeats() {
	return noOfSeats;
	}


	public void setNoOfSeats(Integer noOfSeats) {
	this.noOfSeats = noOfSeats;
	}


	// Helper to format one digit after decimal point
	private String fmt(double amount) {
	return String.format("%.1f", amount);
	}


	// --- Function Overloading for Payments ---


	// 1) Cash payment
	public String makePayment(double amount) {
	return "Amount " + fmt(amount) + " paid in cash";
	}


	// 2) Wallet payment
	public String makePayment(double amount, String walletNumber) {
	return "Amount " + fmt(amount) + " paid using wallet \nnumber " + walletNumber;
	}


	// 3) Credit card payment
	public String makePayment(String cardHolderName, double amount, String creditCardType, String ccv) {
	StringBuilder sb = new StringBuilder();
	sb.append("Holder name:").append(cardHolderName).append('\n');
	sb.append("Amount ").append(fmt(amount)).append(" paid using ")
	.append(creditCardType).append(" \ncard\n");
	// The sample output shows the word 'card' at the end of the amount line and CCV on a new line.
	// To exactly match, avoid extra words and newlines beyond what's needed.
	// Adjusting to precisely match the sample format below in Main printing instead.
	return sb.toString();
	}


	// Display booking details as per sample output
	}