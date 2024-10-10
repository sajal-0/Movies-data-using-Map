package ActorDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Entity.Actor;

public class ActorDao {

	Map<Integer, Map<String, List<Actor>>> yearWiseMovies = new HashMap<Integer, Map<String, List<Actor>>>();

	Map<String, List<Actor>> moviesbd2024 = new HashMap<String, List<Actor>>();
	Map<String, List<Actor>> moviesbd2023 = new HashMap<String, List<Actor>>();
	Map<String, List<Actor>> moviesbd2022 = new HashMap<String, List<Actor>>();
	Map<String, List<Actor>> moviesbd2021 = new HashMap<String, List<Actor>>();

	public Map<Integer, Map<String, List<Actor>>> allMoviesCastdb() {

//		Set<String> nameOFMovie = moviesbd2024.keySet();

		List<Actor> streecast = new ArrayList<Actor>();
		streecast.add(new Actor("RajKumar Rao", 34, "Male"));
		streecast.add(new Actor("Shradhha Kapoor", 29, "Female"));
		streecast.add(new Actor("Pankaj Tripathi", 44, "Male"));
		streecast.add(new Actor("RajKumar Rao", 34, "Male"));
		moviesbd2024.put("Stree", streecast);

		List<Actor> bhediyaCast = new ArrayList<Actor>();
		bhediyaCast.add(new Actor("Shradhha Kapoor", 29, "Female"));
		bhediyaCast.add(new Actor("Varun Dhawan", 36, "Male"));
		bhediyaCast.add(new Actor("Kriti Sanon", 33, "Female"));
		bhediyaCast.add(new Actor("Abhishek Banerjee", 35, "Male"));
		bhediyaCast.add(new Actor("Deepak Dobriyal", 47, "Male"));
		bhediyaCast.add(new Actor("Paalin Kabak", 30, "Male"));
		moviesbd2024.put("Bhediya", bhediyaCast);

		List<Actor> pushpaCast = new ArrayList<Actor>();
		pushpaCast.add(new Actor("Shradhha Kapoor", 29, "Female"));
		pushpaCast.add(new Actor("Allu Arjun", 41, "Male"));
		pushpaCast.add(new Actor("Rashmika Mandanna", 28, "Female"));
		pushpaCast.add(new Actor("Fahadh Faasil", 41, "Male"));
		pushpaCast.add(new Actor("Jagadeesh Prathap Bandari", 36, "Male"));
		pushpaCast.add(new Actor("Sunil", 49, "Male"));
		moviesbd2021.put("Pushpa", pushpaCast);

		List<Actor> kgfCast = new ArrayList<Actor>();
		kgfCast.add(new Actor("Yash", 37, "Male"));
		kgfCast.add(new Actor("Sanjay Dutt", 64, "Male"));
		kgfCast.add(new Actor("Raveena Tandon", 49, "Female"));
		kgfCast.add(new Actor("Srinidhi Shetty", 30, "Female"));
		kgfCast.add(new Actor("Prakash Raj", 58, "Male"));
		moviesbd2022.put("KGF2", kgfCast);

		List<Actor> leoCast = new ArrayList<Actor>();
		leoCast.add(new Actor("Vijay", 49, "Male"));
		leoCast.add(new Actor("Sanjay Dutt", 64, "Male"));
		leoCast.add(new Actor("Trisha Krishnan", 40, "Female"));
		leoCast.add(new Actor("Arjun Sarja", 61, "Male"));
		leoCast.add(new Actor("Gautham  Menon", 50, "Male"));
		moviesbd2023.put("Leo", leoCast);

		List<Actor> pathaanCast = new ArrayList<Actor>();
		pathaanCast.add(new Actor("Shah Rukh Khan", 58, "Male"));
		pathaanCast.add(new Actor("Deepika Padukone", 37, "Female"));
		pathaanCast.add(new Actor("John Abraham", 51, "Male"));
		pathaanCast.add(new Actor("Dimple Kapadia", 66, "Female"));
		pathaanCast.add(new Actor("Ashutosh Rana", 56, "Male"));
		moviesbd2023.put("Pathaan", pathaanCast);

		yearWiseMovies.put(2024, moviesbd2024);
		yearWiseMovies.put(2023, moviesbd2023);
		yearWiseMovies.put(2022, moviesbd2022);
		yearWiseMovies.put(2021, moviesbd2021);

		return yearWiseMovies;

	}

}
