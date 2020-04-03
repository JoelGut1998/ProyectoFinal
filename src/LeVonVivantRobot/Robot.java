
package LeVonVivantRobot;

public class Robot{
    
    private String nombre;
    private String tienda;
    private int codigo;
    
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

}

