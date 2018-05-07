import javax.swing.JOptionPane;

public class ExerVetor7{
    public static void main(String[] args){

        double[] alturas = new double [4];
        alturas[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite altura do animal 1")); 
        alturas[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite altura do animal 2"));
        alturas[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite altura do animal 3"));
        alturas[3] = Double.parseDouble(JOptionPane.showInputDialog("Digite altura do animal 4"));

        double menorAlturas = Double.MAX_VALUE;

        if(alturas[0] < menorAlturas){
            menorAlturas = alturas[0];
        }
        if(alturas[1] < menorAlturas){
            menorAlturas = alturas[1];
        }
        if(alturas[2] < menorAlturas){
            menorAlturas = alturas[2];
        }
        if(alturas[3] < menorAlturas){
            menorAlturas = alturas[3];
        }
        JOptionPane.showMessageDialog(null, "A menor altura é: " + menorAlturas);
        
    }
}