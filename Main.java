import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {


    }

    public class Persona {
        // Propiedades privadas
        private String nombre;
        private int edad;
        private LocalDate fechaNacimiento;

        // Getter para el nombre
        public String getNombre() {
            return nombre;
        }

        // Setter para el nombre con validación
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        // Getter para la edad
        public int getEdad() {
            return edad;
        }

        // Setter para la edad con validación
        public void setEdad(int edad) {
            this.edad = edad;
        }

        // Getter para la fecha de nacimiento
        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }

        // Setter para la fecha de nacimiento con validación
        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
        }
    }
}

