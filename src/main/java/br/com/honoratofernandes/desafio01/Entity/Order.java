package br.com.honoratofernandes.desafio01.Entity;

import java.util.Objects;


public class Order {

	private Integer code;
	private double basic;
	private double discount;
	
	
	public Order() {
		super();
	}


	public Order(Integer code, double basic, double discount) {
		super();
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}


	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}


	public Double getBasic() {
		return basic;
	}


	public void setBasic(double basic) {
		this.basic = basic;
	}


	public Double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public int hashCode() {
		return Objects.hash(code);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(code, other.code);
	}
	
	
	

}
