package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Interface.Client;
import Interface.ClientConveyor;

public class Start {
	public static void main(String[] args) {
		ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("all_context.xml");

		// Client1 client1 = (Client1) ApplicationContext.getBean("newclient");

		ClientConveyor ibClientConveyer = (ClientConveyor) ApplicationContext.getBean("ibClientConveyor");

		Client client1 = ibClientConveyer.createClient();
		Client client2 = ibClientConveyer.createClient();
		Client client3 = ibClientConveyer.createClient();

		System.out.println("Client 1 " + client1);
		System.out.println("Client 2 " + client2);
		System.out.println("Client 3 " + client3);
	}

}
