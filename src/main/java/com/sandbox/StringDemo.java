package com.sandbox;

import java.util.stream.Stream;

import static java.lang.String.format;

public class StringDemo {

    public static void main(String[] args) {
        String value = " this is a string ";

        Stream.of(value,
                  value.stripLeading(),
                  value.stripTrailing(),
                  value.strip())
              .map(s -> format("\'%s\'", s))
              .forEach(System.out::println);
    }
}
