package com.unaula.ia.sisexperto.reparaciones.procesos;

import javax.swing.JOptionPane;

public class Procesos {

    String elecccion;
    String respuesta;

    public Procesos(String pElecccion) {
        this.elecccion = pElecccion;
    }

    public void respuesta() {

        //problemas de carga
        if (this.elecccion.equals("Problemas de carga")) {
            int confirmado = JOptionPane.showConfirmDialog(
                    null,
                    "¿El cargador pasa corriente?", "Problemas de carga", JOptionPane.YES_NO_OPTION);

            if (JOptionPane.OK_OPTION == confirmado) {
                JOptionPane.showMessageDialog(null, "Cambiar la bateria", "Problemas de carga", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Cambiar Puerto de Carga", "Problemas de carga", JOptionPane.INFORMATION_MESSAGE);
            }

        }

        //problemas de audio
        if (this.elecccion.equals("Problemas de audio")) {
            int confirmado = JOptionPane.showConfirmDialog(
                    null,
                    "¿No se escucha cuando hablan?", "Problemas de audio", JOptionPane.YES_NO_OPTION);

            if (JOptionPane.OK_OPTION == confirmado) {
                JOptionPane.showMessageDialog(null, "Cambiar Parlante", "Problemas de audio", JOptionPane.INFORMATION_MESSAGE);

            } else {

                int confirmado1 = JOptionPane.showConfirmDialog(
                        null,
                        "¿No me escuchan cuando hablo?", "Problemas de audio", JOptionPane.YES_NO_OPTION);

                if (JOptionPane.OK_OPTION == confirmado1) {
                    JOptionPane.showMessageDialog(null, "Cambiar Microfono", "Problemas de audio", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Revisar conductores de la tarjeta madre", "Problemas de audio", JOptionPane.WARNING_MESSAGE);
                }

            }

        }

        //problemas relacionados con la pantalla
        if (this.elecccion.equals("Problemas relacionados con la pantalla")) {
            int confirmado = JOptionPane.showConfirmDialog(
                    null,
                    "¿Muestra imagen pero no da respuesta al contacto dactilar?",
                    "Problemas relacionados con la pantalla", JOptionPane.YES_NO_OPTION);

            if (JOptionPane.OK_OPTION == confirmado) {
                JOptionPane.showMessageDialog(null, "Cambiar Táctil", "Problemas relacionados con la pantalla", JOptionPane.INFORMATION_MESSAGE);

            } else {

                int confirmado1 = JOptionPane.showConfirmDialog(
                        null,
                        "¿No muestra imagen o es distorcionada con rayas?",
                        "Problemas relacionados con la pantalla", JOptionPane.YES_NO_OPTION);

                if (JOptionPane.OK_OPTION == confirmado1) {
                    JOptionPane.showMessageDialog(null, "Cambiar Display", "Problemas relacionados con la pantalla", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Buscar Rastros de Humedad",
                            "Problemas relacionados con la pantalla", JOptionPane.WARNING_MESSAGE);
                }

            }

        }

        //problemas relacionados con el sistema operativo
        if (this.elecccion.equals("Problemas con el Sistema Operativo")) {
            int confirmado = JOptionPane.showConfirmDialog(
                    null,
                    "¿El celular es lento y no carga las aplicaciones?",
                    "Problemas con el Sistema Operativo", JOptionPane.YES_NO_OPTION);

            if (JOptionPane.OK_OPTION == confirmado) {
                int confirmado1 = JOptionPane.showConfirmDialog(
                        null,
                        "Encontró archivos o aplicaciones que estan provocado esto",
                             
                        "Problemas con el Sistema Operativo", JOptionPane.YES_NO_OPTION);

                if (JOptionPane.OK_OPTION == confirmado1) {
                    JOptionPane.showMessageDialog(null, "Hacer una Limpieza del equipo celular", "Problemas con el Sistema Operativo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Formatear el equipo celular",
                            "Problemas con el Sistema Operativo", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {

                  int confirmado1 = JOptionPane.showConfirmDialog(
                        null,
                        "El Equipo celular enciende pero se queda en el splash del inicio",
                        "Problemas con el Sistema Operativo", JOptionPane.YES_NO_OPTION);

                if (JOptionPane.OK_OPTION == confirmado1) {
                    JOptionPane.showMessageDialog(null, "Realizar Flasheo del equipo celular", "Problemas con el Sistema Operativo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Mandar el Telefono a garantía si aun cuenta con ella",
                            "Problemas con el Sistema Operativo", JOptionPane.WARNING_MESSAGE);
                }

            }

        }
        
        
         //Olvido de contraseña o sistema de bloqueo
        if (this.elecccion.equals("Olvido de contraseña o sistema de bloqueo")) {
            int confirmado = JOptionPane.showConfirmDialog(
                    null,
                    "¿La version de Androd del Celular es 6.0 o menor ?", 
                    "Olvido de contraseña o sistema de bloqueo", JOptionPane.YES_NO_OPTION);

            if (JOptionPane.OK_OPTION == confirmado) {
                JOptionPane.showMessageDialog(null, "Realizar debloqueo del celular de forma manual por teclas",
                        "Olvido de contraseña o sistema de bloqueo", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Realizar debloqueo del celular de forma manual por teclas y \n"
                        + "quitar sistema de doble seguridad",
                        "Olvido de contraseña o sistema de bloqueo", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }
}
