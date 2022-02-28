package com.example.reactspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactspringbootApplication.class, args);
    }

    // TODO: not necessarily to do but to use hibernate, make this class implement CommandLineRunner
   /* @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new Employee("Jerry", "Agada", "agada@gmail.com"));
        this.userRepository.save(new Employee("David", "Momoh", "momoh@gmail.com"));
        this.userRepository.save(new Employee("Orji", "David", "davido@gmail.com"));
    }*/
}
