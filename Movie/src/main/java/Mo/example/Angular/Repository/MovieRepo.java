package Mo.example.Angular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Mo.example.Angular.Entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer>{
	

}
