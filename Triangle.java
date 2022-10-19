package test1;

import java.util.Scanner;


public class Triangle {
    public static void main(String[] args) {

        //side variables
        double ladoA = 0;
        double ladoB = 0;
        double ladoC = 0;

        //Angle vars
        double angleA = 0;
        double angleB = 0;
        double angleC = 0;

        // Triangle variables
        double area = 0;
        double height = 0;
        String type = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese lado A :");
        ladoA = input.nextDouble();

        System.out.println("Ingrese lado B (base) :");
        ladoB = input.nextDouble();

        System.out.println("Ingrese lado C :");
        ladoC = input.nextDouble();

        System.out.println("Ingrese altura :");
        height = input.nextDouble();

        if(ladoA == ladoB && ladoB == ladoC){
            type = "equilatero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoC == ladoB) {
            type = "isoceles";
        }else {
            type = "escaleno";
        }

        switch (type){
            case "equilatero":
                angleA = Math.toDegrees(Math.acos((Math.pow(ladoA,2)-Math.pow(ladoB,2)-Math.pow(ladoC,2))/(-2*ladoB*ladoC)));
                angleB = Math.toDegrees(Math.acos((Math.pow(ladoB,2)-Math.pow(ladoC,2)-Math.pow(ladoA,2))/(-2*ladoA*ladoC)));
                angleC = Math.toDegrees(Math.acos((Math.pow(ladoC,2)-Math.pow(ladoB,2)-Math.pow(ladoA,2))/(-2*ladoB*ladoA)));
                break;
            case "isoceles":
                angleA = Math.toDegrees(Math.acos((Math.pow(ladoA,2)-Math.pow(ladoB,2)-Math.pow(ladoC,2))/(-2*ladoB*ladoC)));
                angleB = Math.toDegrees(Math.acos((Math.pow(ladoB,2)-Math.pow(ladoC,2)-Math.pow(ladoA,2))/(-2*ladoA*ladoC)));
                angleC = Math.toDegrees(Math.acos((Math.pow(ladoC,2)-Math.pow(ladoB,2)-Math.pow(ladoA,2))/(-2*ladoB*ladoA)));
                break;
            case "escaleno":
                angleA = Math.toDegrees(Math.acos((Math.pow(ladoA,2)-Math.pow(ladoB,2)-Math.pow(ladoC,2))/(-2*ladoB*ladoC)));
                angleB = Math.toDegrees(Math.acos((Math.pow(ladoB,2)-Math.pow(ladoC,2)-Math.pow(ladoA,2))/(-2*ladoA*ladoC)));
                angleC = Math.toDegrees(Math.acos((Math.pow(ladoC,2)-Math.pow(ladoB,2)-Math.pow(ladoA,2))/(-2*ladoB*ladoA)));
                break;

        }

        area = (ladoB*height)/2;

        System.out.println("El triangulo es: " + type +
                "\nAngulo a -> " + String.format("%.2f", angleA) +
                "\nAngulo b -> " + String.format("%.2f", angleB) +
                "\nAngulo c -> " + String.format("%.2f", angleC) +
                "\nArea -> "+ String.format("%.2f", area));

    }
}
