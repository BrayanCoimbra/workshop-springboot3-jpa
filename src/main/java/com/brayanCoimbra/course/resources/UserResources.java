package com.brayanCoimbra.course.resources;

import com.brayanCoimbra.course.entitites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    private ResponseEntity<User> findAll() {
        User user = new User(1L, "brayan@mail.com", "brayan", "123123","51999999999");

        return ResponseEntity.ok().body(user);
    }
}
