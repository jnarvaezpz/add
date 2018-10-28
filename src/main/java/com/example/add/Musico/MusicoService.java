package com.example.add.Musico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MusicoService {

    @Autowired
    private MusicoRepository musicoRepository;

    public void add(Musico musico){
        musicoRepository.save(musico);
    }
}

