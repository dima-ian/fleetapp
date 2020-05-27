package dmz.fleetapp.services;

import dmz.fleetapp.models.User;
import dmz.fleetapp.models.UserPrincipal;
import dmz.fleetapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println(username);

        User user = userRepository.findByUsername(username);

        System.out.println("Found = " + user);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return new UserPrincipal(user);

    }
}
