package cm.study.gravitation.open.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.annotation.WebServlet;

/**
 * Created by chenming on 2017/7/21.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/geeting")
    public void getting(@RequestParam(value = "content", defaultValue = "servlet3") String content) {
        System.out.println("--> " + content);
    }

    @RequestMapping(value = "/user1", method = RequestMethod.POST)
    public String postUser(@RequestBody String param, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating User " + param);
        return param;
    }
}
