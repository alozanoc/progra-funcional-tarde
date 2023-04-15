package pe.edu.upao.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> apostoles = new ArrayList<>();
        apostoles.add("Simón");
        apostoles.add("Andrés");
        apostoles.add("Santiago");
        apostoles.add("Juan");
        apostoles.add("Felipe");
        apostoles.add("Bartolomé");
        apostoles.add("Tomás");
        apostoles.add("Mateo");
        apostoles.add("Santiago");
        apostoles.add("Tadeo");
        apostoles.add("Simón");
        apostoles.add("Judas Iscariote");

        List<String> apostolesS = new ArrayList<>();

        for(String apostol : apostoles) {
            if(apostol.startsWith("S")) {
                apostolesS.add(apostol);
            }
        }
        System.out.println(apostolesS);

        System.out.println("====================");



        List<String> apostolesS2 = apostoles.stream().filter(it -> it.startsWith("S")).toList();

        System.out.println(apostolesS2);

        System.out.println("====================");

        List<String> apostolesMayus = apostoles.stream().map(it -> it.toUpperCase(Locale.ROOT)).toList();

        System.out.println(apostolesMayus);
    }
}


