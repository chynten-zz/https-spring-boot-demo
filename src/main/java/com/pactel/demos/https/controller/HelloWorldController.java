package com.pactel.demos.https.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * //JAVA_DOC
 *
 * @author Chintan Patel
 * @since 5.1.1
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    String printHelloWorld() {

        return "Hello World!";
    }

}
