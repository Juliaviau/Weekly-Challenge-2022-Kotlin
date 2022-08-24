package com.mouredev.weeklychallenge2022;

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

public class Solucion4 {

    public static void main(String[] args) {
        area(new Triangulo(40,5));
        area(new Cuadrado(1));
        area(new Rectangulo(54,3));
    }

    interface poligono {
        double area();
        void mostrarArea();
    }

    static class Triangulo implements poligono {

        double base, altura;

        public Triangulo(double b, double a) {
            base = b; altura=a;
        }

        @Override
        public double area() {
            return (base*altura)/2;
        }

        @Override
        public void mostrarArea() {
            System.out.println("Area triangulo: " + area());
        }
    }

    static class Cuadrado implements poligono {

        double lado;

        public Cuadrado(double l) {
            lado = l;
        }

        @Override
        public double area() {
            return lado*lado;
        }

        @Override
        public void mostrarArea() {
            System.out.println("Area cuadrado: " + area());
        }
    }

    static class Rectangulo implements poligono {

        double base, altura;

        public Rectangulo(double b, double a) {
            base = b; altura=a;
        }

        @Override
        public double area() {
            return base*altura;
        }

        @Override
        public void mostrarArea() {
            System.out.println("Area rectangulo: " + area());
        }
    }

    static double area(poligono p) {
        p.mostrarArea();
        return p.area();
    }

}
