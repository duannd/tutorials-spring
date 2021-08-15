package com.duannd.spring.data.jpa.h2.controllers;

import com.duannd.spring.data.jpa.h2.domain.User;
import com.duannd.spring.data.jpa.h2.dto.UserDTO;
import com.duannd.spring.data.jpa.h2.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By duan.nguyen
 */
@RequestMapping("api/users")
@RestController
@Slf4j
@Transactional
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        UserDTO dto = new UserDTO(savedUser);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("{id}")
    @Transactional(readOnly = true)
    public ResponseEntity<UserDTO> get(@PathVariable Long id) {
        log.info("Get User by ID {}", id);
        User user = userRepository.getById(id);
        UserDTO dto = new UserDTO(user);
        return ResponseEntity.ok(dto);
    }

}
