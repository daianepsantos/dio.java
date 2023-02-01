public class Quadrilatero {
    public static void area(double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo: " + lado1 + lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio " + (baseMaior + baseMenor)* altura);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losango: " + (diagonal1 * diagonal2)/2);
    }

    public static void xpto() {
        System.out.println("Antes");
        return;
    }

    public static double abc() {
        return 1.6;
    }
}
