package modelo_vista_controlador;

public class LineaPedido {

    private Long id_LineaPedido;
    private Integer cantidad;
    private Double precioUnitario;
    private Double subtotal;

    public LineaPedido() {
    }

    public Long getId() {
        return id_LineaPedido;
    }

    public void setId(Long id) {
        this.id_LineaPedido = id;
    }

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
    
    
    
}
