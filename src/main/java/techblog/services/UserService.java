package techblog.services;

import org.springframework.stereotype.Service;
import techblog.models.User;

@Service
public class UserService {

    public User checkUser(User user) {
        if(user.getUsername().equals("prasham") && user.getPassword().equals("prasham28")){
            return user;
        }
        else{
            return null;
        }
    }
}
