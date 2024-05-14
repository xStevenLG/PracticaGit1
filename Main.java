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
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
            }
            this.nombre = nombre;
        }

        // Getter para la edad
        public int getEdad() {
            return edad;
        }

        // Setter para la edad con validación
        public void setEdad(int edad) {
            if (edad >= 0) {
                this.edad = edad;
            } else {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
        }

        // Getter para la fecha de nacimiento
        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }

        // Setter para la fecha de nacimiento con validación
        public void setFechaNacimiento(String fechaNacimiento) {
            try {
                this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException("La fecha de nacimiento debe estar en el formato AAAA-MM-DD");
            }
        }

        // Método para calcular la fecha de nacimiento a partir de la edad
        public void calcularFechaNacimiento() {
            LocalDate today = LocalDate.now();
            this.fechaNacimiento = today.minusYears(this.edad);
        }

        // Método para representar la información de la persona
        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Edad: " + edad + ", Fecha de Nacimiento: " + fechaNacimiento;
        }
    }

    class Estudiante extends Persona {
        private String grado;

        // Constructores
        public Estudiante(String nombre, int edad, String fechaNacimiento, String grado) {
            super(nombre, edad, fechaNacimiento);
            this.setGrado(grado);
        }

        // Getter para el grado
        public String getGrado() {
            return grado;
        }

        // Setter para el grado con validación
        public void setGrado(String grado) {
            if (grado == null || grado.trim().isEmpty()) {
                throw new IllegalArgumentException("El grado no puede ser nulo o vacío");
            }
            this.grado = grado;
        }

        // Método sobreescrito para representar la información del estudiante
        @Override
        public String toString() {
            return super.toString() + ", Grado: " + grado;
        }
    }

}

