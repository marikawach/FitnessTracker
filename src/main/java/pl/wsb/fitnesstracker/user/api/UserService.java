package pl.wsb.fitnesstracker.user.api;

import java.time.LocalDate;
import java.util.List;

public interface UserService {

    User createUser(User user);

    User updateUser(Long userId, User user);

    void deleteUser(Long userId);

    List<User> findUsersOlderThan(LocalDate date);
}