/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author orma4705
 */
public class Menu {
    private String title;
    private List<OptionItem> options_menu; //null

    public Menu(String title) {
        this.title = title;
        options_menu = new ArrayList<OptionItem>();
    }
    
    /**
     * Añade la nueva opción al array de opciones
     * @param afegir opción a añadir
     */
    public void AddOption(OptionItem afegir)
    {
        if (!options_menu.contains(afegir))
        { //si no existeix
           options_menu.add(afegir);
        }
        else
        {
            System.out.println("Opció ja afegida");
        }

        
    }
    
    public void AddOptionByIndex(OptionItem afegir, int pos)
    {
        if (!options_menu.contains(afegir))
        { //si no existeix
            
         options_menu.add(pos, afegir);
        }
        else
        {
            System.out.println("Opció ja afegida");
        }
        
    }
    
    
    public int NumeroOptionsMenu()
    {
        return options_menu.size();
    }
    
    
    public boolean removeOption(OptionItem delete)
    {
        return options_menu.remove(delete);
    }
     
    public OptionItem removeOptionByIndex(int delete_index)// throws IndexOutOfBoundsException
    {
        return options_menu.remove(delete_index);
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Menu{");
//        sb.append("title=").append(title);
//        sb.append(", options_menu=").append(options_menu);
//        sb.append('}');
//        return sb.toString();
//    }
    
    
    

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("**" + this.title + "**\n");
        build.append("------------------\n");
        for (int i = 0; i < options_menu.size(); i++) {
            build.append((i+1) + "-" + options_menu.get(i).toString() + "\n");
        }
        build.append("______________________\n");
               
        
        return build.toString();
    }
    
    public void DisplayMenú()
    {
        System.out.println(this.toString());
    }
    
    public int chooseOption()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println
        ("Choose one option (1-" + options_menu.size() + ")\n");
        int option;
        do
        {
            option = sc.nextInt();
        }while(option<1 && option>options_menu.size());
        return option;
    }
    
    
}