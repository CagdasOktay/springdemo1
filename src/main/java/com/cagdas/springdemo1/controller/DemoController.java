package com.cagdas.springdemo1.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/name")
    public String GetName(){
        return "Cagdas";

    }
    @GetMapping("/isim")
    public ResponseEntity<String>getName(){
        return ResponseEntity.ok("Fikret");
    }

    @GetMapping("/getallnames")
    public List<String>getallnames(){
        List<String> names = new ArrayList<>();
        names.add("Çağdaş");
        names.add("Peri");
        names.add("Nil");
        names.add("Deniz");

        return names;
    }

    @GetMapping("/Allnames")
    public ResponseEntity<List<String>>Allnames(){
        List<String>names = new ArrayList<>();
        names.add("CAGDAS");
        names.add("PERİ");
        names.add("Nil");
        names.add("Deniz");

        return ResponseEntity.ok(names);
    }

}
