/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Cetecom
 */
public class Transaccion {
    private int id;
    private Date fecha;
    private String tipoTransaccion;
    private int montoTotal;
    private Vehiculo idVehiculo;
    private Cliente rutCliente;

    public Transaccion() {
    }

    public Transaccion(int id, Date fecha, String tipoTransaccion, int montoTotal, Vehiculo idVehiculo, Cliente rutCliente) {
        this.id = id;
        this.fecha = fecha;
        this.tipoTransaccion = tipoTransaccion;
        this.montoTotal = montoTotal;
        this.idVehiculo = idVehiculo;
        this.rutCliente = rutCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Vehiculo getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Vehiculo idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Cliente getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Cliente rutCliente) {
        this.rutCliente = rutCliente;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "id=" + id + ", fecha=" + fecha + ", tipoTransaccion=" + tipoTransaccion + ", montoTotal=" + montoTotal + ", idVehiculo=" + idVehiculo + ", rutCliente=" + rutCliente + '}';
    }
    
    
}
