package pe.edu.upao.funcional;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Runnable> tareas = new ArrayList<>();

        tareas.add(new Tarea1());
        tareas.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Mi tarea personalizada");
            }
        });
        tareas.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Mi tarea personalizada 2");
            }
        });

        tareas.add(() ->
                System.out.println("Mi tarea personalizada 3")
        );

        for(Runnable tarea: tareas) {
            tarea.run();
        }

    }
}