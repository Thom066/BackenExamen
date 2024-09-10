import java.util.Scanner;
public class EjercicioTres {
        public static void main(String[] args) {
            Scanner dato = new Scanner(System.in);

            String usuarioUno = "usuario1";
            String contrasenaCorrecta1 = "123t";

            System.out.print("Ingrese nombre de usuario: ");
            String usuarioIngresado = dato.nextLine();

            System.out.print("Ingrese contraseña: ");
            String contrasenaIngresada = dato.nextLine();

            boolean InicioDeSesionCorrecta = false;

            switch (usuarioIngresado) {
                case "usuario1":
                    if (contrasenaIngresada.equals(contrasenaCorrecta1)) {
                        InicioDeSesionCorrecta = true;
                    }
                    break;
                default:
                    System.out.println("Nombre de usuario no reconocido.");
            }


            if (InicioDeSesionCorrecta) {
                System.out.println("Inicio de sesión exitoso.");
            } else if (!usuarioIngresado.equals("usuario1") && !usuarioIngresado.equals("usuario2")) {
                System.out.println("Nombre de usuario no reconocido.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }

        }
    }


