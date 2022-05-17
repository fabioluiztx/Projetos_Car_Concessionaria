

public abstract class Veiculo {
	private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String combustivel;
    private String transmissao;
    private double quilometragem;
    protected String placa;
    protected float valor;
    
    //construtor padrão
    public Veiculo() {}
    //construtor
    public Veiculo(String ma, String mo, int an,String cr, String combust,String trans, double quilo, String pl, float va){
    	marca = ma;
        modelo = mo;
        ano = an;
        cor = cr;
       	combustivel = combust;
       	transmissao = trans;
       	quilometragem = quilo;
        placa = pl;
        valor = va; 
    }
    
    //métodos de acesso
    public String getMarca() {  
        return marca; 
    }
    
    public String getModelo() { 
        return modelo;  
    }
    
    public int getAno() { 
        return ano;  
    }
    
    public String getCombustivel() {
    	return combustivel;
    }
    
    public String getTransmissao() {
    	return transmissao;
    }
    
    public double getQuilometragem() {
    	return quilometragem;
    }
    
    public String getPlaca() { 
        return placa;  
    }
    
    public float getValor() { 
        return valor;  
    }
    
    public void setMarca (String marca) { 
        this.marca = marca; 
    }
    
    public void setModelo (String modelo) { 
        this.modelo = modelo; 
    }
    
    public void setAno (int ano) { 
        this.ano = ano; 
    }
    
    public void setPlaca (String placa) { 
        this.placa = placa; 
    }
    
    public void setValor (float valor) { 
        this.valor = valor; 
    }
    
    public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public void setTransmissao(String transmissao) {
		this.transmissao = transmissao;
	}
	
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	//métodos
    public String imprimir(){
        String impressao = "\nMarca: " + marca 
        				 + "\nModelo: " + modelo 
        				 + "\nAno do veículo: " + ano 
        				 + "\nCor: " + cor  
        				 + "\nTipo de combústivel: " + combustivel 
        				 + "\nTransmissão: " + transmissao
        				 + "\nQuilômetragem: " + quilometragem +"km"
        				 + "\nPlaca do veiculo: " + placa 
        				 + "\nValor do veiculo: R$" + valor;
        return impressao;
    }
    
    


	
	

	

}
