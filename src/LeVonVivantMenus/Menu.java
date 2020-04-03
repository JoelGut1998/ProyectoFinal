package LeVonVivantMenus;

public class Menu {
    
    public void MenuPrincipal(){
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
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("Te muestro las bebidas cafeteras frias que tengo disponibles...");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("1.Cafes Frios");
        System.out.println("2.Cafes Calientes");
        System.out.println("3.Regresar");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
    }
    public void MenuCafeCaliente(){
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("¿Buscas algo caliente?. Tengo las siguientes opciones para ti...");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("1.Capuccino");
        System.out.println("2.Mokaccino");
        System.out.println("3.Americano");
        System.out.println("4.Regresar");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
    }
    public void MenuPrepararCafeCaliente(int gazucar, int gcafe, int tam, int gcrema){
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("Su cafe se preparara con la sigueinte receta tradicional");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("**Cantidad de azucar**");
        System.out.println("Cantidad: "+gazucar+" g");
        System.out.println("**Cantidad de cafe**");
        System.out.println("Cantidad: "+gcafe+" g");
        System.out.println("**Tamaño de envase**");
        System.out.println("Cantidad: "+tam+ " ml");
        System.out.println("**Cantidad de crema cafetera**");
        System.out.println("Cantidad: "+gcrema+" g");
        System.out.println("¿Desea agregar algun extra o modificar los componentes?");
        System.out.println("1-Si");
        System.out.println("2-No");
        System.out.println("3-Cancelar preparacion");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("Porfavor indique el numero de la opcion que desea en su teclado");
    }
    public void MenuPersonalizableCafeCaliente(int gazucar, int gcafe, int Tamaño, int Gcrema){
        System.out.println("===== Cafeteria LeVonViVant =====");
        System.out.println("Personaliza tu cafe para la preparacion adecuada a tu gusto");
        System.out.println("=o=o=o=o=o=o=o=o=o=");
        System.out.println("**Cantidad de azucar**");
        System.out.println("Actual: "+gazucar+" g");
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
}
