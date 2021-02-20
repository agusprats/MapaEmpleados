package ar.com.xeven;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Empleado> empleados = new HashMap<>();
        Empleado a = new Empleado("pablo",123,12345678,45,"av. siempreviva 123","gte");
        Empleado b = new Empleado("john", 456, 78945612, 25, "otra dir","otro puesto");
        Empleado c = new Empleado("juli", 789, 75648612, 65, "otra direccion", "otro puesto");
        empleados.put(a.getNroEmpleado(), a);
        empleados.put(b.getNroEmpleado(), b);
        empleados.put(c.getNroEmpleado(), c);
        empleados.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}
