
package br.com.honoratofernandes.desafio01;

import java.util.Locale;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.honoratofernandes.desafio01.Entity.Order;
import br.com.honoratofernandes.desafio01.services.OrderService;
import br.com.honoratofernandes.desafio01.services.ShippingService;

@SpringBootApplication
@ComponentScan({ "br.com.honoratofernandes" })
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	public OrderService serv;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Integer cod;
		double basic;
		double discount;

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Codigo: ");
		cod = Integer.parseInt(sc.next());
		
		System.out.println("Valor Básico: ");
		sc.nextLine();
		
		basic = Double.parseDouble(sc.nextLine());
		System.out.println("Valor do Desconto: ");
		
		discount = sc.nextDouble();
		Order order = new Order(cod, basic, discount);
		
		double valorfinalpedido = serv.total(order);
		System.out.println("Valor do Pedido = " + valorfinalpedido);

		sc.close();
	}

}
