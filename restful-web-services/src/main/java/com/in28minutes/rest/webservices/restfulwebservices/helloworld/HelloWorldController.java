package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String helloWorld()
    {
        return "hello";
    }
    @GetMapping("/hello-world-bean")
        public HelloWorldBean helloWorldBean()
        {
            throw new RuntimeException("Some Error has Happend! ");
            //return new HelloWorldBean("Hello World Bean");
        }
        @GetMapping("/hello-world/path-variable/{name}")
        public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
        {
            return new HelloWorldBean(String.format("Hello World,%s", name));
        }
}
