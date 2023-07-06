import java.util.Scanner;

/**
 * Write a description of class Compras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Compras
{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Farmacia miFarmacia = new Farmacia("123456","Balmoral","Fusa");
        String identificacion, nombre, sucursal;
        double compra1, compra2, compra3, compra4;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar Cliente de Helados: ");
            System.out.println("[2]- Adicopnar Cliente de Cosmeticos: ");
            System.out.println("[3]- Adicionar Cliente de Medicamentos: ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Cliente: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Cliente: ");
                        nombre = sc.next();
                        System.out.println("Digite el sucursal del Cliente: ");
                        sucursal = sc.next();
                        System.out.println("Digite primera compra del Cliente: ");
                        compra1 = sc.nextDouble();
                        System.out.println("Digite segunda compra del Cliente: ");
                        compra2 = sc.nextDouble();
                        try{
                            miFarmacia.adicionarCliente(identificacion, nombre, sucursal, compra1, compra2);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Cliente: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Cliente: ");
                        nombre = sc.next();
                        System.out.println("Digite el sucursal del Cliente: ");
                        sucursal = sc.next();
                        System.out.println("Digite primera compra del Cliente: ");
                        compra1 = sc.nextDouble();
                        System.out.println("Digite segunda compra del Cliente: ");
                        compra2 = sc.nextDouble();          
                        System.out.println("Digite tercera compra del Cliente: ");
                        compra3 = sc.nextDouble();
                        try{                        
                        miFarmacia.adicionarCliente(identificacion, nombre, sucursal, compra1, compra2, compra3);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 3:
                        sc.nextLine();                        
                        System.out.println("Digite la Identificacion del Cliente: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Cliente: ");
                        nombre = sc.next();
                        System.out.println("Digite el sucursal del Cliente: ");
                        sucursal = sc.next();
                        System.out.println("Digite primera compra del Cliente: ");
                        compra1 = sc.nextDouble();
                        System.out.println("Digite segunda compra del Cliente: ");
                        compra2 = sc.nextDouble();          
                        System.out.println("Digite tercera compra del Cliente: ");
                        compra3 = sc.nextDouble();
                        System.out.println("Digite cuarta compra del Cliente: ");
                        compra4 = sc.nextDouble();
                        try{                         
                        miFarmacia.adicionarCliente(identificacion, nombre, sucursal, compra1, compra2, compra3, compra4);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 4:
                        sc.nextLine();
                        promedio = miFarmacia.calcularPromedioGeneral();
                        System.out.println("\n El promedio de compras es: " + promedio); 
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(opcionMenu != 5);
    }
}
