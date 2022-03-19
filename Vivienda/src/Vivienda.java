/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 */
public class Vivienda 
{
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public Vivienda (double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
        
    }
    
    public double GetPrecio () {
        return precio;
    }
    
    public int GetNumHabitaciones () {
        return numHabitaciones;
    }
    
    public double GetSuperficie () {
        return superficie;
    }
    
    public boolean GetParking () {
        return parking;
    }
    
    public String GetEstado () {
        return estado;
    }
    
    public String GetPropietario () {
        return propietario;
    }
    
    public void SetPrecio (double precio) {
        this.precio = precio;
    }
    
    public void SetNumHabitaciones (int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    public void SetSuperficie (double superficie) {
        this.superficie = superficie;
    }
    
    public void SetParking (boolean parking) {
        this.parking = parking;
    }
    
    public void SetEstado (String estado) {
        this.estado = estado;
    }
    
    public void SetPropietario () {
        this.propietario = propietario;
    }
    
    public void actualizarPrecio(double descuento)
    {
        precio = precio - ((descuento / 100) * precio);
    }
    
    public static void ImprimirVivienda(Vivienda casa1) {
        
        System.out.println("Precio: "+casa1.GetPrecio());
        System.out.println("Número de habitaciones: "+casa1.GetNumHabitaciones());
        System.out.println("Superficie en m2: "+casa1.GetSuperficie());
        System.out.println("¿Dispone de parking?: "+casa1.GetParking());
        System.out.println("Estado: "+casa1.GetEstado());
        System.out.println("Propietario: "+casa1.GetPropietario());
        
    }
}