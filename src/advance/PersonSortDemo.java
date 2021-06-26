package advance;

import java.util.Arrays;

class Person implements Comparable<Person>{
    String name;
    int score;
    Person(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String toString(){
        return this.name + "," + this.score;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}

public class PersonSortDemo {
    public static void main(String[] args) {
        Person[] ps = new Person[]{
                new Person("Bod", 61),
                new Person("Alice", 88),
                new Person("Lily", 75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}






























