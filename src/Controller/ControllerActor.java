package Controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import ActorDao.ActorDao;
import ActorService.ActorService;
import Entity.Actor;

public class ControllerActor {
	
		
		ActorService s = new ActorService();
		
		//print movies of perticular actor
		public List<String> actoractedIn(){
			List<String> ll = s.actorMovieYear();
			return ll;
		}
		
		//Print all the movies
		public Map<String,List<Actor>> moviesAll(){
			Map<String,List<Actor>> allmovies = s.AllMovies();
			return allmovies;
		}
		
		// Print all the movies in a perticular year and cast of that movie
		public Set<String> printMoviesOfYear() {
			Set<String> str = s.findmoviesByYear();
			return str;
		}
		
		
		//All the cast
		public List<Actor> castOfAllMoviesOnly(){
			List<Actor> list = s.cast();
			return list;
		}
		
		


	

}
