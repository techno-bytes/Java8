package com.ashad.interview.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateChain {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom", "damodar");
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(result);
        Predicate<String>   predicate1 = name-> name.startsWith("A") ;
        Predicate<String>   predicate2 = name-> name.length() > 4;
        List<String> andPredicate = names.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList());
        System.out.println("andPredicate ==> "+andPredicate);
        List<String> orPredicate = names.stream().filter(predicate1.or(predicate2)).collect(Collectors.toList());
        System.out.println("orPredicate ==> "+orPredicate);
        List<String> negatePredicate = names.stream().filter(predicate1.and(predicate2.negate())).collect(Collectors.toList());
        System.out.println("negatePredicate ==> "+negatePredicate);

        // collection of predicate

             List<Predicate<String>> predicates = new ArrayList<Predicate<String>>();
            predicates.add(str -> str.startsWith("A"));
            predicates.add(str -> str.contains("d"));
            predicates.add(str -> str.length() > 4);

            List<String> collectionPredicateResult = names.stream()
                    .filter(predicates.stream().reduce(x->true, Predicate::and))
                    .collect(Collectors.toList());

        System.out.println("collectionPredicateResult => "+collectionPredicateResult);

        }

}
