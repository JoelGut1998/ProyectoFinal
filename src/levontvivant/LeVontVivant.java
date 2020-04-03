
package levontvivant;

import LeVonVivantCafes.LeVonVivantCafeCalienteCapuccino;
import LeVonVivantMenus.Menu;
import LeVonVivantRobot.Robot;
import java.util.Scanner;

public class LeVontVivant {

    public static void main(String[] args) {
        //creacion de Scanner INICIO
        Scanner teclado = new Scanner(System.in);
        //creacion de Scanner FIN
        //variables generales INICIO
        String t= "LeVonVivantLerma";
        String nom="Arturito";
        int cod=1;
        int opc=0;
        //variables generales FIN
        
        //robot INICO
        Robot R1=new Robot(nom,t,cod);
        //robot FIN
        
        //menus INICIO y acciones
        Menu menu1 = new Menu();
        do
        {
            menu1.MenuPrincipal();
            opc=teclado.nextInt();
            //CAFES OPCION 1 INICIO
            while(opc!=4 && opc==1) 
            {
                menu1.MenuCafe();
                opc=teclado.nextInt();
                while(opc!=3 && opc==1)
                {
                    menu1.MenuCafeFrio();
                    opc=teclado.nextInt();
                }
                while(opc!=3 && opc==2)
                {
                    menu1.MenuCafeCaliente();
                    opc=teclado.nextInt();
                    while(opc!=4 && opc==1)
                    {
                        do
                        {
                        LeVonVivantCafeCalienteCapuccino capuccino = new LeVonVivantCafeCalienteCapuccino();
                        int gcrema=capuccino.setCrema(10);
                        int gcafe=capuccino.setCafe(25);
                        int gazucar=capuccino.setAzucar(5);
                        int tam=capuccino.setTamano(255);
                        menu1.MenuPrepararCafeCaliente(gazucar, gcafe, tam, gcrema);
                        opc=teclado.nextInt();
                        if(opc==1)
                        {
                            do
                            {
                            menu1.MenuPersonalizableCafeCaliente(gazucar, gcafe, tam, gcrema);
                            opc=teclado.nextInt();
                            
                            while(opc==1)
                            {
                                opc=6;
                            }
                            while(opc==2)
                            {
                                opc=6;
                            }
                            while(opc==3)
                            {
                                opc=6;
                            }
                            while(opc==4)
                            {
                                opc=6;
                            }
                            }while(opc!=5);
                        }
                        if(opc==1 || opc==2 || opc==5)
                        {
                        //poner aqui agregar a la charola
                        //poner aqui agregar a charola
                        }
                        opc=3;
                        }while(opc!=3);
                    }
                }
                opc=5;
            }
            //CAFES OPCION 1 FIN
            //Postres OPCION 2 INICIO
            while(opc!=4 && opc==2)
            {
                System.out.println("OPCION 2");
                opc=5;
            }
            //Postres Opcion 2 FIN
            //Ver Orden Opcion 3 INICIO.
            while(opc!=4 && opc==3)
            {
                System.out.println("OPCION 3");
                opc=5;
            }
            //Ver Orden Opcion 3 FIN
        }
        while (opc!=4);
        //menus FIN
        //Proceder pago Inicio
        //proceder a pago fin
    }
    
}
