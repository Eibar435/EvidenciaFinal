package com.company;
import java.io.*;

public class Main {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int opcdo;
        do {
        System.out.println("BIENVENIDO");
        System.out.println("ELIJA UNA DE LAS SIGUIENTES OPCIONES");
        System.out.println("1.¿DESEA DAR DE ALTA A UN NUEVO DOCTOR O CONSULTAR INFORMACION SOBRE UN DOCTOR?");
        System.out.println("2.¿DESEA DAR DE ALTA A UN NUEVO PACIENTE O CONSULTAR INFORMACION SOBRE UN PACIENTE?");
        System.out.println("3.¿DESEA AGENDAR UNA CITA O CONSULTAR INFORMACION SOBRE UNA CITA?");
        int op = Integer.parseInt(entrada.readLine());
        switch (op){
            case 1:
                Doctor doctor = new Doctor();
                doctor.ClassDoctor();
                break;
            case 2:
                Paciente paciente = new Paciente();
                paciente.ClassPaciente();
                break;
            case 3:
                Cita cita = new Cita();
                cita.ClassCita();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
            System.out.println("¿Deseas regresar al menu principal?");
            System.out.println("Presiona 1 para si y 0 para no");
            opcdo = Integer.parseInt(entrada.readLine());
        }while (opcdo == 1);
    }
}