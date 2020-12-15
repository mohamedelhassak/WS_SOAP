package EXERCICES.EX4;


import EXERCICES.EX4.proxy.EQ2DEGServiceService;
import EXERCICES.EX4.proxy.Eq2DegWS;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Eq2DegWS port = new EQ2DEGServiceService().getEq2DegWSPort();

        System.out.println("********* ENTRER :A ***********");
        double a = scanner.nextDouble();
        System.out.println("********* ENTRER :B ***********");
        double b = scanner.nextDouble();
        System.out.println("********* ENTRER :C ***********");
        double c = scanner.nextDouble();

        System.out.println("[START.....]");
        System.out.println(port.resoudreEq2Deg(a,b,c));
        System.out.println("[END.....]");
    }
}
