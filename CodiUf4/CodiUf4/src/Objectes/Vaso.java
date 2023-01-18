/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Vaso {
     /*atributs objecte*/
   public String material; /*de que esta feta la Vaso*/
   public int capacitat; /*capacitat maxima Vaso*/ 
   public boolean  ple; /*true si esta al limite*/
   public int liquid_actual; /*liquid que conte la Vaso*/

    public Vaso() {
        this.setMaterial("Vidre");
        this.capacitat=100;
        this.setPle(false);
        this.setLiquid_actual(0);
    }

    public Vaso(String material, int capacitat) {
        this.setMaterial(material);
        this.capacitat = capacitat;
    }

    public Vaso(String material) {
        this.material = material;
        this.capacitat = 100;
        this.setPle(false);
        this.setLiquid_actual(0);
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPle(boolean ple) {
        this.ple = ple;
    }

    public void setLiquid_actual(int liquid_actual) {
        this.liquid_actual = liquid_actual;
        if (liquid_actual<0){
            this.liquid_actual=0;
        }
    }

    public String getMaterial() {
        return material;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public boolean isPle() {
        return ple;
    }

    public int getLiquid_actual() {
        return liquid_actual;
    }
}
