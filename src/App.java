import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Informe os dados necessários para verificação do emprestimo",
                "Emprestimos", JOptionPane.INFORMATION_MESSAGE);

        String salarioS = JOptionPane.showInputDialog(null, "Qual o valor do seu salario: ", "Valor salario",
                JOptionPane.QUESTION_MESSAGE);
        double salario = Double.parseDouble(salarioS);

        String parcelaS = JOptionPane.showInputDialog(null, "Qual o valor da parcela desejada: ", "Valor parcela",
                JOptionPane.QUESTION_MESSAGE);
        double parcela = Double.parseDouble(parcelaS);

        double calculo1 = (parcela * 100) / (salario);

        if (calculo1 > 20) {
            JOptionPane.showMessageDialog(null, "Emprestimo não concedido", "Emprestimo",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Emprestimo concedido", "Emprestimo", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}