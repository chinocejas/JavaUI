package Interfaz;
import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaCentrada miventana=new VentanaCentrada();
		miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class VentanaCentrada extends JFrame{
	
	public VentanaCentrada(){
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tampant=mipantalla.getScreenSize();
		int alturamax=tampant.height;
		int anchomax=tampant.width;
		
		setSize(anchomax/2,(alturamax-(alturamax/4)));
		setLocation(anchomax/4,alturamax/7);
		//Inicia a Pantalla Completa
		setExtendedState(Frame.MAXIMIZED_BOTH); 
		setTitle("TP DISEÑO DE SISTEMAS");
		setVisible(true);
		
		Layer layer1=new Layer();
		add(layer1);
		
		
		
	}
	public int getAltura(){
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tampant=mipantalla.getScreenSize();
		int alturamax=tampant.height;
		return alturamax;	
	}
	public int getAnchura(){
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tampant=mipantalla.getScreenSize();
		int anchomax=tampant.width;
		return anchomax;
	}
}

class Layer extends JPanel{
	
	public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("Ingreso", 100, 100);
	}
	
	
}
