package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {



    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "hello " + name + "!" ;
    }


    @GetMapping("/")
    String hello2(@RequestParam String name) {
        return "hello " + name + "!" ;
    }

    @GetMapping("/goodbye/{id}/{age}")
    String goodbye(@PathVariable  Integer id, @PathVariable  Integer age) {
        return "goodbye " + id + age + " see you soon!";
    }
    @PostMapping("/farewell")
    String farewell (@RequestBody Farewell farewell) {
        return "Goodbye, " + farewell.name + "!";
    }

    @PostMapping("/Goodbye")
    public String Person (@RequestBody Person person) {
        System.out.println(person.getFirstName() );
        return "Goodbye, " + person.getFirstName() + "!";
    }

}
