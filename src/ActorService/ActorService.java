package ActorService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import ActorDao.ActorDao;
import Entity.Actor;

public class ActorService {

	ActorDao dao = new ActorDao();
	// allmovies
	Map<Integer, Map<String, List<Actor>>> yearWiseMovies = dao.allMoviesCastdb();

	// keys of all movies (years)
	Set<Integer> allyears = yearWiseMovies.keySet();


	
	
	
	// print cast of particular year of particular Movie
	public List<Actor> cast(int year,String name) {
		List<Actor> newList = yearWiseMovies.get(year).get(name);
		return newList;
	}
	
	

	// Find movies by actor name
	public List<String> actorMovieYear(String actorName) {

		List<String> actorMovies = new ArrayList<>();

		for (int year : allyears) {
			// this print the year
//			System.out.println(year);
			Map<String, List<Actor>> aaa = yearWiseMovies.get(year);

			// this print all the movies (movie_name , cast)
//			System.out.println(aaa);
			for (String name : aaa.keySet()) {
				// this will give the name of movies
//				System.out.println(name);

				List<Actor> cast = aaa.get(name);
				// this will only give the cast name
				// System.out.println(cast);

				for (Actor actor : cast) {
					
					if (actor.getName() == actorName) {
						
						String movieDetail = "Actor acted in " + name;
						actorMovies.add(movieDetail);
					}
				}
				// System.out.println(name);
			}

		}
		return actorMovies;
	}
	
	

	// Get movies for specific year
	public Set<String> findmoviesByYear(int year) {

		Map<String, List<Actor>> moviesOfYear = yearWiseMovies.get(year);
		Set<String> set = moviesOfYear.keySet();

		return set;
	}
	
	

	// Print all the movies year and cast
	public Map<String, List<Actor>> AllMovies() {

		Map<String, List<Actor>> moviesOfYear = new HashMap<String, List<Actor>>();

		for (int yearsMovies : allyears) {
			// System.out.println(year);
			moviesOfYear.putAll(yearWiseMovies.get(yearsMovies));
		}
		return moviesOfYear;
	}
	
	

	// Find Actors by movies name
	public List<Actor> findActorByMovie(String movieName) {

		for (int yearMovies : allyears) {
			Map<String, List<Actor>> actorsInMovies = yearWiseMovies.get(yearMovies);
			if (actorsInMovies.containsKey(movieName)) {
				return actorsInMovies.get(movieName);
			}
		}
		System.out.println("Movie not found ...");
		return new ArrayList<>();
	}
	
	

	// List all Actor by year
	public Set<String> getAllActorByYear(int year) {
		Set<String> namesOfactor = new HashSet<>();
		if (yearWiseMovies.containsKey(year)) {
			Map<String, List<Actor>> actorsInMovies = yearWiseMovies.get(year);
			for (String name : actorsInMovies.keySet()) {
				List<Actor> allActors = actorsInMovies.get(name);
				for (Actor actor : allActors) {
					namesOfactor.add(actor.getName());
				}
			}
		}
		return namesOfactor;
	}
	
	

	// count total movies per year
	public int countMoviesPerYear(int year) {
		if (yearWiseMovies.containsKey(year)) {
			return yearWiseMovies.size();
		} else {
			System.out.println("No movies found for this year ..");
			return 0;
		}
	}
	
	

	// check if actor acted in specific year or not
	public boolean isActorActedInYear(int year, String nameOfActor) {
		if (yearWiseMovies.containsKey(year)) {
			Map<String, List<Actor>> actorsInMovies = yearWiseMovies.get(year);
			for (String name : actorsInMovies.keySet()) {
				List<Actor> allActors = actorsInMovies.get(name);
				for (Actor actor : allActors) {
					if (actor.getName().equalsIgnoreCase(nameOfActor)) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
