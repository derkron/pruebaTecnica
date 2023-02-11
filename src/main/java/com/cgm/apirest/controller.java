package com.cgm.apirest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping
public class controller {

    @GetMapping ("/example")
    public ResponseEntity<Object>index(){
        return ResponseEntity.ok("ok");
    }
}
