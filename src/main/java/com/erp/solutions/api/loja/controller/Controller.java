package com.erp.solutions.api.loja.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class Controller {


    @GetMapping(value = "/world", produces = "application/json")
    public ResponseEntity<String> runTest(){
        return ResponseEntity.ok("Chamada efetuada com sucesso");
    }


}
