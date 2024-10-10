package com.Client;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Controller.ControllerActor;
import Entity.Actor;

public class Client {
	
	public static void main(String[] args) {
		
		
		ControllerActor c = new ControllerActor();
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("1. All the movies\n"+"2. Actor acted in movie\n"
		+"3. Movies of year and their cast\n"+"4. cast of all movies\n"+"6 Exit!!");
			
			int number = sc.nextInt();
			
			switch(number) {
			case 0:
				Map<String,List<Actor>> all = c.moviesAll();
				
				 System.out.println("All Movies and their Casts:");
                 for (Map.Entry<String, List<Actor>> entry : all.entrySet()) {
                     System.out.println("Movie: " + entry.getKey() + ", Cast: " + entry.getValue());
                 }
                 break;
			}
		
			
		}while(true);
	}

}
