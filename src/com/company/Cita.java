package com.company;
import java.io.*;

public class Cita {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void ClassCita() throws IOException {
        int opc;
        do {
            System.out.println("BIENVENIDO");
            System.out.println("1.¿Desea agendar una cita?");
            System.out.println("2.¿Desea mostrar informacion sobre una cita?");
            int cita = Integer.parseInt(entrada.readLine());
            switch (cita) {
                case 1:
                    System.out.println("Escribe el identificador unico del paciente");
                    int id = Integer.parseInt(entrada.readLine());
                    System.out.println("Escribe el nombre completo");
                    String nom = entrada.readLine();
                    System.out.println("Escribe la Fecha a agendar");
                    String fec = entrada.readLine();
                    System.out.println("Escribe la Hora a agendar");
                    String hora = entrada.readLine();
                    System.out.println("Escribe el Motivo");
                    String mo = entrada.readLine();
                    System.out.println("Escribe el nombre de doctor a asignar para el paciente");
                    String nomdoc = entrada.readLine();
                    System.out.println("Cita creada exitosamente");
                    break;
                case 2:
                    System.out.println("Escribe el identificador unico del paciente");
                    int iden = Integer.parseInt(entrada.readLine());
                    System.out.println("Nombre completo: ");
                    System.out.println("Fecha: ");
                    System.out.println("Hora: ");
                    System.out.println("Motivo: ");
                    System.out.println("Doctor a asignado para el paciente: ");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("¿Deseas regresar al menu de la cita?");
            System.out.println("Presiona 1 para si y 0 para no");
            opc = Integer.parseInt(entrada.readLine());
        }while (opc == 1);
    }
}
