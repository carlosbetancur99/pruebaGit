package com.unaula.ia.sisexperto.reparaciones.main;

import com.unaula.ia.sisexperto.reparaciones.procesos.Procesos;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        boolean salir = true;

        while (salir) {
            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Elija de acuerdo a la descripcion del Cliente",
                    "Selector de opciones",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Problemas de carga", "Problemas de audio", "Problemas relacionados con la pantalla",
                        "Problemas con el Sistema Operativo", "Olvido de contraseña o sistema de bloqueo"},
                    "Problemas de carga");

            // System.out.println("El usuario ha elegido "+seleccion);
            Procesos p = new Procesos(seleccion);
            p.respuesta();

            int confirmado = JOptionPane.showConfirmDialog(
                    null,
                    "¿Deseas continuar en la Aplicacion?", "Mensaje Confirmacion de aplicación", JOptionPane.YES_NO_OPTION);

            if (JOptionPane.OK_OPTION == confirmado) {
               salir = true;
            } else {
              salir = false;
            }

        }
    }
}
