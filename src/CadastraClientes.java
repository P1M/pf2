import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastraClientes {
    private JTextField nome;
    private JTextField datanasc;
    private JTextField cpf;
    private JTextField telefone;
    private JTextField endereco;
    private JTextField cidade;
    private JTextField cep;
    private JButton cadastrarButton;
    private JComboBox estado;
    private JPanel CadastrarClientes;


    public CadastraClientes() {
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //DAOCadastroClientes.
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CadastraClientes");
        frame.setContentPane(new CadastraClientes().CadastrarClientes);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public String getNome() {
        return nome.getText();
    }

    public String getDatanasc() {
        return datanasc.getText();
    }

    public String getCpf() {
        return cpf.getText();
    }

    public String getTelefone() {
        return telefone.getText();
    }

    public String getEndereco() {
        return endereco.getText();
    }

    public String getCidade() {
        return cidade.getText();
    }

    public String getCep() {
        return cep.getText();
    }

    public JButton getCadastrarButton() {
        return cadastrarButton;
    }

    public String getEstado() {
        return estado.getSelectedItem().toString();
    }

    public JPanel getCadastrarClientes() {
        return CadastrarClientes;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        CadastrarClientes = new JPanel();
        CadastrarClientes.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(9, 2, new Insets(0, 0, 0, 0), -1, -1));
        nome = new JTextField();
        nome.setText("");
        CadastrarClientes.add(nome, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        datanasc = new JTextField();
        datanasc.setText(" ");
        CadastrarClientes.add(datanasc, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        cpf = new JTextField();
        cpf.setText("");
        CadastrarClientes.add(cpf, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Nome");
        CadastrarClientes.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Data de Nascimento");
        CadastrarClientes.add(label2, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("CPF");
        CadastrarClientes.add(label3, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Telefone");
        CadastrarClientes.add(label4, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Endereço");
        CadastrarClientes.add(label5, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Cidade");
        CadastrarClientes.add(label6, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label7 = new JLabel();
        label7.setText("Estado");
        CadastrarClientes.add(label7, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label8 = new JLabel();
        label8.setText("CEP");
        CadastrarClientes.add(label8, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        telefone = new JTextField();
        telefone.setText("");
        CadastrarClientes.add(telefone, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        endereco = new JTextField();
        endereco.setText("");
        CadastrarClientes.add(endereco, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        cidade = new JTextField();
        cidade.setText("");
        CadastrarClientes.add(cidade, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        cep = new JTextField();
        CadastrarClientes.add(cep, new com.intellij.uiDesigner.core.GridConstraints(7, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        cadastrarButton = new JButton();
        cadastrarButton.setText("Cadastrar");
        CadastrarClientes.add(cadastrarButton, new com.intellij.uiDesigner.core.GridConstraints(8, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        estado = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Acre");
        defaultComboBoxModel1.addElement("Alagoas");
        defaultComboBoxModel1.addElement("Amapá");
        defaultComboBoxModel1.addElement("Amazonas");
        defaultComboBoxModel1.addElement("Bahia");
        defaultComboBoxModel1.addElement("Ceará");
        defaultComboBoxModel1.addElement("Distrito Federal");
        defaultComboBoxModel1.addElement("Espírito Santo");
        defaultComboBoxModel1.addElement("Goiás");
        defaultComboBoxModel1.addElement("Maranhão");
        defaultComboBoxModel1.addElement("Mato Grosso");
        defaultComboBoxModel1.addElement("Mato Grosso do Sul");
        defaultComboBoxModel1.addElement("Minas Gerais");
        defaultComboBoxModel1.addElement("Pará");
        defaultComboBoxModel1.addElement("Paraíba");
        defaultComboBoxModel1.addElement("Paraná");
        defaultComboBoxModel1.addElement("Pernambuco");
        defaultComboBoxModel1.addElement("Piauí");
        defaultComboBoxModel1.addElement("Rio de Janeiro");
        defaultComboBoxModel1.addElement("Rio Grande do Norte");
        defaultComboBoxModel1.addElement("Rio Grande do Sul");
        defaultComboBoxModel1.addElement("Rondônia");
        defaultComboBoxModel1.addElement("Roraima");
        defaultComboBoxModel1.addElement("Santa Catarina");
        defaultComboBoxModel1.addElement("São Paulo");
        defaultComboBoxModel1.addElement("Sergipe");
        defaultComboBoxModel1.addElement("Tocantins");
        estado.setModel(defaultComboBoxModel1);
        CadastrarClientes.add(estado, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        label2.setLabelFor(datanasc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return CadastrarClientes;
    }
}
