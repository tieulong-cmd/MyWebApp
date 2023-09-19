package com.fptpoly;

import com.fptpoly.user.User;
import com.fptpoly.user.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTests {
    @Autowired
    private UserRepository repository;

    @Test
    public void testAddNew() {
        User user = new User();
        user.setEmail("tieulong.cmd@gmail.com");
        user.setPassword("123456");
        user.setFirstName("Long");
        user.setLastName("Tran");
        user.isEnabled();

        User saveUser = repository.save(user);

        Assertions.assertNotNull(saveUser);
//        Assertions.assertThat(saveUser.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAll() {
        Iterable<User> users = repository.findAll();

        for (User user : users) {
            System.out.println(user);
        }
        ;

//        Assertions.assertThat(users).isGreaterThan(0);
    }

    @Test
    public void testUpdate() {
        Integer userId = 1;
        Optional<User> optionalUser = repository.findById(userId);
        User user = optionalUser.get();
        user.setPassword("123");
        repository.save(user);

        User updateUser = repository.findById(userId).get();

        Assertions.assertEquals(updateUser.getPassword(), "123");
    }

    @Test
    public void testGet() {
        Integer userId = 1;
        Optional<User> optionalUser = repository.findById(userId);
        User user = optionalUser.get();

        System.out.println(optionalUser.get());

//        Assertions.assertThat(optionalUser).isPresent();
    }

    @Test
    public void testDelete() {
        Integer userId = 1;
        repository.deleteById(userId);

        Optional<User> optionalUser = repository.findById(userId);

//        Assertions.assertThat(optionalUser).isNotPresent();
    }
}
