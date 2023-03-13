/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author orma4705
 */
public class Menu {
 private String title;
 private List<OptionItem> option_menu;

    public Menu(String title) {
        this.title = title;
        option_menu = new ArrayList<OptionItem>();
    }
 
 public void AddOption(OptionItem Afegir){
     option_menu.add(Afegir);
 }
 public int NumeroOptionsMenu(){
     return option_menu.size();
 }
}
