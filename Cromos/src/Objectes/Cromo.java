/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author orma4705
 */
public class Cromo {
    private int num;
    private String descripcio_cromo;

    public Cromo(int num) {
        this.num = num;
        this.descripcio_cromo="Descripcio sense valor";
    }

    public Cromo(int num, String descripcio_cromo) throws DescriptionToShort,Exception {
        this.num = num;
        this.descripcio_cromo = descripcio_cromo;
    }

    public int getNum() {
        return num;
    }

    public String getDescripcio_cromo() {
        return descripcio_cromo;
    }

    public void setNum(int num) throws Exception{
        if(num<0){
            throw new Exception("Numero no puede ser negativo");
        }
        else{
        this.num = num;
        }
    }

    public void setDescripcio_cromo(String descripcio_cromo) throws DescriptionToShort {
        if(descripcio_cromo.length()<3){
            throw new DescriptionToShort("Descripcio massa curta");
        }
        else{
        this.descripcio_cromo = descripcio_cromo;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cromo)) {
            return false;
        }
        final Cromo other = (Cromo) obj;
        return this.num == other.num;
    }

    @Override
    public String toString() {
        return "Cromo{" + "num=" + num + ", descripcio_cromo=" + descripcio_cromo + '}';
    }
    
    
}
