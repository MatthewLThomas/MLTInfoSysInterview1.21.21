package com.example.demo.controller;

import com.example.demo.model.transmit;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @CrossOrigin
    @PostMapping(path = "form")
    public HttpStatus exampleMethod(@RequestBody transmit t){
        System.out.print(t.value);
        return HttpStatus.ACCEPTED;
    }

}
