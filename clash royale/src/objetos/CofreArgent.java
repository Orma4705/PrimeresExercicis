/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author orma4705
 */
public class CofreArgent extends cofregeneric{

    @Override
    public void obrirCofre() {
       this.num_monedas = trobarMonedes(105, 120);
       this.carta1=seleccionarCarta();
    }
    

}
