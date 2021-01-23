package org.optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Database {
    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("123333123", "534322334")),
                new Customer(101, "smith", "smith@gmail.com", Arrays.asList("123333123", "534322334")),
                new Customer(101, "peter", "peter@gmail.com", Arrays.asList("123333123", "534322334")),
                new Customer(101, "kelly", "kelly@gmail.com", Arrays.asList("123333123", "534322334"))
        ).collect(Collectors.toList());
    }
}
