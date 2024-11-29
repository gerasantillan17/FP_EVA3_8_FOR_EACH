/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_for_each;

/**
 *
 * @author gerar
 */
public class EVA3_8_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] dias ={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
      for(int i=0; i < dias.length; i++){
          System.out.println(dias[i]);
      }  
      for(String cade: dias){
          System.out.println(cade);
      }
      int[]billetes = {20, 50, 100, 200, 500, 1000};
      for(int billete: billetes)
          System.out.println(billete);
    }
    
}
