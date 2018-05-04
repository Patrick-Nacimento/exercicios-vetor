import javax.swing.JOptionPane;

public class ExerVetor6{
    public static void main(String[] args){

        int[] idades = new int [9];
        idades[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        idades[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        idades[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        idades[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        idades[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        idades[5] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        idades[6] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        idades[7] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        idades[8] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

        int maiorIdade = 0;
        if(idades[0] > maiorIdade){
            maiorIdade = idades[0];
        }
        if(idades[1] > maiorIdade){
            maiorIdade = idades[1];
        }
        if(idades[2] > maiorIdade){
            maiorIdade = idades[2];
        }
        if(idades[3] > maiorIdade){
            maiorIdade = idades[3];
        }
        if(idades[4] > maiorIdade){
            maiorIdade = idades[4];
        }
        if(idades[5] > maiorIdade){
            maiorIdade = idades[5];
        }
        if(idades[6] > maiorIdade){
            maiorIdade = idades[6];
        }
        if(idades[7] > maiorIdade){
            maiorIdade = idades[7];
        }
        if(idades[8] > maiorIdade){
            maiorIdade = idades[8];
        }
        JOptionPane.showMessageDialog(null, "A maior idade é : " + maiorIdade);
        
    }
}
