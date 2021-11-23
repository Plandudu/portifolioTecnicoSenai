package util;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import petshop.Animal;

public class Validacao {
    
    public static Boolean validaDog(JTextField porteText, JTextField racaText){
        if (porteText.getText().equals("") || racaText.getText().equals("")) {
            return false;
        }
        
        return true;
    }
    
    public static Boolean validaAnimal(JTextField nomeText, JTextField idadeText, JTextField pesoText, JTextField racaText, JTextField nomeDonoText,JTextField telefoneText, JTextField sexoText, ButtonGroup animalGroup){
        if (nomeText.getText().equals("") || idadeText.getText().equals("") || pesoText.getText().equals("") || racaText.getText().equals("") || nomeDonoText.getText().equals("") || telefoneText.getText().equals("") || sexoText.getText().equals("") || animalGroup.getSelection() == null) {
            return false;
        }
        
        return true;
    }
    
    public static Boolean validaCat(JTextField pelo){
        if (pelo.getText().equals("")) {
            return false;
        }
        
        return true;
    }
    
    public static Boolean validaMatricula(ArrayList<Animal> list, Integer id){
        for(Animal animal : list){
            if(animal.getId() == id){
                return false;
            }
        }
        return true;
    }
}
