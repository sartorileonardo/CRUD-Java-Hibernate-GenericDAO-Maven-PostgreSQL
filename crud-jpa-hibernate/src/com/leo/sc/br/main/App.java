package com.leo.sc.br.main;

import java.util.List;

import com.leo.sc.br.entity.Client;
import com.leo.sc.br.service.GenericServiceImpl;
import com.leo.sc.br.service.IGenericService;
import com.leo.sc.br.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		
		//For Operations DELETE ALL, UPDATE, DELETE, you incoment lines respectives

		IGenericService<Client> clienteService = new GenericServiceImpl<Client>(Client.class, HibernateUtil.getSessionFactory());

		//Delete All Registers
		clienteService.deleteAll();

		//Create an client
		Client cliente = new Client();
		cliente.setName("Maria da Silva");
		cliente.setAge(22);
		cliente.setProfession("DBA");
		cliente.setSex("M");
		
		//Save
		clienteService.save(cliente);
		
		//Update
		cliente.setName("Teste Uptade Maria");
		//clienteService.update(cliente);
		
		//Delete
		clienteService.delete(cliente);

		//Show All 
		List<Client> clienteList = clienteService.getAll();
		if (clienteList != null) {
			for (Client c : clienteList) {
				System.out.println("Name: " + c.getName().toString());
				System.out.println("Age: " + c.getAge().toString());
				System.out.println("Profissão: " + c.getProfession().toString());
				System.out.println("Sex: " + c.getSex().toString());
				System.out.println("----------------------------------");
			}
		}
		

	}

}
