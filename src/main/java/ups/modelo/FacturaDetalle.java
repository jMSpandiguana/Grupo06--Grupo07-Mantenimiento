/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.modelo;

/**
 *
 * @author dilgg
 */
public class FacturaDetalle {
    private int codigo;
    private String descripDetalle;
    private int cantidad;
    private ConsultaMedica codConsul;
    private double total;
    private FacturaCabecera codFactura;
    private int valorUnitario;
    private int cantidadProducto;

    public FacturaDetalle() {
    }

    public FacturaDetalle(int codigo, String descripDetalle, int cantidad, ConsultaMedica codConsul, double total, FacturaCabecera codFactura, int valorUnitario, int cantidadProducto) {
        this.codigo = codigo;
        this.descripDetalle = descripDetalle;
        this.cantidad = cantidad;
        this.codConsul = codConsul;
        this.total = total;
        this.codFactura = codFactura;
        this.valorUnitario = valorUnitario;
        this.cantidadProducto = cantidadProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripDetalle() {
        return descripDetalle;
    }

    public void setDescripDetalle(String descripDetalle) {
        this.descripDetalle = descripDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ConsultaMedica getCodConsul() {
        return codConsul;
    }

    public void setCodConsul(ConsultaMedica codConsul) {
        this.codConsul = codConsul;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public FacturaCabecera getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(FacturaCabecera codFactura) {
        this.codFactura = codFactura;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
 
   //Metodo para calcular el valor total del producto
    public double valorTotal(){
        total = valorUnitario*cantidadProducto;
        return total;
    }
    
}
