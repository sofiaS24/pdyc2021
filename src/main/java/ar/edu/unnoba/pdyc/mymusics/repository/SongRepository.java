package ar.edu.unnoba.pdyc.mymusics.repository;


	
import ar.edu.unnoba.pdyc.mymusics.model.Genre;
import ar.edu.unnoba.pdyc.mymusics.model.Song;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
	
	

	
@Repository("songRepository")
public interface SongRepository extends JpaRepository<Song,Long>{
      List<Song> findByAutorYGenero(String autor, Genre genre);
}


