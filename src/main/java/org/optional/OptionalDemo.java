package org.optional;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDemo {

    public static Customer getCustomerByEmailId(String emailId) throws Exception {
        List<Customer> customers = Database.getAll();
        return customers.stream()
                .filter(customer -> customer.getEmail().equals(emailId))
                .findAny()
                .orElseThrow(()->new Exception("Not present in DB"));
                // .orElse(new Customer());
    }

    public static void main(String[] args) {
        Customer customer = new Customer(101, "John", null, Arrays.asList("397937956", "216531234"));
        Customer customer2 = new Customer(101, "John", "john@gmail.com", Arrays.asList("397937956", "216531234"));

        // empty
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // of - does the null check interally
//        Optional<String> emailOptional = Optional.of(customer.getEmail());
//        System.out.println(emailOptional);

        // ofNullable - returns the object if present otherwise empty (but never null)

        try {
            Optional<String> emailNullable = Optional.ofNullable((customer2.getEmail()));
            if(emailNullable.isPresent()) {
                System.out.println(emailNullable.get());
            } else {
                System.out.println("The value is null.");
            }
            System.out.println(emailNullable.orElse("defaultEmail@gmail.com"));

            System.out.println(emailNullable.map(String::toUpperCase).orElseGet(() -> "default email..."));


            System.out.println(emailNullable.orElseThrow(() -> new IllegalArgumentException("The value is null")));

            System.out.println(getCustomerByEmailId("pqr").getEmail());


        } catch(NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
