package modelo_vista_controlador;

public class Producto {

    private Long id; 
    private String nombre;
    private String marca;
    private Double precio;
    private Integer stock;
    private Integer garantiaMeses;
    private Boolean refurbished;

    public Producto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(Integer garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public Boolean getRefurbished() {
		return refurbished;
	}

	public void setRefurbished(Boolean refurbished) {
		this.refurbished = refurbished;
	}
    
    
    
}