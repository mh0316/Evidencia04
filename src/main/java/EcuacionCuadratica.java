import java.util.Scanner;

public class EcuacionCuadratica {

    private static double sumar(double numero1, double numero2){
        return numero1+numero2;
    }

    private static double restar(double numero1, double numero2){
        return numero1-numero2;
    }

    private static double multiplicar(double numero1, double numero2){
        return numero1*numero2;
    }

    private static double dividir(double numero1, double numero2){
        return (numero1 / numero2);
    }

    public static double mayorDe(double numero1, double numero2){
        if (numero1>numero2) {
            return numero1;
        }else {
            return numero2;
        }
    }

    private static double menorDe(double numero1, double numero2){
        if (numero1<numero2){
            return numero1;
        }else {
            return numero2;
        }
    }

    private static double potenciaDeUnNumero(double numero1, double numero2){
        return Math.pow(numero1, numero2);
    }

    private static double porcentajeDeUnNumero(double numero1, double numero2){
        double porcentaje = (numero1/numero2)*100;
        return porcentaje;
    }

    private static double[] resolverSistema2x2(double[] ecuacion1abc, double[] ecuacion2abc){
        double a = ecuacion1abc[0];
        double b = ecuacion1abc[1];
        double c = ecuacion1abc[2];
        double d = ecuacion2abc[0];
        double e = ecuacion2abc[1];
        double f = ecuacion2abc[2];

        double x = (c*e - b*f)/(a*e - b*d);
        double y = (a*f - c*d)/(a*e - b*d);

        double[] solucionXY = {x,y};
        return solucionXY;
    }

    private static double[] resolverEcuacionDeLaRecta(double[] valoreX1X2, double[] valoresY1Y2){

        double x1 = valoreX1X2[0];
        double y1 = valoreX1X2[1];
        double x2 = valoresY1Y2[0];
        double y2 = valoresY1Y2[1];

        double m = (y2-y1)/(x2-x1);
        double b = y1 - (m * x1);

        double[] solucionMB = {m,b};
        return solucionMB;
    }
}