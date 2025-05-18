/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_notificacion;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class Notificador {
    private List<Notificable> lista = new ArrayList<>();

    public void agregar_notificable(Notificable n) {
        lista.add(n);
    }

    public void notificar_todos() {
        for (Notificable n : lista) {
            n.enviar_notificacion();
        }
    }
}
