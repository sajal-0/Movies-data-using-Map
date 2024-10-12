package com.Client;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import Controller.ControllerActor;
import Entity.Actor;

public class Client {
	
	public static void main(String[] args) {
		
		
		ControllerActor c = new ControllerActor();
		Scanner sc = new Scanner(System.in);
		
		
		
		
		do {
			
			System.out.println("Available Options ");
			System.out.printf("0 to find movies by Actor Name \n"+"1 to get movies for specific year \n"+
			"2 to print all the movies and cast \n"+"3 to find actors by movie name \n"+"4 get all actors acted in specific year \n"+
			"5 count movies per year\n"+"6 to check if the actor is acted in specific year or not\n" +"7 to exit...!");
			System.out.println();
			
			int option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			case 0 :
				List<String> li = c.actorMovieYearCon("Shradhha Kapoor");
				for(String name : li) {
					System.out.println("Shradhha Kapoor : "+name);
				}
				break;
			case 1 :
				
				Set<String> set = c.findmoviesByYearCon(sc.nextInt());
				for(String am : set) {
					System.out.println(am);
				}
				break;
				
			case 2 :
				Map<String,List<Actor>> l3 = c.AllMoviesCon();
				for(String st1 : l3.keySet()) {
					List<Actor> values = l3.get(st1);
					System.out.println(st1+" : ");
					for(Actor actor : values) {
						System.out.println(actor);
					}
				}
				break;
			case 3 :
				List<Actor> act = c.findActorByMovieCon("Pushpa");
				for(Actor ac : act) {
					System.out.println(ac);
				}
				break;
			case 4 :
				
				Set<String> gg = c.getAllActorByYearCon(2024);
				for(String str : gg) {
					System.out.println(str);
				}
				break;
			case 5 :

				int dd = c.countMoviesPerYearCon(2024);
				System.out.println(dd);
				break;
				
			case 6 : 
				boolean ff = c.isActorActedInYearCon(2024, "shradhha kapoor");
				System.out.println(ff);
				break;
			case 7 : 
				System.exit(0);
				
				
				
			}
			
		}while(true);
		
		

		
		
	
		
		
		
		
		
		
		
	}

}
