package Lesson12.Test1;

import java.util.Objects;

public class Dog {

    private int age;

    public int getAge() {
        return age;
    }


    public void setAge(final int age) {
        this.age = age;
    }

    public Dog(final int age) {
        this.age = age;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Dog dog = (Dog) o;
        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                "}  ";
    }
}
