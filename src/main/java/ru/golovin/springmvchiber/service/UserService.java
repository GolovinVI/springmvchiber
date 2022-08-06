package ru.golovin.springmvchiber.service;

import ru.golovin.springmvchiber.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
    User getUser(Long id);
}
