package com.company.flywaydemo;

import com.company.flywaydemo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayDemoApplication implements CommandLineRunner {

    private final BookRepository bookRepository;

    public FlywayDemoApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(FlywayDemoApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.findAll().forEach(System.out::println);
    }
}
