/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_notificacion;

/**
 *
 * @author user
 */
public class Push_notification implements Notificable {
    @Override
    public void enviar_notificacion() {
        System.out.println("Enviando notificacion Push");
    }
}
