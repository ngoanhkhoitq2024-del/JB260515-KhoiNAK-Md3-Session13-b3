package re.edu.md3ss13.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import re.edu.md3ss13.config.UserPrincipal;
import re.edu.md3ss13.entity.User;
import re.edu.md3ss13.repository.IUserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final IUserRepository iUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = iUserRepository.findByUsername(username).orElseThrow(() ->
                        new UsernameNotFoundException(
                                "Không tìm thấy username: " + username)
        );

        List<SimpleGrantedAuthority> authorities =
                List.of(new SimpleGrantedAuthority(user.getRole()));

        return new UserPrincipal(user, authorities);
    }
}
