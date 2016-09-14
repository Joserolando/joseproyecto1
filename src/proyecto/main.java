/**
 * 
 */
package proyecto;

/**
 * clase principal
 * @author jose fuentes
 * @vercion 1.0 13/09/2016
 * 
 *
 */
public class main {

	/**
	 * funcion principal-inicia el programa
	 * @param args
	 */
	public static void main(String[] args) {
		
		//declarar
		Sillon silloncito1;
		Sillon silloncito2;
		
		//instanciar
		silloncito1=new Sillon();
		silloncito2=new Sillon("samsung",100 , 5000,200 ,"fierro" ,3 );
		
		//modifica 
		silloncito1.setAltura(100);
		silloncito1.setCapacidad(3);
		silloncito1.setCosto(1000);
		silloncito2.setFabricante("madensa");
		
		//obtener
		//System.out.println(silloncito1.getAltura());
		//System.out.println(silloncito1.getCapacidad());
		System.out.println(silloncito2.getFabricante());
	}

}
