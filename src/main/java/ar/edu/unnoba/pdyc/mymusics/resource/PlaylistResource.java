package ar.edu.unnoba.pdyc.mymusics.resource;

import ar.edu.unnoba.pdyc.mymusics.dto.AgregarCancionesLista;
import ar.edu.unnoba.pdyc.mymusics.dto.PlayListDTO;
import ar.edu.unnoba.pdyc.mymusics.dto.SongDTO;
import ar.edu.unnoba.pdyc.mymusics.model.Playlist;
import ar.edu.unnoba.pdyc.mymusics.model.Song;
import ar.edu.unnoba.pdyc.mymusics.service.PlaylistService;
import java.lang.reflect.Type;

import java.util.List;
import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;


@Path("/playLists")
public class PlaylistResource {
	
    @Autowired
    private PlaylistService playlistService;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPlaylists(){
        ModelMapper modelMapper = new ModelMapper();
        Type listType = new TypeToken<List<PlayListDTO>>(){}.getType();
        List<PlayListDTO> list = modelMapper.map(playlistService.getPlaylists(),listType);
        return Response.ok(list).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPlaylist(PlayListDTO PlayListDTO){
        ModelMapper modelMapper = new ModelMapper();
        Playlist playlist = modelMapper.map(PlayListDTO, Playlist.class);
        playlistService.create(playlist);
        return Response.ok().build();
    }
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePlaylist(@PathParam("id") Long id,PlayListDTO playlistDTO){
    	String nombreUsuario="";
        ModelMapper modelMapper = new ModelMapper();
        Playlist playlist = modelMapper.map(playlistDTO, Playlist.class);
        try{
        	playlistService.update(id,playlist,nombreUsuario);
            return Response.ok().build();
        }catch(Exception e){
            return Response.status(Response.Status.FORBIDDEN).build();
        }
        
    }
    
    @POST
    @Path("/{id}/songs")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addSong(@PathParam("id") Long id, SongDTO songDTO){
    	String nombreUsuario="";
        ModelMapper modelMapper = new ModelMapper();
        Song song = modelMapper.map(songDTO, Song.class);
        try{
            Playlist p = playlistService.addSong(id, song,nombreUsuario);
            AgregarCancionesLista pdto = modelMapper.map(p, AgregarCancionesLista.class);
            return Response.ok(pdto).build();
        }catch(Exception e){
            return Response.status(Response.Status.FORBIDDEN).build();
        }
    }
}