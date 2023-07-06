
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Cliente
{
    protected final String identificacion;
    private String nombre;
    private String sucursal;
    
    public Cliente(String identificacion, String nombre, String sucursal)throws Exception{
        if(identificacion.trim().equals(""))
            throw new Exception("Valor invalido en la identificacion");
            
        if(identificacion.matches(".*[a-zA-Z].*"))
            throw new Exception("La identificacion no puede tener caracteres");
        
        this.identificacion = identificacion;
        setNombre(nombre);
        setSucursal(sucursal);
    }
    
    public abstract double calcularPromedio();
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getSucursal(){
        return sucursal;
    }
    public void setSucursal(String sucursal){
        if(sucursal != null) this.sucursal = sucursal;
        else this.sucursal = "";
    }
}
