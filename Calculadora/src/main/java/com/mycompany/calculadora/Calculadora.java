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
        double a, b, rta;
        opc=op.nextInt();
        
        switch (opc){
            case 1:
                System.out.print("Digite los números que desea sumar: ");
                Scanner suma=new Scanner(System.in);
                a=suma.nextFloat();
                b=suma.nextFloat();
                rta=a+b;
                System.out.println(rta);
                break;
                
            case 2:
                System.out.print("Digite los números que desea restar: ");
                Scanner resta=new Scanner(System.in);
                a=resta.nextFloat();
                b=resta.nextFloat();
                rta=a-b;
                System.out.println(rta);
                break;
                
                case 3:
                System.out.print("Digite los números que desea multiplicar: ");
                Scanner mult=new Scanner(System.in);
                a=mult.nextFloat();
                b=mult.nextFloat();
                rta=a*b;
                System.out.println(rta);
                break;
                
                case 4:
                System.out.print("Digite los números que desea dividir: ");
                Scanner division=new Scanner(System.in);
                a=division.nextFloat();
                b=division.nextFloat();
                rta=a/b;
                System.out.println(rta);
                break;
                
                case 5:
                System.out.print("Digite el número del cuál desea saber el seno: ");
                Scanner seno=new Scanner(System.in);
                a=seno.nextFloat();
                double r=Math.toRadians(a);
                rta=Math.sin(r);
                System.out.println(rta);
                break;
                
                case 6:
                System.out.print("Digite el número del cuál desea saber el coseno: ");
                Scanner cos=new Scanner(System.in);
                a=cos.nextFloat();
                double t=Math.toRadians(a);
                rta=Math.cos(t);
                System.out.println(rta);
                break;
                
                case 7:
                System.out.print("Digite el número del cuál desea saber el tangente: ");
                Scanner tan=new Scanner(System.in);
                a=tan.nextFloat();
                double h=Math.toRadians(a);
                rta=Math.tan(h);
                System.out.println(rta);
                break;
                
                case 8:
                System.out.print("Digite el índice, luego el radicando: ");
                Scanner raiz=new Scanner(System.in);
                a=raiz.nextFloat();
                b=raiz.nextFloat();
                rta=Math.pow(b, (1/a));
                System.out.println(rta);
                break;
                
                case 9:
                System.out.print("Digite la base, luego el exponente: ");
                Scanner pot=new Scanner(System.in);
                a=pot.nextFloat();
                b=pot.nextFloat();
                rta=Math.pow(a,b);
                System.out.println(rta);
                break;
                
                case 10:
                System.out.print("Digite el % de IVA, luego el valor"
                        + " al que desea sacarle el IVA: ");
                Scanner iva=new Scanner(System.in);
                a=iva.nextFloat();
                b=iva.nextFloat();
                rta=((a/100)*b);
                System.out.println(rta);
                break;
                
                default:
                    System.out.println("Intente ingresando un número que esté"
                            + " dentro del menú de la calculadora.");
        }
    }
}
