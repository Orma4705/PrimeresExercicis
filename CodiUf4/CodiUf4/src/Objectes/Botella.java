/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 * Class Botella, en servira per definir les caràcteristiques bàsiques de la Botella
 * 
 * @author mabardaji
 */
public class Botella {
    /*atributs objecte*/
   public String material; /*de que esta feta la Botella*/
   public int capacitat; /*capacitat maxima Botella*/
   public String tipo_contenido; /*quin(aigua/whisky/cola) liquid hi ha a la Botella*/
   public int any_caducitat;
   public boolean  abierta; /*true si esta abierta*/
   public int liquid_actual; /*liquid que conte la Botella*/
    public  String getMaterial()
{
return material;
}
 public void setMaterial(String material_botella) {
     this.material = material_botella;
 }  
    public int getCapacitat() {
        
        return capacitat;
    }
    public void setCapacitat(int capacitat) {
        if ( capacitat<1){
            System.out.println("Quntitat molt baixa");
        }
        else if (capacitat>1500){
            System.out.println("Quantitat superior al maxim de la botella");
        }
        this.capacitat = capacitat;
    }


}
