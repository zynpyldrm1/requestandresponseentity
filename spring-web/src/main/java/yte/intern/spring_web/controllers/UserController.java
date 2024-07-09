package yte.intern.spring_web.controllers;

import jakarta.validation.Valid;
import lombok.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import yte.intern.spring_web.dto.User;

@RestController
public class UserController {

    @PostMapping("/user")
    public void userValidation(@RequestBody @Valid User user){
        System.out.println(user);
    }
}
