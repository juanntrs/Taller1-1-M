package com.mycompany.calculadora;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Digite el tipo de operación que desea realizar");
        System.out.println("~~~Calculadora~~~");
        System.out.println("1. Suma.\n2. Resta.\n3. Multiplicación.\n4. División."
                + "\n5. Seno.\n6. Coseno.\n7. Tangente.\n8. Radicación"
                + "\n9. Potenciación.\n10. Cálculo del IVA.");
        System.out.print("Opción digitada: ");
        Scanner op = new Scanner(System.in);
        int opc;
        float a, b, rta;
        opc=op.nextInt();
        
        switch (opc){
            case 1:
                System.out.println("Digite los números que desea sumar: ");
                Scanner n1=new Scanner(System.in);
                a=n1.nextFloat();
                Scanner n2=new Scanner (System.in);
                b=n2.nextFloat();
                rta=a+b;
                System.out.println(rta);
                break;
                
            case 2:
                System.out.println("Digite los números que desea sumar: ");
                Scanner n1=new Scanner(System.in);
                a=n1.nextFloat();
                Scanner n2=new Scanner (System.in);
                b=n2.nextFloat();
                rta=a-b;
                System.out.println(rta);
                break;
        }
    }
}
