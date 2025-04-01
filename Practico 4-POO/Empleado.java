import java.util.HashSet;
import java.util.Set;

public class Empleado {
    private int id_empleado;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    /*
    Coleccion que almacena ids de empleados que no permite elementos duplicados
    HashSet se asegura que no haya duplicados
     */
    private static Set<Integer> ids_empleados= new HashSet<>();
    private static int id_generador=101;

    // Constructor que recibe todos los atributos como parametros
    public Empleado(int id_empleado, String nombre, String puesto, double salario) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        ids_empleados.add(id_empleado);
        totalEmpleados++;
    }
    //Constructor que recibe nombre y puesto como parametros
    public Empleado (String nombre, String puesto){
        this.id_empleado= id_generador++; //aumenta en 1 el id
        //Revisa si el id generado esta en el set de ids y genera otro si el id existe
        while (ids_empleados.contains(this.id_empleado)){
            this.id_empleado= id_generador++;
        }
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 800000.00;
        totalEmpleados++;
    }

    //Metodo que recibe un porcentaje para aumentar el salario
    public void actualizarSalario (int porcentaje){
        this.salario = salario+(salario*(porcentaje/100.0));
    }

    //Metodo que recibe un cantidad para aumentar el salario
    public void actualizarSalario (double aumento){
        this.salario = salario+aumento;
    }

    //Metodo que pertenece a la clase Empleado que muestra el total de empleadps
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    //Metodo que retorna un string con la informacion de cada empleado
    @Override
    public String toString(){
        return "Empleado [id_empleado="+id_empleado
                +", nombre="+nombre
                +", puesto="+puesto
                +", salario=$"+salario;
    }
}

