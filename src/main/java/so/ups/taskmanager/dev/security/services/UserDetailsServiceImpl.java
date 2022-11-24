package so.ups.taskmanager.dev.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import so.ups.taskmanager.dev.DAO.OldUserRepository;
import so.ups.taskmanager.dev.entitites.User;
import javax.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    OldUserRepository oldUserRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = oldUserRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("user Not Found with username: " + username));

        return UserDetailsImpl.build(user);
    }

}