package com.ashad.interview.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapTest {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));
        bookList.add(new Book("The Return of the King", 195512, "06181291121"));
        // to map

        Map<String, String> bookMap = bookList.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
        System.out.println("bookMap => "+bookMap);

        // map wth duplicate key

        Map<Integer, String> withDuplicateKey = bookList.stream().collect(Collectors.toMap(Book::getReleaseYear, Book::getName
        , (p,c) -> c));

        System.out.println("withDuplicateKey => "+withDuplicateKey);

        //To other map
        TreeMap<String, Book> treeMap = bookList.stream()
                .collect(Collectors.toMap(Book::getName, Function.identity(),
                        (o1, o2) -> o1
                        , TreeMap::new));
        System.out.println("treeMap ==> "+treeMap);

    }
}
