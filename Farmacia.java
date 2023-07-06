import java.util.ArrayList;

/**
 * Write a description of class Farmacia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farmacia
{
    private final String nit;
    private String nombreFarmacia;
    private String direccion;
    private ArrayList cliente;  
    
    public Farmacia(String nit,String nombreFarmacia,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreFarmacia(nombreFarmacia);
        setDireccion(direccion);        
        cliente = cliente = new ArrayList();
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreFarmacia(){
        return nombreFarmacia;
    }
    public void setNombreFarmacia(String nombreFarmacia){
        if(nombreFarmacia != null){
            this.nombreFarmacia = nombreFarmacia;
        }else{
            this.nombreFarmacia = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < cliente.size(); i++){
            promedio += ((Cliente)cliente.get(i)).calcularPromedio();
        }

        return promedio / 3;
    }
    
    public void adicionarCliente(String identificacion, String nombre, String sucursal, double compra1, double compra2)throws Exception{
        cliente.add(new ClienteHelado(identificacion, nombre, sucursal, compra1, compra2));
    }
    
    public void adicionarCliente(String identificacion, String nombre, String sucursal, double compra1, double compra2, double compra3)throws Exception{
        cliente.add(new ClienteCosmeticos(identificacion, nombre, sucursal, compra1, compra2, compra3));
    }
    
    public void adicionarCliente(String identificacion, String nombre, String sucursal, double compra1, double compra2, double compra3, double compra4)throws Exception{
        cliente.add(new ClienteMedicamento(identificacion, nombre, sucursal, compra1, compra2, compra3, compra4));
    }
}
