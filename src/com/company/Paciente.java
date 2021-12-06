package com.company;
import java.io.*;

public class Paciente {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void ClassPaciente() throws IOException {
        int opc;
        do {
            System.out.println("BIENVENIDO");
            System.out.println("1.¿Necesitas dar de alta a un nuevo paciente?");
            System.out.println("2.¿Necesitas consultar informacion sobre un paciente?");
            int pac = Integer.parseInt(entrada.readLine());
            switch (pac) {
                case 1:
                    System.out.println("Escribe el identificador unico");
                    int id = Integer.parseInt(entrada.readLine());
                    System.out.println("Escribe el nombre completo");
                    String nom = entrada.readLine();
                    System.out.println("Paciente dado de alta exitosamente");
                    break;
                case 2:
                    System.out.println("Escribe el identificador unico");
                    int ide = Integer.parseInt(entrada.readLine());
                    System.out.println("Identificador: ");
                    System.out.println("Nombre Completo: ");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("¿Deseas regresar al menu del paciente?");
            System.out.println("Presiona 1 para si y 0 para no");
            opc = Integer.parseInt(entrada.readLine());
        }while (opc == 1);
    }
}