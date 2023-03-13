/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectes;

import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Blazer {
    private int pes;
    private int edat;
    private int resistencia;
    private int distancia_recorreguda;
    public Blazer (int pes, int edat) {
        this.setPes(pes);
         if (edat > 15) {
             this.edat=15;
             System.out.println( "Edat és:"+ this.edat);
            this.edat=edat;
            }
            else {
             this.edat=edat;
            }
         if ( pes > 141) {
             this.pes=140;
             System.out.println("El peso maximo es 140");
             System. out.println("El pes:" + this.pes);
        }   
        else {
           this.pes=pes;
         }
        this.resistencia=3;
        this.distancia_recorreguda=0;
    
    }
    public int getPes() {
         return pes;
                 }
    public int getEdat () {
         return edat;
    }
    public int getResistencia(){
         return resistencia;
    }
    public int getDistancia_recorreguda() {
         return distancia_recorreguda;
    }
    
    public void setPes (int pes) {
        this.pes = pes;
    }
    public void AugmentarResistencia(int resistencia){
        this.resistencia+=resistencia;
    }
    public void Sprint(){
        int distancia_sprint = (200-this.pes);
        if(this.resistencia>0){
            distancia_sprint*=2;
            this.resistencia--;
        }
        this.distancia_recorreguda=this.distancia_recorreguda+distancia_sprint;
    }

    @Override
    public String toString() {
        return "Foca{" + "pes=" + pes + ", edat=" + edat + ", resistencia=" + resistencia + ", distancia_recorreguda=" + distancia_recorreguda + '}';
    }
    
  }