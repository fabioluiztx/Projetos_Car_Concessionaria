
import javax.swing.JOptionPane;


public class Vendedor extends Pessoa {
	private int id;
	private float valorvenda;
	private float totalvendido;
	private float mediaporvenda;
	private float quantvendas;
	
	
	
public Vendedor() {}

protected Vendedor(String n, int i, String d, String c, String e, String t, int idd, float vv, float tv, float mpv, int qtdev) {
	super(n, i, d, c, e, t);
	id = idd;
	valorvenda = vv;
	totalvendido = tv;
	mediaporvenda = mpv;
	quantvendas = qtdev;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public float getTotalvendido() {
	return totalvendido;
}

public void setTotalvendido(float totalvendido) {
	this.totalvendido = totalvendido;
}

public float getValorvenda() {
	return valorvenda;
}

public void setValorvenda(float valorvenda) {
	this.valorvenda = valorvenda;
}

public float getMediaporvenda() {
	return mediaporvenda;
}

public void setMediaporvenda(float mediaporvenda) {
	this.mediaporvenda = mediaporvenda;
}

public float getQuantvendas() {
	return quantvendas;
}

public void setQuantvendas(float quantvendas) {
	this.quantvendas = quantvendas;
}

public String imprimirVenda() {
	String text = "\nDados do vendedor: "
			+ "\nId: " + id
			+ "\nNome: " + nome 
			+ "\nValor da venda: " + valorvenda
			+ "\nValor vendido: R$" + totalvendido
			+ "\nQuant. de vendas: " + quantvendas  
			+ "\nMédia por vendas: R$" + mediaporvenda;
					
	return text;
}

public String imprimir() {
	String text = "\nDados do vendedor: "
			+ "\nId: " + id
			+ "\nNome: " + nome 
			+ "\nValor vendido: R$" + totalvendido
			+ "\nQuant. de vendas: " + quantvendas  
			+ "\nMédia por vendas: R$" + mediaporvenda;
					
	return text;
}
//sobrecarga
public String imprimir(Vendedor v){
		String	text = "\nDados do vendedor: " 
			+ "\nId: " + id +
			"\nNome: " + nome +
			"\nIdade: " + idade +
			"\nData de Nascimento: " + datanasc +
			"\nCPF: " + cpf + 
            "\nTelefone: " + telefone +
            "\nEndereco: " + endereco;	
	return text;
	
	
	
}

public void cadastrarPessoa() {
    nome = JOptionPane.showInputDialog("Digite o nome do Vendedor"); 
    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Vendedor"));
    datanasc =  JOptionPane.showInputDialog("Digite a data de nascimento do Vendedor \n(dd/mm/aaaa)");
    cpf = JOptionPane.showInputDialog("Digite o cpf do Vendedor \n(###.###.###-##)"); 
    endereco=JOptionPane.showInputDialog("Digite o endereço do Vendedor"); 
    telefone = JOptionPane.showInputDialog("Digite o telefone do Vendedor");
    id = 0;
    valorvenda = 0;
    totalvendido = 0;
	mediaporvenda = 0;
	quantvendas = 0;
    
}


}
