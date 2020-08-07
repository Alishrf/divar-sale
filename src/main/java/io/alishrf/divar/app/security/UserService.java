package io.alishrf.divar.app.security;

import io.alishrf.divar.app.domain.User;
import io.alishrf.divar.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = repository.findByUsername(s);
        if(user == null){
            throw new UsernameNotFoundException("User_Not_Found");
        }
        return user;
    }

    public void save(User user){
        repository.save(user);
    }


}
