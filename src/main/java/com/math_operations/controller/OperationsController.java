package com.math_operations.controller;

import com.math_operations.model.domain.Operations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationsController {

    private Operations operations = new Operations();

    @GetMapping("/sum/{num1}/{num2}")
    Operations sum(@PathVariable int num1, @PathVariable int num2){
       operations.sum(num1, num2);
       return operations;
    }

    @GetMapping("/subtract/{num1}/{num2}")
    Operations subtract(@PathVariable int num1, @PathVariable int num2){
        operations.subtract(num1, num2);
        return operations;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    Operations multiply(@PathVariable int num1, @PathVariable int num2){
        operations.multiply(num1, num2);
        return operations;
    }

    @GetMapping("/divide/{num1}/{num2}")
    Operations divide(@PathVariable int num1, @PathVariable int num2){
        operations.divide(num1, num2);
        return operations;
    }

    @GetMapping("/exponentiation/{num1}/{num2}")
    Operations exponentiation(@PathVariable int num2, @PathVariable int num1){
        operations.exponentiation(num1, num2);
        return operations;
    }

}
