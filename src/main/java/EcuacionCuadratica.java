import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        pedirDatosEcuacion();
    }

    public static void pedirDatosEcuacion(){
        System.out.println("La ecuación cuadrática está dada por la forma: ax^2 + bx + c = 0");
        System.out.print("Ingrese el valor de a: ");
        int a = validarIngresoDeDatos();
        System.out.print("Ingrese el valor de b: ");
        int b = validarIngresoDeDatos();
        System.out.print("Ingrese el valor de c: ");
        int c = validarIngresoDeDatos();

        calcularSoluciones(a, b, c);
    }

    private static double[] calcularSoluciones(int a, int b, int c){
        double discriminante = (Math.pow(b, 2) - (4 * a * c));
        if (discriminante >= 0) {
            double soluciones[];
            if(discriminante == 0){
                soluciones = new double[1];
                soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
            }else{
                soluciones = new double[2];
                soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            }
            return soluciones;
        }else {
            return null;
        }
    }

    private static void mostrarSoluciones(int a, int b, int c){
        double[] resultados = calcularSoluciones(a, b, c);
        if (resultados == null) {
            System.out.println("No tiene solución.");
        } else {
            for (double resultado : resultados) {
                System.out.println("Solución:");
                System.out.println(resultado);
            }
        }
    }

    private static int validarIngresoDeDatos() {
        Scanner teclado = new Scanner(System.in);
        int entrada;
        do {
            try {
                entrada = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Error, ingrese un valor que no perjudique a la fórmula: ");
                teclado.nextLine();
            }
        } while (true);
        return entrada;
    }
}