package br.com.honoratofernandes.desafio01.services;

import org.springframework.stereotype.Service;

import br.com.honoratofernandes.desafio01.Entity.Order;

@Service
public class ShippingService {
	
	private double valorBasic = 0.0; 
	private double valorFrete = 0.0;;
	
	
	public ShippingService() {
	}


	public ShippingService(double valorBasic, double valorFrete) {
		super();
		this.valorBasic = valorBasic;
		this.valorFrete = valorFrete;
	}


	public double shipment(Order order) {
		valorBasic = order.getBasic();
		if (valorBasic < 100) { valorFrete = 20.0; } 
		else if ((valorBasic >= 100.0) & (valorBasic < 200.0)) { valorFrete = 12.0;}
		else { valorFrete = 0.0;}
		System.out.println(valorFrete);
		return valorFrete;	
	}
	
}
