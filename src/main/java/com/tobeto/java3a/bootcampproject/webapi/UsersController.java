package com.tobeto.java3a.bootcampproject.webapi;

import com.tobeto.java3a.bootcampproject.dataaccess.UserRepository;
import com.tobeto.java3a.bootcampproject.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/users")
public class UsersController {

    private UserRepository userRepository;

    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @RequestMapping("/add")
    public void add() {
        User user = new User();
        user.setUserName("emreesnemez");
        user.setEmail("test@gmail.com");
        userRepository.save(user);
    }
}
