import javax.swing.JOptionPane;

public class Moto extends Veiculo{
    private String tipo;
    private String cilindradas;
    
    public Moto() {}
    
    public Moto(String ma, String mo, int an, String cr, String combust,String trans, double quilo, String pl, float va, String tpmoto, String cilin){
        super(ma, mo, an, cr, combust, trans, quilo, pl, va);
        tipo = tpmoto;
        cilindradas = cilin;
    }

    public String getTipo() { 
    	return tipo; 
    	}
    
    public void setTipo(String tipo) {
    		this.tipo = tipo; 
    	}
    
    public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}
	
    //override
    public String imprimir(){
    	String text = "\nDados do veículo: "
    				+ "\nMoto ";
        String impressao ="\nTipo da Moto: "+ tipo 
        				 + "\nCilindradas: " + cilindradas;
        return text + super.imprimir() + impressao;
    }

    public void cadastrarVeiculo() {
    	
		setMarca(JOptionPane.showInputDialog("Digite o fabricante da Moto")); 
        setModelo(JOptionPane.showInputDialog("Digite o modelo da Moto")); 
        setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da Moto"))); 
        setCor(JOptionPane.showInputDialog("Digite a cor da Moto"));
        setCombustivel(JOptionPane.showInputDialog("Digite o tipo de combustível da Moto"));
        setTransmissao(JOptionPane.showInputDialog("Digite o tipo de transmissão da moto (Manual, Automático, Sem Embreagem:"));
        setQuilometragem(Double.parseDouble(JOptionPane.showInputDialog("Digite a quilômetragem da Moto")));
        setPlaca(JOptionPane.showInputDialog("Digite a placa da Moto (AAA-####)")); 
        setValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da Moto"))); 
        tipo = JOptionPane.showInputDialog("Digite o tipo da Moto (Street, Scooter, Chopper, Bigtrail, Sport, Offroad, Touring)"); 
        cilindradas = JOptionPane.showInputDialog("Digite as cilindradas da Moto (Ex: 150cc, 300cc, 600cc)"); 
       
	}

	
}
