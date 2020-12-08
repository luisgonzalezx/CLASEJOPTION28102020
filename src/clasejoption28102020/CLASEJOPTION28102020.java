package clasejoption28102020;

import javax.swing.JOptionPane;

public class CLASEJOPTION28102020 {

    
    public static void main(String[] args) {
        
  
  Double m=Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese primer numero"));
  double n=Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese segundo numero"));
  double s=m+n;
  double r=m-n;
  double mu=m*n;
  double d=m/n;
  double re=m%n;
  
  JOptionPane.showMessageDialog(null,"la suma  es  :"+s+"\n la resta es  :"+r+"\n la multiplicacion es  :"
          + mu+ " \n la divicion es  : "+d+ "\n el residuo es  :  " +re);
  
  int c;
  c=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese puntaje"));        
  if (c>500){
       
        JOptionPane.showMessageDialog(null, "ALUMNO INGRESO  :)  ");
    }else{
      JOptionPane.showMessageDialog(null, "ALUMNO NO INGRESO :(  " );
    }
    
    }
}
