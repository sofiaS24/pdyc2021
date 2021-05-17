package ar.edu.unnoba.pdyc.mymusics.service;

import ar.edu.unnoba.pdyc.mymusics.model.Genre;
import ar.edu.unnoba.pdyc.mymusics.model.Song;
import java.util.List;

public interface SongService {
    public List < Song > getSongs(String author,Genre genre);
}

