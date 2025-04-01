public class Main {
    public static void main(String[] args) {
        //Instancia de varios empleados
        Empleado emp1= new Empleado(101,"Juan Perez", "Programador", 1000000.0);
        Empleado emp2= new Empleado("Pedro Lopez", "Programador");
        Empleado emp3= new Empleado("Ricardo Perez", "Programador");
        Empleado emp4= new Empleado(104, "Pablo Gimenez", "Supervisor", 1200000.0);
        Empleado emp5= new Empleado(105, "Jose Lopez", "Jefe de Proyecto", 1500000.0);

        //Muestra la informacion de los empleados actual
        System.out.println("Informacion Empleados:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);

        //Actualizacion de los salarios de cada empleado
        emp1.actualizarSalario(100000.0);
        emp2.actualizarSalario(20);
        emp3.actualizarSalario(15);
        emp4.actualizarSalario(150000.0);
        emp5.actualizarSalario(200000.0);

        //Muestra la informacion de los empleados despues de actualizar los salarios
        System.out.println("\nInformacion Actualizada de Empleados:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);


        System.out.println("\nTotal Empleados: "+Empleado.mostrarTotalEmpleados());

    }
}
