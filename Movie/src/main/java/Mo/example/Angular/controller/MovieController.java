package Mo.example.Angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Mo.example.Angular.Entity.Movie;
import Mo.example.Angular.Service.MovieServices;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class MovieController {

	@Autowired
	private MovieServices movieservices;
	
	 @PostMapping("save-movie")  
	    public boolean saveStudent(@RequestBody Movie movie) {  
	         return movieservices.addmovie(movie);  
	          
	    }  
	      
	    @GetMapping("movie-list")  
	    public List<Movie> allMovie() {  
	         return movieservices.viewByGenre();  
	          
	    }  
}
