package yte.intern.spring_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "index.html";
    }

    @RequestMapping("/courses/{id}")
    public void courses(@PathVariable Long id, @RequestParam String name, @RequestParam String instructor){
        System.out.println(id+" "+name+" "+instructor);
    }
}
