
package LeVonVivantRobot;

import java.util.Scanner;

public class Robot{
    
    private String nombre;
    private String tienda;
    private int codigo;
    
Scanner t= new Scanner(System.in);
    
//Constructor para crear un nuevo robot vacio INICO
     public Robot(){
     }
//Constructor para crear un nuevo robot vacio FIN
       
//Constructor para crear un nuevo robot INICO
     public Robot(String nom, String t, int cod){
         this.nombre=nom;
         this.tienda=t;
         this.codigo=cod;
     }
//Constructor para crear un nuevo robot FIN

    //set/get nombre INICIO
public String setNombre(String nom){
return this.nombre=nom;
}
public String getNombre(String nom){
return this.nombre=nom;
}
    //set/get nombre FIN

    //set/get tienda INICIO
public String setTienda(String t){
return this.tienda=t;
}
public String getTienda(String t){
return this.tienda=t;
}
    //set/get tienda FIN

    //set/get codigo INICIO
public int setCodigo(int cod){
return this.codigo=cod;
}
public int getCodigo(int cod){
return this.codigo=cod;
}
    //set/get codigo FIN

//Agregar objetos a la charrola INICIO
    //cafes
          //capuccino
public float OrdenarCafeCapuccino(float cant, float penvase){
    String Cafe=" Café Capuccino";
    System.out.println("Se agregaron correctamente: ");
    System.out.println(cant+Cafe);
    float CafesPedidos=penvase*cant;
    return CafesPedidos;
}
public float OrdenarCafeMokaccino(float cant, float penvase){
    String Cafe=" Café Mokaccino";
    System.out.println("Se agregaron correctamente: ");
    System.out.println(cant+Cafe);
    float CafesPedidos=penvase*cant;
    return CafesPedidos;
}
public float OrdenarCafeAmericano(float cant, float penvase){
    String Cafe=" Café Americano";
    System.out.println("Se agregaron correctamente: ");
    System.out.println(cant+Cafe);
    float CafesPedidos=penvase*cant;
    return CafesPedidos;
}
public float OrdenarCafeCanelaC(float cant, float penvase){
    String Cafe=" Cafe Canela/Chile";
    System.out.println("Se agregaron correctamente: ");
    System.out.println(cant+Cafe);
    float CafesPedidos=penvase*cant;
    return CafesPedidos;
}
public float OrdenarCafeFrapuccino(float cant, float penvase){
    String Cafe=" Cafe Frapuccino";
    System.out.println("Se agregaron correctamente: ");
    System.out.println(cant+Cafe);
    float CafesPedidos=penvase*cant;
    return CafesPedidos;
}
public float OrdenarCafeCanCaj(float cant, float penvase){
    String Cafe=" Cafe Canela/Cajeta";
    System.out.println("Se agregaron correctamente: ");
    System.out.println(cant+Cafe);
    float CafesPedidos=penvase*cant;
    return CafesPedidos;
}
//Agregar objetos a la charrola FIN
//Charola INICIO
public void MostrarCharola(float Total, float SubTotal, float IVA,float TotalCafes, float TotalPostres,float TotalCafesCalientes, float TotalCafesFrios){
    System.out.println("");
    System.out.println("");
    System.out.println("===== Cafeteria LeVonViVant =====");
    System.out.println("Le presento su orden a detalle");
    System.out.println("=o=o=o=o=o=o=o=o=o=o=o=o=o=o=o=o=");
    System.out.println("Cafes Calientes............$"+TotalCafesCalientes);
    System.out.println("Cafes Frios................$"+TotalCafesFrios);
    System.out.println("Total de Bebidas.................$"+TotalCafes);
    System.out.println("Total de Postres.................$0");
    System.out.println("               SubTotal.........."+SubTotal);
    System.out.println("               IVA..............."+IVA);
    System.out.println("               Total............."+Total);
}
public void Pagar(){
    System.out.println("Ingresa el numero de tarjeta de Debito/Credito");
    int tarjeta=t.nextInt();
    System.out.println("Ingresa la fecha de vencimiento");
    int fecha=t.nextInt();
    System.out.println("Ingresa el CVV");
    int cvv=t.nextInt();
    System.out.println("preparando tu orden disfruta tus bebidas y que tengas un buen dia");
}
//Charola FINAL
//Calcular Costos INICIO
public float CalcularTotalExtras(float pexazucar,float  pexcrema,float  pexcafe){
    float TotalExtras=pexazucar+pexcrema+pexcafe;
    return TotalExtras;
}
public float CalcularTotal(float SubTotal,float IVA){
    float Total=SubTotal+IVA;  
    return Total;
}
public float CalcularSubTotal( float TotalExtras, float TotalPedido){
    float SubTotal=TotalExtras+TotalPedido;
    return SubTotal;
}
public float CalcularTotalPedido(float TotalCafes, float TotalPostres){
    float TotalPedido=TotalCafes+TotalPostres;
    return TotalPedido;
}
public float CalcularTotalCafes(float TotalCafes,float CafesCalientesPedidos, float CafesFriosPedidos){
    TotalCafes=TotalCafes+CafesFriosPedidos+CafesCalientesPedidos;
    return TotalCafes;
}
public float CalcularTotalCafesCalientes(float TotalCafesCalientes,float CafesCalientesPedidos){
    TotalCafesCalientes=TotalCafesCalientes+CafesCalientesPedidos;
    return TotalCafesCalientes;
}
public float CalcularTotalCafesFrios(float TotalCafesFrios,float CafesFriosPedidos){
    TotalCafesFrios=TotalCafesFrios+CafesFriosPedidos;
    return TotalCafesFrios;
}
public float CalcularTotalPostres(float TotalPostres,float PostresCalientesPedidos, float PostresFriosPedidos){
    TotalPostres=TotalPostres+PostresCalientesPedidos+PostresFriosPedidos;
    return TotalPostres;
}
public float CalcularTotalPostresFrios(float TotalPostresFrios,float PostresFriosPedidos){
    TotalPostresFrios=TotalPostresFrios+PostresFriosPedidos;
    return TotalPostresFrios;
}
public float CalcularTotalPostresCalientes(float TotalPostresCalientes,float PostresCalientesPedidos){
    TotalPostresCalientes=TotalPostresCalientes+PostresCalientesPedidos;
    return TotalPostresCalientes;
}
public float CalcularIVA(float SubTotal){
    float IVA=(SubTotal*0.16f)+SubTotal;
    return IVA;
}
//Calcular Costos FIN
}

