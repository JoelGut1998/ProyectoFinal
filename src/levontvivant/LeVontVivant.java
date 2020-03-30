
package levontvivant;

import LeVonVivantMenus.Menu;
import LeVonVivantRobot.Robot;
import java.util.Scanner;

public class LeVontVivant {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
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
            if(opc==1)
            {
            }
            else
            {
                if(opc==2)
                {
                }
                else
                {
                    if(opc==3)
                    {
                    }
                    else
                    {
                    }
                }
            }    
        }
        while (opc!=4);
        //menus FIN
    }
    
}
