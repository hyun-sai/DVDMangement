package com.example.dvdmangement.controller;

import com.example.dvdmangement.dto.RequestDTO;
import com.example.dvdmangement.dto.ResponseDTO;
import com.example.dvdmangement.service.dvdService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import java.util.List;

@RestController
public class dvdController {
    private final dvdService dvdService;



    public dvdController(dvdService dvdService) {
        this.dvdService = dvdService;
    }

    @GetMapping("/dvdData")
        public List<ResponseDTO> getAllDvds(){

        return dvdService.getAllDvds();
        }

    @PostMapping("/rentMovie")
        public String rentMovie(@RequestBody RequestDTO request){

        String name = request.getUserName();
        Integer age = request.getUserAge();
        Integer movieId = request.getMovieId();
        String movieTitle = request.getMovieTitle();

        dvdService.rentMovie(name, age, movieId, movieTitle);

        return "{\"success\": true}";
    }
}
