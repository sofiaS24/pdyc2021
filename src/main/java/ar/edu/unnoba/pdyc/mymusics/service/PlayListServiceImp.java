package ar.edu.unnoba.pdyc.mymusics.service;

import ar.edu.unnoba.pdyc.mymusics.model.Playlist;
import ar.edu.unnoba.pdyc.mymusics.model.Song;
import ar.edu.unnoba.pdyc.mymusics.repository.PlayListRepository;
import ar.edu.unnoba.pdyc.mymusics.repository.SongRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlayListServiceImp implements PlaylistService{
    
    @Autowired
    private PlayListRepository playlistRepository;
    
    @Autowired
    private SongRepository songRepository;

 
    @Override
    public List<Playlist> getPlaylists() {
    	
       return playlistRepository.findAll();
    }

    @Override
    public Playlist create(Playlist playlist) {
        
        return playlistRepository.save(playlist);
    }
    
    @Override
    public Playlist find(Long id) {
        return playlistRepository.findById(id).get();
    }

    @Override
    @Transactional
    public Playlist update(Long id, Playlist playlist, String userEmail) throws Exception{
        Playlist p = playlistRepository.findById(id).get();
        if(!p.getPropio().getEmail().equals(userEmail)){
            throw new Exception();
        }
        p.setName(playlist.getName());
        return playlistRepository.save(p);
    }
    
    @Override
    @Transactional
    public Playlist addSong(Long id, Song song, String userEmail) throws Exception{
        Playlist p = playlistRepository.findById(id).get();
        if(!p.getPropio().getEmail().equals(userEmail)){
            throw new Exception();
        }
        song = songRepository.findById(id).get();
        p.getSongs().add(song);
        p = playlistRepository.save(p);
        return p;
    }

    @Override
    public void delete(Long id) {
        playlistRepository.deleteById(id);
    }
}
