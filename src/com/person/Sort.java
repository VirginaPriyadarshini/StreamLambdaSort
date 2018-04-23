package com.person;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vpriyada
 *
 */
public class Sort {
  private void sortUsingStreamLambda(List<Person> personList) {

    personList.add(new Person("Vijay", 53));
    personList.add(new Person("Ajay", 77));
    personList.add(new Person("Jai", 21));
    System.out.println("Sorting by Name...");
    personList.stream().sorted((Person p1, Person p2) -> p2.getName().compareTo(p1.getName()))
        .forEach(System.out::println);
    System.out.println("Sorting by Age...");
    personList.stream().sorted((Person p1, Person p2) -> p2.getAge().compareTo(p1.getAge()))
        .forEach(System.out::println);
  }

  public static void main(String[] args) {

    List<Person> personList = new ArrayList<Person>();
    Sort s = new Sort();
    s.sortUsingStreamLambda(personList);
  }

}
