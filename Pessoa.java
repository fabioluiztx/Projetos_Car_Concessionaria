
public abstract class Pessoa {
	
	protected String nome;
    protected int idade;
    protected String datanasc;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    
    
public Pessoa() {}    

protected Pessoa(String n, int i, String d, String c, String e, String t) {
	nome = n;
	idade = i;
	datanasc = d;
    cpf = c; 
    endereco = e;
    telefone = t;
}    
	
	

//métodos de acesso
//leitura
public String getNome() {
    return nome;
}

public String getCpf() {
    return cpf;
}

public String getTelefone() {
    return telefone;
}

public String getEndereco() {
    return endereco;
}

public int getIdade() {
	return idade;
}

public String getDatanasc() {
	return datanasc;
}

//escrita
public void setNome(String nome) {
    this.nome = nome;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public void setDatanasc(String datanasc) {
	this.datanasc = datanasc;
}

public abstract String imprimir();

}



