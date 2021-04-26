package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Zhr date:2021/4/25  17:10
 * @Description:XXX
 */
@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "hello jenkins docker";
    }

    @PostMapping("/hello1")
    public String hello2() {
        return "post hello jenkins docker";
    }
}


