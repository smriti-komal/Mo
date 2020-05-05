package Mo.example.Angular.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mo.example.Angular.Entity.Movie;
import Mo.example.Angular.Repository.MovieRepo;

@Service
public class MovieServices {

	@Autowired
	private MovieRepo movierepo;
	
	@Transactional
	public boolean addmovie(Movie movie)
	{
		return movierepo.save(movie) != null;
	}
	
	@Transactional
	public List<Movie> viewByGenre()
	{
		return movierepo.findAll();
	}
}
