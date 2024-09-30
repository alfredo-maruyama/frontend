//importação da biblioteca
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//criação da classe TelaDeAtualizacao + herança do JFrame
public class TelaDeAtualizacao extends JFrame {
    //criação das classes statics (inalteraveis)
    public static JLabel lblId;
    public static JComboBox<String> cbxId;
    public static String[] ids;

    public static JLabel lblNome;
    public static JTextField txtNome;
    public static String nomeAtual;

    public static JLabel lblEmail;
    public static JTextField txtEmail;
    public static String emailAtual;

    public static JLabel lblSenha;
    public static JPasswordField txtSenha;
    public static String senhaAtual;

    public static JLabel lblNotificacoes;

    public static JButton btnAtualizar;
    public static JButton btnCancelar;

    public static int tamanhoInputs = 20; //criação da classe de tamanho por números inteiros + atribuição

    public TelaDeAtualizacao() // criação do construtor da TelaDeAtualizacao
    {
        super("Tela de Atualização"); // titulo da caixa 
        setLayout(new GridLayout(6,1,5,5)); // definindo o layout da caixa

        JPanel linha_id = new JPanel(new GridLayout(1, 2)); 

        lblId = new JLabel("Id:", SwingConstants.RIGHT);
        linha_id.add(lblId);

        NavegadorDeRegistro.popularIds();
        cbxId = new JComboBox(ids);
        linha_id.add(cbxId);

        add(linha_id);

        JPanel linha_nome = new JPanel(new GridLayout(1, 2));

        lblNome = new JLabel("Nome:", SwingConstants.RIGHT); // criação um item "Nome" dentro da caixa
        linha_nome.add(lblNome);

        txtNome = new JTextField(tamanhoInputs);
        linha_nome.add(txtNome);

        add(linha_nome);

        JPanel linha_email = new JPanel(new GridLayout(1, 2));

        lblEmail = new JLabel("Email:", SwingConstants.RIGHT); // criação um item "Email" dentro da caixa
        linha_email.add(lblEmail);

        txtEmail = new JTextField(tamanhoInputs);
        linha_email.add(txtEmail);

        add(linha_email);

        JPanel linha_senha = new JPanel(new GridLayout(1, 2));

        lblSenha = new JLabel("Senha:", SwingConstants.RIGHT); // criação um item "Senha" dentro da caixa
        linha_senha.add(lblSenha);

        txtSenha = new JPasswordField(tamanhoInputs);
        linha_senha.add(txtSenha);

        add(linha_senha);

        JPanel linha_botoes = new JPanel(new GridLayout(1, 2));

        btnAtualizar = new JButton("Atualizar"); // criação um botão "Atualizar" dentro da caixa
        linha_botoes.add(btnAtualizar);

        btnCancelar = new JButton("Cancelar"); // criação um botão "Cancelar" dentro da caixa
        linha_botoes.add(btnCancelar);

        add(linha_botoes);

        JPanel linha_notificacoes = new JPanel(new GridLayout(1, 1));

        lblNotificacoes = new JLabel("Notificações", SwingConstants.CENTER); // criação de uma mensagem de notificação ao usuário dentro da caixa
        linha_notificacoes.add(lblNotificacoes);

        add(linha_notificacoes);

        btnAtualizar.addActionListener(
            new ActionListener() {
                @Override // sobreescrevendo um método do AtualizarId
                public void actionPerformed(ActionEvent event) { 
                    NavegadorDeRegistro.atualizarId();
                }
            }
        );

        btnCancelar.addActionListener(
            new ActionListener() {
                @Override // sobreescrevendo um método do limparCampos
                public void actionPerformed(ActionEvent event) {
                    NavegadorDeRegistro.limparCampos();
                }
            }
        );

        cbxId.addItemListener( 
            new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent event) {
                    if (event.getStateChange() == ItemEvent.SELECTED) {
                        NavegadorDeRegistro.atualizarCampos(cbxId.getSelectedItem().toString());
                    }
                } 
            }
        );

        setSize(250, 300); // define o tamanho da caixa
        ImageIcon img = new ImageIcon("./senac-logo.png");
        setIconImage(img.getImage());
        setVisible(true); // define a visibilidade da caixa
        cbxId.requestFocus();
    }

    public static String setHtmlFormat(String strTexto) {
        return "<html><body>" + strTexto + "</body></html>";
    }

    public static void main(String[] args) {
        TelaDeAtualizacao appTelaDeAtualizacao = new TelaDeAtualizacao();
        appTelaDeAtualizacao.setDefaultCloseOperation(EXIT_ON_CLOSE); // define um operador de fechamento
    }
}