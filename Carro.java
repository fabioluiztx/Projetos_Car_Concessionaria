import javax.swing.JOptionPane;

public class Carro extends Veiculo{
    private String tipo;
    private int qtdeporta;
    

    public Carro(String ma, String mo, int an,String cr, String combust,String trans, double quilo, String pl, float va, String tpcarro, int qtdepor){
        super(ma, mo, an, cr, combust, trans, quilo, pl, va);
        tipo = tpcarro;
        qtdeporta = qtdepor;
    }

    public String getTipo() { 
    	return tipo; 
    	}
    
    public void setTipo(String tipo) { 
    	this.tipo = tipo;
    	}
    
    public int getQtdeporta() {
		return qtdeporta;
	}

	public void setQtdeporta(int qtdeporta) {
		this.qtdeporta = qtdeporta;
	}
    
    //override
    public String imprimir(){
        String text = 	"\nDados do Veículo: "
        				+ "\nCarro";
    	String impressao = "\nTipo de carro: "+ tipo
        				 + "\nQuant. de portas: " + qtdeporta;
        return text + super.imprimir() + impressao;
    }

    public void cadastrarVeiculo() {
		setMarca(JOptionPane.showInputDialog("Digite o fabricante do carro")); 
        setModelo(JOptionPane.showInputDialog("Digite o modelo do carro")); 
        setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro"))); 
        setCor(JOptionPane.showInputDialog("Digite a cor do carro"));
        setCombustivel(JOptionPane.showInputDialog("Digite o tipo de combustível do carro"));
        setTransmissao(JOptionPane.showInputDialog("Digite o tipo de transmissão do carro \n(Manual, Automático, Semiautomático, CVT):"));
        setQuilometragem(Double.parseDouble(JOptionPane.showInputDialog("Digite a quilômetragem do carro")));
        setPlaca(JOptionPane.showInputDialog("Digite a placa do carro (AAA-####)")); 
        setValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do carro"))); 
        tipo = JOptionPane.showInputDialog("Digite o tipo do Carro \n(Sedã, hatch, Pickup, SUV, Sport, Van)"); 
		qtdeporta = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas"));
       
	}

	





}
