import javax.swing.JOptionPane;

public class ExerVetor4{
    public static void main(String[] args){

        String nome = JOptionPane.showInputDialog("Digite seu nome");

        double[] notas = new double[4];
        notas[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));
        notas[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));
        notas[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));
        notas[3] = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));

        double soma = notas[0] +
                      notas[1] +
                      notas[2] +
                      notas[3];
       
        double media = soma/notas.length; 

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nsua media é " +  "Media: " + media);
        
    }
}