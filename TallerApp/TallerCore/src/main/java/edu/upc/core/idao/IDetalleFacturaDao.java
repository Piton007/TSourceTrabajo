package edu.upc.core.idao;

import java.util.List;

import edu.upc.core.entity.DetalleFactura;



public interface IDetalleFacturaDao {
	public void insertDetalleFactura(DetalleFactura df);
	public void updateDetalleFactura(DetalleFactura df);
	public void deleteDetalleFactura(DetalleFactura df);
	public List<DetalleFactura> listarDetalleFactura();
	public DetalleFactura ObtenerDetalleFactura(int codigoDetalleFactura);

}
