package com.projetospringboot.course.config;

import com.projetospringboot.course.entities.Category;
import com.projetospringboot.course.entities.Order;
import com.projetospringboot.course.entities.User;
import com.projetospringboot.course.entities.enums.OrderStatus;
import com.projetospringboot.course.repositories.CategoryRepository;
import com.projetospringboot.course.repositories.OrderRepository;
import com.projetospringboot.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria", "maria@mail.com", "988888888", "123456");
        User user2 = new User(null, "Davi", "davi@mail.com", "977777777", "123456");
        userRepository.saveAll(Arrays.asList(user1, user2));

        Order order1 = new Order(null, Instant.parse("2023-06-20T19:53:07Z"), OrderStatus.PAID, user1);
        Order order2 = new Order(null, Instant.parse("2023-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user2);
        Order order3 = new Order(null, Instant.parse("2023-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, user1);
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));

        Category category1 = new Category(null, "Electronics");
        Category category2 = new Category(null, "Books");
        Category category3 = new Category(null, "Computers");
        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));
    }
}
