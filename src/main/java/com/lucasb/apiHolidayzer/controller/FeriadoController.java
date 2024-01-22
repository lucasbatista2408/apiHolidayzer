package com.lucasb.apiHolidayzer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.lucasb.apiHolidayzer.model.Feriado;
import com.lucasb.apiHolidayzer.model.FeriadoDTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/holiday")
public class FeriadoController {

    @PostMapping
    public Feriado insertHoliday(@RequestBody FeriadoDTO feriadoData) {

        Feriado response = new Feriado(feriadoData.date(), feriadoData.holidayName());
        
        return response;
    }

    @GetMapping
    public String getAllHolidays() {

        return "todos os feriados";
    }
    
    
}
