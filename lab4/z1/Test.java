package ru.mirea.gib04.lab4.z1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class Test {

    public static void main(String[] args) {
        final List<Nameable> actors = new ArrayList<>();
        actors.add(new Person("Misha", "Grakovsky"));
        actors.add(new Person("Jenya", "Migalin"));
        actors.add(new Pet("Bobik"));
        actors.add(new Pet("Sharik"));

        print(System.out, "Name", actors, Nameable::name);
    }

    private static <T> void print(PrintStream s, String title, List<T> list, Function<T, String> stringify) {
        s.println("\n" + title + ":");
        list.stream()
                .map(stringify)
                .forEach(string -> s.println("\t" + string));
        s.println();
    }
}