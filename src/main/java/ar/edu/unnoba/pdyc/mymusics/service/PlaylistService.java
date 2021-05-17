package ar.edu.unnoba.pdyc.mymusics.service;

import ar.edu.unnoba.pdyc.mymusics.model.Playlist;
import ar.edu.unnoba.pdyc.mymusics.model.Song;
import java.util.List;


public interface PlaylistService {
    public List < Playlist > getPlaylists();
    
    public Playlist create(Playlist playlist);
    
    public Playlist find(Long id);
    
    public Playlist update(Long id,Playlist playlist, String userEmail) throws Exception;
    
    public Playlist addSong(Long id, Song song,String userEmail) throws Exception;
    
    public void delete(Long id);
}