package LeVonVivantMenus;

import java.util.Scanner;

public class Menu {
            
    Scanner t=new Scanner(System.in);
    
    public void MenuPrincipal(){
        System.out.println("");
        System.out.println("");
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("Gusto en atenderlo... ¿Qué le puedo ofrecer?");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("1.Cafes");
        System.out.println("2.Postres");
        System.out.println("3.Ver orden");
        System.out.println("4.Finalizar Orden");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
    }
    public void MenuCafe(){
        System.out.println("");
        System.out.println("");
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("¿Que tipo de Cafe desea degustar?");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("1.Cafes Frios");
        System.out.println("2.Cafes Calientes");
        System.out.println("3.Regresar");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
    }
    public void MenuCafeFrio(){
        System.out.println("");
        System.out.println("");
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("Te muestro las bebidas cafeteras frias que tengo disponibles...");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("1.Canela y chile...$16");
        System.out.println("2.Frapuccino.......$25");
        System.out.println("3.Canela y Cajeta..$30");
        System.out.println("4.Regresar");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
    }
    public void MenuCafeCaliente(){
        System.out.println("");
        System.out.println("");
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("¿Buscas algo caliente?. Tengo las siguientes opciones para ti...");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("1.Capuccino ..........$18");
        System.out.println("2.Mokaccino ..........$30");
        System.out.println("3.Americano ..........$25");
        System.out.println("4.Regresar");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
    }
    public int Cantidad(int cant)
    {
        System.out.println("");
        System.out.println("");
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("¿Cuantos articulos vas a ordenar?");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Ingrese el numero de cafes a preparar");
        cant=t.nextInt();
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        return cant;
    }
    public void MenuPrepararCafeCaliente(int gazucar, int gcafe, int tam, int gcrema, String tazucar){
        System.out.println("");
        System.out.println("");
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("Su cafe se preparara con la sigueinte receta tradicional");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("**Cantidad de azucar**");
        System.out.println("Cantidad: "+gazucar+" g de azucar "+tazucar);
        System.out.println("**Cantidad de cafe**");
        System.out.println("Cantidad: "+gcafe+" g");
        System.out.println("**Tamaño de envase**");
        System.out.println("Cantidad: "+tam+ " ml");
        System.out.println("**Cantidad de crema cafetera**");
        System.out.println("Cantidad: "+gcrema+" g");
        System.out.println("¿Desea agregar algun extra o modificar los componentes?");
        System.out.println("1-Si");
        System.out.println("2-No");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
    }
    public void MenuPersonalizableCafeCaliente(int gazucar, int gcafe, int Tamaño, int Gcrema, String tazucar){
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("Personaliza tu cafe para la preparacion adecuada a tu gusto");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("**Cantidad de azucar**");
        System.out.println("Actual: "+gazucar+" g de azucar "+tazucar);
        System.out.println("Presione '1' para modificar el azucar");
        System.out.println("**Cantidad de cafe**");
        System.out.println("Actual: "+gcafe+" g");
        System.out.println("Presione '2' para modificar el cafe");
        System.out.println("**Tamaño de envase**");
        System.out.println("Actual: "+Tamaño+ " ml");
        System.out.println("Presione '3' para modificar el tamaño del envase");
        System.out.println("**Cantidad de crema cafetera**");
        System.out.println("Actual: "+Gcrema+" g");
        System.out.println("Presione '4' para modificar la crema para cafe");
        System.out.println("Presione '5' para terminar de perzonalizar su cafe");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
    }
    public String TipoAzucar(String tazucar){
        System.out.println("");
        System.out.println("");
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("¿Algun tipo de azucar especifico?");
        System.out.println("Actual: "+tazucar);
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("1.Glass");
        System.out.println("2.Splenda");
        System.out.println("3.Convencional");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
        int tazu=t.nextInt();
        //seleccion de tipo de azucar INICIO
        if(tazu==1)
        {
            return tazucar="Glass";
        }
        else
        {
            if(tazu==2)
            {
               return tazucar="Splenda";
            }
            else
            {
               return tazucar="Convencional";
            }
        }
        //Seleccion tipo de azucar FIN
        }
    public int CantidadAzucar(int gazucar){
        System.out.println("");
        System.out.println("");
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("¿Ingresa el numero de cucharadas de azucar que deseas?");
        System.out.println("Costo por cucharada $2");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
        int c=t.nextInt();
        gazucar=c*5;
        return gazucar;
        }
    public int CantidadCafe(int gcafe){
        System.out.println("");
        System.out.println("");
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("¿Cuantas cucharadas de cafe deseas??");
        System.out.println("Costo por cucharada $8");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
        int c=t.nextInt();
        gcafe=c*10;
        return gcafe;
        }
    public int TamEnvase(int tam){
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("Le presentamos los tamaños disponibles");
        System.out.println("Actual: "+tam);
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("1.Chico ..........$18");
        System.out.println("2.Mediano ........$25");
        System.out.println("3.Grande .........$30");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
        int te=t.nextInt();
        //seleccion de tipo de tamaño INICIO
        if(te==1)
        {
            return tam=255;
        }
        else
        {
            if(te==2)
            {
               return tam=655;
            }
            else
            {
               return tam=955;
            }
        }
        //Seleccion tipo de tamaño FIN
        }
    public int CantidadCrema(int gcrema){
        System.out.println("");
        System.out.println("");
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("¿Cuantas cucharadas de crema cafetera deseas??");
        System.out.println("Costo por cucharada $5");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
        int c=t.nextInt();
        gcrema=c*8;
        return gcrema;
        }
    public float PrecioExtraCrema(float pexcrema, float gcrema)
    {
        pexcrema=((gcrema/8)-1)*5;
        return pexcrema;
    }
    public float PrecioExtraCafe(float pexcafe, float gcafe)
    {
        pexcafe=((gcafe/10)-1)*8;
        return pexcafe;
    }
    public float PrecioExtraAzucar(float pexazucar, float gazucar)
    {
        pexazucar=((gazucar/5)-1)*2;
        return pexazucar;
    }
    public float PrecioEnvase(float penvase, float tam)
    {
        if (tam==255){
        penvase=18f;
        }
        if (tam==655){
        penvase=25f;
        }
        if (tam==955){
        penvase=30f;
        }
        return penvase;
    }
    
}