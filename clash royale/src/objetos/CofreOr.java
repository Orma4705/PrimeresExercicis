/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author orma4705
 */
public class CofreOr extends cofregeneric{
    carta carta2;
    @Override
    public void obrirCofre() {
        this.num_monedas = trobarMonedes(420, 480);
        this.carta1= seleccionarCarta();
        this.carta2=seleccionarCarta();
    }
    
}
