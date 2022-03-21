package com.sageIt.movie.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sageIt.movie.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {	

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		System.out.println("MovieController ::: getMovieInfo() started");
		Map<String, Movie> movies = getMovie();
		return movies.get(movieId);
		
	}
	
	private Map<String,Movie> getMovie() {
		
		Map<String, Movie> movies = new HashMap<String, Movie>();
		Movie movie1 = new Movie("123", "Dhoom3", " movie is in hindi ");
		Movie movie2 = new Movie("5678", "Krish", " movie is in english");
		Movie movie3 = new Movie("4321", "Akanda" , "movie is in telugu");
		movies.put("123", movie1);
		movies.put("5678", movie2);
		movies.put("4321", movie3);
		return movies;
	}

}
