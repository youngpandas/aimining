package com.sicdp.controller;

import com.sicdp.entity.User;
import com.sicdp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("findAll/{page}/{size}")
    public Page<User> findAll(@PathVariable("page") int page, @PathVariable("size") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return userRepository.findAll(pageable);
    }

    @PostMapping("add")
    public void add(@RequestBody User user) {
        userRepository.save(user);
    }

    @DeleteMapping("delete/{nid}")
    public void delete(@PathVariable("nid") Long nid) {
        userRepository.deleteById(nid);
    }

    @PutMapping("update")
    public void update(@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping("get/{nid}")
    public User get(@PathVariable("nid") Long nid) {
        return userRepository.findById(nid).orElse(new User());
    }
}
