/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import sistema_notificacion.*;
/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();

        notificador.agregar_notificable(new Correo_electronico());
        notificador.agregar_notificable(new SMS());
        notificador.agregar_notificable(new Push_notification());

        notificador.agregar_notificable(new Notificable() {
            @Override
            public void enviar_notificacion() {
                System.out.println("Enviando notificacion por Facebook ️");
            }
        });

        notificador.notificar_todos();
    }
}
/* _____________________________________________________
|           DIAGRAMA DE MEMORIA – CLASE ANÓNIMA       |
|                     STACK:                          |
|-----------------------------------------------------|
| notificador                                         |
| → lista[0] → #CE (Correo_electronico)               |
| → lista[1] → #SMS (SMS)                             |
| → lista[2] → #PN (Push_notification)                |
| → lista[3] → #CA (Clase Anónima - Facebook)   |
|                                                     |
| (lista es ArrayList<Notificable>)                   |
|_____________________________________________________|

 _________________________________
|             HEAP                |
|---------------------------------|
| #CE → clase concreta Correo_electronico  |
| #SMS → clase concreta SMS                |
| #PN → clase concreta Push_notification   |
|                                         |
| #CA → clase anónima:                    |
|     - Implementa Notificable            |
|     - Sobrescribe enviar_notificacion() |
|     - Vive en memoria sin nombre        |
|_________________________________________|
*/
