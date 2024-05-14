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

        // Constructor
        public Persona(String nombre, int edad, String fechaNacimiento) {
            this.setNombre(nombre);
            this.setEdad(edad);
            this.setFechaNacimiento(fechaNacimiento);
        }

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

    class Estudiante extends Persona implements Trabajador {

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

        @Override
        public void realizarTarea() {
            System.out.println("Realizando tarea escolar.");
        }
    }

    class Empleado implements Trabajador {
        private String nombre;
        private int edad;
        private String ciudad;
        private double salario;

        // Constructor
        public Empleado(String nombre, int edad, String ciudad, double salario) {
            this.nombre = nombre;
            this.edad = edad;
            this.ciudad = ciudad;
            this.salario = salario;
        }

        // Getter para el nombre
        public String getNombre() {
            return nombre;
        }

        // Setter para el nombre
        public void setNombre(String nombre) {
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

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        // Implementación del método realizarTarea()
        @Override
        public void realizarTarea() {
            System.out.println("Realizando tarea laboral.");
        }

        // Método para representar la información del empleado
        @Override
        public String toString() {
            return "Empleado: " + nombre + " Edad: " + edad;
        }
    }

    // Subclase Gerente que hereda de Empleado
    public class Gerente extends Empleado {

        // Constructor
        public Gerente(String nombre, int edad, String ciudad, double salario, String departamento) {
            super(nombre, edad, ciudad, salario);
        }
    }

    // Subclase Vendedor que hereda de Empleado
    public class Vendedor extends Empleado {

        // Constructor
        public Vendedor(String nombre, int edad, String ciudad, double salario, double porcentajeComision) {
            super(nombre, edad, ciudad, salario);
        }
    }

    // Subclase Secretaria que hereda de Empleado
    public class Secretaria extends Empleado {

        // Constructor
        public Secretaria(String nombre, int edad, String ciudad, double salario, int extensionTelefonica) {
            super(nombre, edad, ciudad, salario);
        }
    }

    // Subclase Mantenimiento que hereda de Empleado
    public class Mantenimiento extends Empleado {

        // Constructor
        public Mantenimiento(String nombre, int edad, String ciudad, double salario, String habilidades) {
            super(nombre, edad, ciudad, salario);
        }
    }

    // Definición de la interfaz Trabajador
    public interface Trabajador {
        // Método realizarTarea()
        void realizarTarea();
    }

    public class FiguraGeometrica {
        // Propiedades privadas
        private String nombre;
        private String color;

        // Constructor
        public FiguraGeometrica(String nombre, String color) {
            this.nombre = nombre;
            this.color = color;
        }

        // Getter para el nombre
        public String getNombre() {
            return nombre;
        }

        // Setter para el nombre
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        // Getter para el color
        public String getColor() {
            return color;
        }

        // Setter para el color
        public void setColor(String color) {
            this.color = color;
        }
    }

    public class Rectangulo extends FiguraGeometrica {
        // Propiedades adicionales para el rectángulo
        private double longitud;
        private double ancho;

        // Constructor
        public Rectangulo(String nombre, String color, double longitud, double ancho) {
            super(nombre, color);
            this.longitud = longitud;
            this.ancho = ancho;
        }

        // Getters y Setters para longitud y ancho
        public double getLongitud() {
            return longitud;
        }

        public void setLongitud(double longitud) {
            this.longitud = longitud;
        }

        public double getAncho() {
            return ancho;
        }

        public void setAncho(double ancho) {
            this.ancho = ancho;
        }

        public double calcularArea() {
            return longitud * ancho;
        }

        // Método para calcular el perímetro del rectángulo
        public double calcularPerimetro() {
            return 2 * (longitud + ancho);
        }
    }

    public class Circulo extends FiguraGeometrica {
        // Propiedad adicional para el círculo
        private double radio;

        // Constructor
        public Circulo(String nombre, String color, double radio) {
            super(nombre, color);
            this.radio = radio;
        }

        // Getter y Setter para el radio
        public double getRadio() {
            return radio;
        }

        public void setRadio(double radio) {
            this.radio = radio;
        }

        // Método para calcular el área del círculo
        public double calcularArea() {
            return Math.PI * radio * radio;
        }

        // Método para calcular el perímetro del círculo
        public double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }
    }

    public class Triangulo extends FiguraGeometrica {
        // Propiedades adicionales para el triángulo
        private double base;
        private double altura;

        // Constructor
        public Triangulo(String nombre, String color, double base, double altura) {
            super(nombre, color);
            this.base = base;
            this.altura = altura;
        }

        // Getters y Setters para base y altura
        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        // Método para calcular el área del triángulo
        public double calcularArea() {
            return (base * altura) / 2;
        }

        // Método para calcular el perímetro del triángulo (solo implementado para triángulos equiláteros)
        public double calcularPerimetro() {
            return 3 * base; // Solo para triángulos equiláteros, para otros tipos se requiere lógica adicional
        }
    }

    public class Pentagono extends FiguraGeometrica {
        // Propiedad adicional para el pentágono
        private double lado;

        // Constructor
        public Pentagono(String nombre, String color, double lado) {
            super(nombre, color);
            this.lado = lado;
        }

        // Getter y Setter para el lado
        public double getLado() {
            return lado;
        }

        public void setLado(double lado) {
            this.lado = lado;
        }

        // Método para calcular el área del pentágono
        public double calcularArea() {
            return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * lado * lado;
        }

        // Método para calcular el perímetro del pentágono
        public double calcularPerimetro() {
            return 5 * lado;
        }
    }
}

