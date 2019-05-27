package shanka.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
    @GeneratedValue
	private int cartid;
	private int itemid;
	private String itemname;
	private double price;
	public Cart() {	
	}
	
	public Cart(int cartid, int itemid, String itemname, double price) {
		super();
		this.cartid = cartid;
		this.itemid = itemid;
		this.itemname = itemname;
		this.price = price;
	}
	public int getcartID() {
		return cartid;
	}
	public void setcartID(int cartid) {
		this.cartid = cartid;
	}
	public int getitemID() {
		return itemid;
	}
	public void setitemID(int itemid) {
		this.cartid = itemid;
	}
	public String getitemname() {
		return itemname;
	}
	public void setitmname(String itemname) {
		this.itemname = itemname;
	}public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
}
