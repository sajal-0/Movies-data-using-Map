package ActorService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import ActorDao.ActorDao;
import Entity.Actor;

public class ActorService {

	ActorDao dao = new ActorDao();
//	Map<Integer, Map<String, List<Actor>>> yearWiseMovies = dao.allMoviesCastdb();
	Set<Integer> allyears = dao.allMoviesCastdb().keySet();
	Scanner sc = new Scanner(System.in);

	// Print all the movie year and cast
	public Map<String, List<Actor>> AllMovies() {

		Map<String, List<Actor>> moviesOfYear = new HashMap<String, List<Actor>>();
		for (int year : allyears) {
//			System.out.println(year);
			moviesOfYear.putAll(dao.allMoviesCastdb().get(year));
		}
		return moviesOfYear;
	}
	

	// Print all the cast in year movie
	public Set<String> findmoviesByYear() {

		Map<String, List<Actor>> moviesOfYear = dao.allMoviesCastdb().get(sc.nextInt());
		Set<String> set = moviesOfYear.keySet();

		return set;
	}
	

	public List<Actor> cast() {
		List<Actor> newList = dao.allMoviesCastdb().get(sc.nextInt()).get(sc.nextLine());
		return newList;
	}
	

	public List<String> actorMovieYear() {

		List<String> actorMovies = new ArrayList<>();

		for (int year : allyears) {
			// this print the year
			System.out.println(year);
			Map<String, List<Actor>> aaa = dao.allMoviesCastdb().get(year);

			// this print all the movies (movie_name , cast)
			System.out.println(aaa);
			for (String name : aaa.keySet()) {
				// this will give the name of movies
				System.out.println(name);
				List<Actor> cast = aaa.get(name);
				// this will only give the cast name
//				System.out.println(cast);

				for (Actor actor : cast) {
					if (actor.getName() == sc.next()) {
						String movieDetail = "Actor acted in: " + name;
						actorMovies.add(movieDetail);
					}
				}
//				System.out.println(name);
			}

		}
		return actorMovies;
	}

}
