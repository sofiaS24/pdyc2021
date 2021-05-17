package ar.edu.unnoba.pdyc.mymusics.repository;

import org.springframework.stereotype.Repository;

import ar.edu.unnoba.pdyc.mymusics.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository("playListRepository")
public interface PlayListRepository extends JpaRepository<Playlist,Long>{
      List<Playlist> findByName(String name);
}