import javax.swing.JOptionPane;


public class Cliente extends Pessoa{
    private String compra;
    private float valorcompra;
    
    //construtor padrão
    public Cliente(){}
    
   //construtor com parâmetros
   protected Cliente(String n, int i, String d, String c, String e, String t, String compra, float valorcompra){
        super(n, i, d, c, e, t);
        this.compra = compra;
       
    }

    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getCompra() {
        return compra;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
	public float getValorcompra() {
		return valorcompra;
	}
    //escrita
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setCompra(String compra) {
        this.compra = compra;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void setValorcompra(float valorcompra) {
		this.valorcompra = valorcompra;
	}

    public String imprimir(){
    	String text;
    	text = "\nDados do Cliente: \n";
        String impressao =  "\nNome: " + nome +
        					"\nIdade: " + idade +
        					"\nData de Nascimento: " + datanasc +
        					"\nCPF: " + cpf + 
                            "\nTelefone: " + telefone +
                            "\nEndereco: " + endereco +
                            "\nValor da compra: R$" + valorcompra;
                            
                             
        return text + impressao;
    }
    
    public void cadastrarPessoa() {
        nome = JOptionPane.showInputDialog("Digite o nome do cliente"); 
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Cliente"));
        datanasc =  JOptionPane.showInputDialog("Digite a data de nascimento do Cliente \n(dd/mm/aaaa)");
        cpf = JOptionPane.showInputDialog("Digite o cpf do cliente \n(###.###.###-##)"); 
        endereco=JOptionPane.showInputDialog("Digite o endereço do cliente"); 
        telefone = JOptionPane.showInputDialog("Digite o telefone do cliente");        
        compra= JOptionPane.showInputDialog("Para sabermos o valor da compra digite \na placa do veículo (AAA-####)");
        valorcompra = 0f;
    }



	

}
