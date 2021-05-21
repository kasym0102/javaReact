package com.Controller;

import com.Entity.Log;
import com.Service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.HashMap;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/log")
public class DashboardController {

    @Autowired
    LogService logService;

    @GetMapping("/list")
    public ResponseEntity list(){
        return ResponseEntity.ok(logService.list());
    }

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody Log log){
        if(logService.add(log)){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.unprocessableEntity().build();
    }

    @GetMapping("/statistics")
    public HashMap<String,ResponseEntity> statistics() throws ParseException {
        return logService.statistics();
    }



}
