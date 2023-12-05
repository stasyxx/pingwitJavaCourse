package spring_les_1.classwork.point_2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    public void save(User user) {
        userRepository.save(user);
        System.out.println("Saved!");
    }

    @PostConstruct
    private void init() {
        System.out.println("User service post construct!");
        User admin = new User(1L, "admin", "admin password");
        userRepository.save(admin);
    }

    @PreDestroy
    private void destroy() {
        System.out.println("User service is going to die!");
    }
}