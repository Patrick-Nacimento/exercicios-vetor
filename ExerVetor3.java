import javax.swing.JOptionPane;

public class ExerVetor3{
    public static void main(String[] args){

        String[] produto = new String[7];
        double[] preco = new double[7];
        
        produto[0] = JOptionPane.showInputDialog("Escolha um produto");
        produto[1] = JOptionPane.showInputDialog("Escolha um produto");
        produto[2] = JOptionPane.showInputDialog("Escolha um produto");
        produto[3] = JOptionPane.showInputDialog("Escolha um produto");
        produto[4] = JOptionPane.showInputDialog("Escolha um produto");
        produto[5] = JOptionPane.showInputDialog("Escolha um produto");
        produto[6] = JOptionPane.showInputDialog("Escolha um produto");
        
        preco[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
        preco[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
        preco[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
        preco[3] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
        preco[4] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
        preco[5] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
        preco[6] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));

        JOptionPane.showMessageDialog(null,
        produto[0] +
        "\n" + produto[1] +
        "\n" + produto[2] +
        "\n" + produto[3] +
        "\n" + produto[4] +
        "\n" + produto[5] +
        "\n" + produto[6] +

        "\n" + preco[0] + 
        "\n" + preco[1] +
        "\n" + preco[2] +
        "\n" + preco[3] +
        "\n" + preco[4] +
        "\n" + preco[5] +
        "\n" + preco[6]);


        
        
            
            

            
             
             
             
             
           
             

                        


    }
}