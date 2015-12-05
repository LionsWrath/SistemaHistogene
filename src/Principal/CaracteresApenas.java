/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;


import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
/**
 *
 * @author Caio
 */
public class CaracteresApenas  extends PlainDocument {
      private final int limit;
      private static final List<String> alfabeto = Arrays.asList(" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"); 
    


    public CaracteresApenas(int limit) {
        this.limit = limit;
    }


  @Override
  public void insertString(int offs, String str, AttributeSet a)
      throws BadLocationException {
    if (str == null)
      return;
    
    StringBuilder sb = new StringBuilder();

    if (((getLength() + str.length()) <= limit)) {
        if (test(str.split(""))){
            super.insertString(offs, str, a);
        }
        else {
            JOptionPane.showMessageDialog(null, "Apenas letras podem ser inseridas nesse campo!");
        }
    }
    else{
        JOptionPane.showMessageDialog(null, "Limite de Caracteres: " + limit);
    }
  }

    public static boolean test(String[] text) {
      try {
         for (String charx : text){
            if (!(alfabeto.contains(charx.toUpperCase()))){
                return false;
            }
         }
      return true;
      } catch (NumberFormatException e) {
          System.out.println("Erro: "  + e.getMessage());
         return false;
      }
   }
}
