package com.example.add.Musico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musico")
public class MusicoController {

    @Autowired
    private MusicoService musicoService;


    @PostMapping("/add")
    public void add(@RequestBody final Musico musico){
        musicoService.add(musico);
    }

}
