/**
 * Programa: SistemaPersonas
 * Autor: [Tu Nombre]
 * Descripción: Demuestra constructores en Java
 */
public class Main {
    public static void main(String[] args) {
        // Crear personas usando diferentes constructores
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("María");
        Persona persona3 = new Persona("Carlos", 25);
        
        // Mostrar información
        System.out.println("\n--- Información de Personas ---");
        persona1.mostrarInfo();
        persona2.mostrarInfo();
        persona3.mostrarInfo();
    }
}

class Persona {
    private String nombre;
    private int edad;
    
    // Constructor por defecto
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        System.out.println("Persona creada con constructor por defecto");
    }
    
    // Constructor con 1 parámetro
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 18;
        System.out.println("Persona creada con constructor de un parámetro");
    }
    
    // Constructor con 2 parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Persona creada con constructor de dos parámetros");
    }
    
    public void mostrarInfo() {
        System.out.println(nombre + " tiene " + edad + " años");
    }
}