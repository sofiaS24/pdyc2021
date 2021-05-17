package ar.edu.unnoba.pdyc.mymusics.resource;


import ar.edu.unnoba.pdyc.mymusics.dto.SongDTO;
import ar.edu.unnoba.pdyc.mymusics.model.Genre;

import ar.edu.unnoba.pdyc.mymusics.service.SongService;

import java.lang.reflect.Type;

import java.util.List;


import javax.ws.rs.GET;

import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;




@Path("/songs")
public class SongResource {
    @Autowired
    private SongService songService;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSongs(@QueryParam("author")String autor, @QueryParam("genre") Genre genre){
        ModelMapper modelMapper = new ModelMapper();
        Type listType = new TypeToken<List<SongDTO>>(){}.getType();
        List<SongDTO> list = modelMapper.map(songService.getSongs(autor, genre),listType);
        return Response.ok(list).build();
    }
}