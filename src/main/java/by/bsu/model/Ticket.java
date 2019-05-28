package by.bsu.model;

public class Ticket {

	
	private int id_ticket;
	private String how_long;
	private double price;
	private int id_class_ticket;



	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int id) {
		super();
		this.id_ticket = id;
	}



	public int getId_class_ticket() {
		return id_class_ticket;
	}

	public void setId_class_ticket(int id_class_ticket) {
		this.id_class_ticket = id_class_ticket;
	}

	public int getId() {
		return id_ticket;
	}
	public void setId(int id) {
		this.id_ticket = id;
	}
	public String getHow_long() {
		return how_long;
	}
	public void setHow_long(String how_long) {
		this.how_long = how_long;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
