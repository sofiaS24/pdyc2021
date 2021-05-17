package ar.edu.unnoba.pdyc.mymusics.service;



import ar.edu.unnoba.pdyc.mymusics.model.Genre;
import ar.edu.unnoba.pdyc.mymusics.model.Song;
import ar.edu.unnoba.pdyc.mymusics.repository.SongRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImp implements SongService{
    
    @Autowired
    private SongRepository songRepository;

    @Override
    public List<Song> getSongs(String autor, Genre genre) {
        return songRepository.findByAutorYGenero(autor, genre);
    }
}
