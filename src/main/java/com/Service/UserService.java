package com.Service;

import com.Entity.User;
import com.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService {

    User login(String email, String password);

    List<UserDTO> getUsers();

    UserDTO getUser(String e_mail);


    Boolean addUser(User user);

    Boolean updateUser(User user);

    Boolean deleteUser(String e_mail);

    Boolean forgetPassword(String email);

    UserDetails loadUserByUsername(String email);
}
