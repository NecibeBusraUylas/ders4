package GameProject.Entities.Concrete;

import GameProject.Entities.Abstract.Entity;

public class Campaign implements Entity{

	private int id;
	private String name;
    private double amountOfDiscount;
    
	public Campaign(int id, String name, double amountOfDiscount) {
		this.id = id;
		this.name = name;
		this.amountOfDiscount = amountOfDiscount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmountOfDiscount() {
		return amountOfDiscount;
	}
	public void setAmountOfDiscount(double amountOfDiscount) {
		this.amountOfDiscount = amountOfDiscount;
	}
}