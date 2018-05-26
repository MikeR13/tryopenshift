/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */
package ch.rothenbuehler.mike.app1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello";
    }
}
