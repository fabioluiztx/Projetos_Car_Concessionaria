import javax.swing.JOptionPane;


public class Caminhao extends Veiculo{
	//atributos
    private String tipo;
    private int qtdeeixo;
    
    //construtor padrão
    public Caminhao() {}
    
    //construtor com parâmetros
    public Caminhao(String ma, String mo, int an,String cr, String combust,String trans, double quilo, String pl, float va, String tpcaminhao, int qtdee){
        super(ma, mo, an, cr, combust, trans, quilo, pl, va);
        tipo = tpcaminhao;
        qtdeeixo = qtdee;
    }

 

	public String getTipo() { 
    	return tipo; 
    	}
    
    public void setTipo(String tipo) {
    		this.tipo = tipo; 
    	}
    
	public int getQtdeeixo() {
		return qtdeeixo;
	}


	public void setQtdeeixo(int qtdeeixo) {
		this.qtdeeixo = qtdeeixo;
	}
    //override
    public String imprimir(){
    	String text = "\nDados do Veículo:"
    				+"\nCaminhão ";
        String impressao =("\nTipo do caminhão: "+ tipo 
        				  +"\nQuantidade de eixos: " + qtdeeixo);
        return text + super.imprimir() + impressao;

    }

   
    public void cadastrarVeiculo() {
        setMarca(JOptionPane.showInputDialog("Digite o fabricante do caminhão")); 
        setModelo(JOptionPane.showInputDialog("Digite o modelo do caminhão")); 
        setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do caminhão"))); 
        setCor(JOptionPane.showInputDialog("Digite a cor do caminhão"));
        setCombustivel(JOptionPane.showInputDialog("Digite o tipo de combustível do caminhão"));
        setTransmissao(JOptionPane.showInputDialog("Digite o tipo de transmissão do caminhão \n(Manual, Automático)"));
        setQuilometragem(Double.parseDouble(JOptionPane.showInputDialog("Digite a quilômetragem do caminhão")));
        setPlaca(JOptionPane.showInputDialog("Digite a placa do caminhão (AAA-####)")); 
        setValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do caminhão"))); 
        tipo= JOptionPane.showInputDialog("Digite o tipo do caminhão \n(Ex: VUC 3/4, Truck, Toco, Carreta, Cegonha, Prancha) "); 
    	qtdeeixo = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de eixos do caminhão \n(2, 3, 4, 5, 7 ou 9"));
    	
    }




}