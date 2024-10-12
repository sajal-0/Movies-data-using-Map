package Controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import ActorDao.ActorDao;
import ActorService.ActorService;
import Entity.Actor;

public class ControllerActor {

	ActorService s = new ActorService();
	
	

	// All the cast
	public List<Actor> castOfAllMoviesOnly(int year,String name) {
		List<Actor> list = s.cast(year,name);
		return list;
	}

	// Find movies by actor name
	public List<String> actorMovieYearCon(String name) {
		List<String> ll = s.actorMovieYear(name);
		return ll;
	}

	// Get movies for specific year
	public Set<String> findmoviesByYearCon(int year) {
		Set<String> str = s.findmoviesByYear(year);
		return str;
	}

	// Print all the movies year and cast
	public Map<String, List<Actor>> AllMoviesCon() {
		Map<String, List<Actor>> allmovies = s.AllMovies();
		return allmovies;
	}

	// Find Actors by movies name
	public List<Actor> findActorByMovieCon(String movieName) {
		List<Actor> list = s.findActorByMovie(movieName);
		return list;
	}

	// List all Actor by year
	public Set<String> getAllActorByYearCon(int year) {
		Set<String> set = s.getAllActorByYear(year);
		return set;
	}

	// count total movies per year
	public int countMoviesPerYearCon(int year) {
		int count = s.countMoviesPerYear(year);
		return count;
	}

	// check if actor acted in specific year or not
	public boolean isActorActedInYearCon(int year, String nameOfActor) {
		boolean isActorActedInYear = s.isActorActedInYear(year, nameOfActor);
		return isActorActedInYear;
	}

}
