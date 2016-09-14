/**
 * 
 */
package proyecto;

/**
 * @author jose fuentes
 * @vercion 1.0 13/09/2016
 * 
 * El sillon representa un sillon en la vida real
 *
 */
public class Sillon {
	private String fabricante;
	private int peso;
	private int costo;
	private float altura;
	private String material;
	private int capacidad;
	/**
	 * Constructor con todos los parametros
	 * @param fabricante valor del fabricante del sillon
	 * @param pesovalor del peso del sillon
	 * @param costo valor monetario del sillon
	 * @param altura valor con punto flotante del sillon
	 * @param material material del sillon
	 * @param capacidad cuantas personas caben en el sillon
	 */
	public Sillon(String fabricante, int peso, int costo, float altura, String material, int capacidad) {
		this.fabricante = fabricante;
		this.peso = peso;
		this.costo = costo;
		this.altura = altura;
		this.material = material;
		this.capacidad = capacidad;
	}
	/**
	 * constructor sin parametros
	 */
	public Sillon() {
	}
	/**
	 * metodo para obtener la altura del sillon
	 * @return la altura
	 */
	
	public float getAltura() {
		return altura;
	}
	/**
	 * metodo para modificar la altura del sillon
	 * @param altura modifica la altura
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}
	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	/**
	 * @return the costo
	 */
	public int getCosto() {
		return costo;
	}
	/**
	 * @param costo the costo to set
	 */
	public void setCosto(int costo) {
		this.costo = costo;
	}
	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}
	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	

}
