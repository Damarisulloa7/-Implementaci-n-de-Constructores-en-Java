# -Implementaci-n-de-Constructores-en-Java
DAMARIS ANETTE ULLOA GUALLI
Descripción del programa realizado: 
- Este programa demuestra el uso de constructores en Java, incluyendo:
- Constructor por defecto (sin parámetros)
- Constructores parametrizados (con diferentes parámetros)
- Sobrecarga de constructores (múltiples versiones)
- Encapsulamiento de propiedades


Ejemplos de uso o ejecución del programa:

1. Ejecución básica del programa
   
# Compilar
javac src/Main.java -d bin

# Ejecutar
java -cp bin Main

# Salida esperada:
Persona creada con constructor por defecto
Persona creada con constructor de un parámetro
Persona creada con constructor de dos parámetros

--- Información de Personas ---
Sin nombre tiene 0 años
María tiene 18 años
Carlos tiene 25 años


2. Casos de uso de constructores
   
// Constructor por defecto (valores predeterminados)
Persona p1 = new Persona();

// Constructor con nombre (edad=18 por defecto)
Persona p2 = new Persona("Ana");

// Constructor completo (nombre + edad personalizada)
Persona p3 = new Persona("Pedro", 40);


3. Modificación rápida del programa

// En Main.java - Agregar una nueva persona
public static void main(String[] args) {
    // ... código existente ...
    Persona persona4 = new Persona("Lucía", 32);
    persona4.mostrarInfo();
}


4. Salida con modificación
   
... salida anterior ...
Lucía tiene 32 años
