/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Levi Caro Alvarado
 */
public class Pacientes {

    private String id;
    private String nombre;
    private String apellidos;
    private int edad;
    private String genero;
    public int paciente;
    static int opt =-1;

    public Pacientes(int pacientes) {        
        this.paciente = pacientes;
    }

    //Metodo de nuevo paciente 
    public boolean nuevoPaciente(int pacientes) {
        while (opt != 0) {
            if (pacientes <= 10) {
                id = JOptionPane.showInputDialog(null, "Introduzca Identificador:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
                nombre = JOptionPane.showInputDialog(null, "Nombre:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
                apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
                genero = JOptionPane.showInputDialog(null, "Genero:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
                edad = 0;
                try {
                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo se admite introducir numeros para la edad\nNo se ha registrado el valor introducido",
                            "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            break;
        }
        return true;
    }

    //Metodo de mostrar paciente
    public String mostrarPaciente() {
        String datos;
        datos = ("\nID: " + id + "\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nGenero: " + genero + "\nEdad: " + edad);
        return datos;
    }


}
