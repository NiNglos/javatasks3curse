package jv.mn.services;

import jv.mn.models.User;
import jv.mn.repository.UserRepository;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
@Transactional


public class UserSerivce {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> getOnlyTeachers() {
        return userRepository.findUsersByRoleId(2);
    }

    public List<User> getOnlyStudents() {
        return userRepository.findUsersByRoleId(1);
    }

}
