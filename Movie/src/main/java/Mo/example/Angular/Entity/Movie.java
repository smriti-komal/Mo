package Mo.example.Angular.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="moive")
public class Movie {
	@Id
	private int movieRating;
	private String movieName;
	private String Genre;
	public int getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	@Override
	public String toString() {
		return "Movie [movieRating=" + movieRating + ", movieName=" + movieName + ", Genre=" + Genre + "]";
	}
	public Movie(int movieRating, String movieName, String genre) {
		super();
		this.movieRating = movieRating;
		this.movieName = movieName;
		Genre = genre;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
