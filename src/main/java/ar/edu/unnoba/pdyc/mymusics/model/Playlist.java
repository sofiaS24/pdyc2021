package ar.edu.unnoba.pdyc.mymusics.model;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.dom4j.tree.AbstractEntity;


@Entity
@Table(name="playlists")
public class Playlist extends AbstractEntity{
    
    private String name;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User propio;
    
    @ManyToMany
    @JoinTable(name = "playlists_songs",inverseJoinColumns = @JoinColumn(name = "song_id"))
    private List<Song> songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public User getPropio() {
		return propio;
	}

	public void setPropio(User propio) {
		this.propio = propio;
	}

	public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
    
}
