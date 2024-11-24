package br.com.honoratofernandes.desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.honoratofernandes.desafio01.Entity.Order;

@Service
public class OrderService {

	@Autowired
	public ShippingService shippingService;

	public OrderService() {
	}

	public double total(Order order) {
		return order.getBasic() - (order.getBasic() * order.getDiscount() / 100) + shippingService.shipment(order);
	}


}
