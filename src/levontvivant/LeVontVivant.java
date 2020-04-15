                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
package levontvivant;

import LeVonVivantCafes.LeVonVivantCafeCalienteCapuccino;
import LeVonVivantCafes.LeVonVivantCafeFrio;
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
        int gcrema=0;
        int gcafe=0;
        int gazucar=0;
        int tam=0;
        float cant=0f;
        float pexazucar=0f;
        float penvase=0f;
        float pexcrema=0f;
        float pexcafe=0f;
        float TotalCafesCalientes=0f;
        float CafesCalientesPedidos=0f;
        float TotalExtras=0f;
        float TotalCafes=0f;
        float TotalCafesFrios=0f;
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
                while(opc!=4 && opc==1)//Cafes Frios INICIO
                {
                    menu1.MenuCafeFrio();
                    opc=teclado.nextInt();
                    switch (opc){
                        case 1://Cafe Canela/chile
                                LeVonVivantCafeFrio CanelaC = new LeVonVivantCafeFrio(25,5,15,5);
                                menu1.MenuPrepararCafeCanelaC(25, 5, 15, 5, 255);
                                penvase=menu1.PrecioEnvase(0, 255);
                                cant=menu1.Cantidad(0);
                                for(float i=1;i<=cant;i=i+1){
                                float CafesFriosPedidos=R1.OrdenarCafeCanelaC(cant, penvase);
                                TotalCafesFrios=R1.CalcularTotalCafesFrios(TotalCafesFrios, CafesFriosPedidos);
                                }
                            break;
                        case 2://Frapuccino
                            LeVonVivantCafeFrio Frapuccino = new LeVonVivantCafeFrio(25,15,10,10);
                                menu1.MenuPrepararCafeFrapuccino(25, 15, 10, 10, 655);
                                penvase=menu1.PrecioEnvase(0, 655);
                                cant=menu1.Cantidad(0);
                                for(float i=1;i<=cant;i=i+1){
                                float CafesFriosPedidos=R1.OrdenarCafeFrapuccino(cant, penvase);
                                TotalCafesFrios=R1.CalcularTotalCafesFrios(TotalCafesFrios, CafesFriosPedidos);
                                }
                            break;
                        case 3://Canela y cajeta
                            LeVonVivantCafeFrio CanCaj = new LeVonVivantCafeFrio(25,5,15,5);
                                menu1.MenuPrepararCafeCanCaj(25, 15, 15, 15, 955);
                                penvase=menu1.PrecioEnvase(0, 955);
                                cant=menu1.Cantidad(0);
                                for(float i=1;i<=cant;i=i+1){
                                float CafesFriosPedidos=R1.OrdenarCafeCanCaj(cant, penvase);
                                TotalCafesFrios=R1.CalcularTotalCafesFrios(TotalCafesFrios, CafesFriosPedidos);
                                }
                            break;
                      
                    }
                    
                }//Cafes Frios FIN
                
                while(opc!=3 && opc==2)//Cafes calientes INICIO
                {
                    menu1.MenuCafeCaliente();
                    opc=teclado.nextInt(); 
                    while(opc!=4 && opc==1)//ordenar Cafe capuccino INICIO
                    {
                        do
                        {
                        cant=menu1.Cantidad(1);
                        for(float i=1;i<=cant;i=i+1){
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.println("Preparacion de cafe No. "+i+"/"+cant);
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.println("");
                        LeVonVivantCafeCalienteCapuccino capuccino = new LeVonVivantCafeCalienteCapuccino();
                        gcrema=capuccino.setCrema(10);
                        gcafe=capuccino.setCafe(25);
                        gazucar=capuccino.setAzucar(5);
                        tam=capuccino.setTamano(255);
                        menu1.MenuPrepararCafeCaliente(gazucar, gcafe, tam, gcrema, "Convencional");
                        opc=teclado.nextInt();
                        if(opc==1)
                        {
                            do
                            {
                            menu1.MenuPersonalizableCafeCaliente(gazucar, gcafe, tam, gcrema,"Convencional");
                            opc=teclado.nextInt();
                            
                            while(opc==1)
                            {
                                String tazucar=menu1.TipoAzucar("Convencional");
                                gazucar=menu1.CantidadAzucar(gazucar);
                                pexazucar=menu1.PrecioExtraAzucar(0, gazucar);
                                opc=6;
                            }
                            while(opc==2)
                            {
                                gcafe=menu1.CantidadCafe(gcafe);
                                opc=6;
                                pexcafe=menu1.CantidadCafe(gcafe);
                            }
                            while(opc==3)
                            {
                                tam=menu1.TamEnvase(tam);
                                opc=6;
                            }
                            while(opc==4)
                            {
                                gcrema=menu1.CantidadCrema(gcrema);
                                opc=6;
                                pexcrema=menu1.PrecioExtraCrema(0, gcrema);
                            }
                            }while(opc!=5);
                        }
                        }
                            if(opc==1 || opc==2 || opc==6)
                        {
                        //poner aqui agregar a la charola
                            penvase=menu1.PrecioEnvase(0, tam);
                            CafesCalientesPedidos=R1.OrdenarCafeCapuccino(cant,penvase);
                            TotalCafesCalientes=R1.CalcularTotalCafesCalientes(TotalCafesCalientes, CafesCalientesPedidos);
                            TotalExtras=R1.CalcularTotalExtras(pexazucar, pexcrema, pexcafe);
                            opc=3;
                        //poner aqui agregar a charola
                        }
                        }while(opc!=3);
                        opc=5;
                    }//Ordenar cafe capuccino FIN
                    while(opc!=4 && opc==2)//ordenar Cafe Mokaccino INICIO
                    {
                         do
                        {
                        cant=menu1.Cantidad(1);
                        for(float i=1;i<=cant;i=i+1){
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.println("Preparacion de cafe No. "+i+"/"+cant);
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.println("");
                        LeVonVivantCafeCalienteCapuccino mokaccino = new LeVonVivantCafeCalienteCapuccino();
                        gcrema=mokaccino.setCrema(5);
                        gcafe=mokaccino.setCafe(15);
                        gazucar=mokaccino.setAzucar(5);
                        tam=mokaccino.setTamano(955);
                        menu1.MenuPrepararCafeCaliente(gazucar, gcafe, tam, gcrema, "Convencional");
                        opc=teclado.nextInt();
                        if(opc==1)
                        {
                            do
                            {
                            menu1.MenuPersonalizableCafeCaliente(gazucar, gcafe, tam, gcrema,"Convencional");
                            opc=teclado.nextInt();
                            
                            while(opc==1)
                            {
                                String tazucar=menu1.TipoAzucar("Convencional");
                                gazucar=menu1.CantidadAzucar(gazucar);
                                pexazucar=menu1.PrecioExtraAzucar(0, gazucar);
                                opc=6;
                            }
                            while(opc==2)
                            {
                                gcafe=menu1.CantidadCafe(gcafe);
                                opc=6;
                                pexcafe=menu1.CantidadCafe(gcafe);
                            }
                            while(opc==3)
                            {
                                tam=menu1.TamEnvase(tam);
                                opc=6;
                            }
                            while(opc==4)
                            {
                                gcrema=menu1.CantidadCrema(gcrema);
                                opc=6;
                                pexcrema=menu1.PrecioExtraCrema(0, gcrema);
                            }
                            }while(opc!=5);
                        }
                        }
                            if(opc==1 || opc==2 || opc==6)
                        {
                        //poner aqui agregar a la charola
                            penvase=menu1.PrecioEnvase(0, tam);
                            CafesCalientesPedidos=R1.OrdenarCafeMokaccino(cant,penvase);
                            TotalCafesCalientes=R1.CalcularTotalCafesCalientes(TotalCafesCalientes, CafesCalientesPedidos);
                            TotalExtras=R1.CalcularTotalExtras(pexazucar, pexcrema, pexcafe);
                            opc=3;
                        //poner aqui agregar a charola
                        }
                        }while(opc!=3);
                        opc=5;
                    }//Ordenar cafe Mokaccino FIN
                    while(opc!=4 && opc==3)//ordenar Cafe Americano INICIO
                    {
                        do
                        {
                        cant=menu1.Cantidad(1);
                        for(float i=1;i<=cant;i=i+1){
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.println("Preparacion de cafe No. "+i+"/"+cant);
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.println("");
                        LeVonVivantCafeCalienteCapuccino americano = new LeVonVivantCafeCalienteCapuccino();
                        gcrema=americano.setCrema(0);
                        gcafe=americano.setCafe(30);
                        gazucar=americano.setAzucar(0);
                        tam=americano.setTamano(655);
                        menu1.MenuPrepararCafeCaliente(gazucar, gcafe, tam, gcrema, "Convencional");
                        opc=teclado.nextInt();
                        if(opc==1)
                        {
                            do
                            {
                            menu1.MenuPersonalizableCafeCaliente(gazucar, gcafe, tam, gcrema,"Convencional");
                            opc=teclado.nextInt();
                            
                            while(opc==1)
                            {
                                String tazucar=menu1.TipoAzucar("Convencional");
                                gazucar=menu1.CantidadAzucar(gazucar);
                                pexazucar=menu1.PrecioExtraAzucar(0, gazucar);
                                opc=6;
                            }
                            while(opc==2)
                            {
                                gcafe=menu1.CantidadCafe(gcafe);
                                opc=6;
                                pexcafe=menu1.CantidadCafe(gcafe);
                            }
                            while(opc==3)
                            {
                                tam=menu1.TamEnvase(tam);
                                opc=6;
                            }
                            while(opc==4)
                            {
                                gcrema=menu1.CantidadCrema(gcrema);
                                opc=6;
                                pexcrema=menu1.PrecioExtraCrema(0, gcrema);
                            }
                            }while(opc!=5);
                        }
                        }
                            if(opc==1 || opc==2 || opc==6)
                        {
                        //poner aqui agregar a la charola
                            penvase=menu1.PrecioEnvase(0, tam);
                            CafesCalientesPedidos=R1.OrdenarCafeAmericano(cant,penvase);
                            TotalCafesCalientes=R1.CalcularTotalCafesCalientes(TotalCafesCalientes, CafesCalientesPedidos);
                            TotalExtras=R1.CalcularTotalExtras(pexazucar, pexcrema, pexcafe);
                            opc=4;
                        //poner aqui agregar a charola
                        }
                        }while(opc!=4);
                        opc=0;
                    }//Ordenar cafe Americano FIN
                    if(opc==4){
                    opc=0;
                    }else{
                    opc=2;
                    }
                }//Cafes Calientes FIN
                opc=0;
                
                //totalCafes INICIO
                TotalCafes=R1.CalcularTotalCafes(TotalCafes, TotalCafesCalientes, TotalCafesFrios);
                //totalCafes FIN
            }
            //CAFES OPCION 1 FIN
            
            //Postres OPCION 2 INICIO
            while(opc!=4 && opc==2)
            {
                menu1.MenuPostres();
                opc=teclado.nextInt();
                switch(opc){
                    case 1:
                        System.out.println("Has elegido Flan Napolitano...Disfrutalo!");
                        break;
                    case 2:
                        System.out.println("Has elegido Dona de Moka...Disfrutala!");
                        break;
                    case 3:
                        System.out.println("Has elegido Panque de Pasas...Disfrutalo!");
                        break;
                }
            }
            //Postres Opcion 2 FIN
            
            //Ver Orden Opcion 3 INICIO.
            while(opc!=4 && opc==3)
            {
                float TotalPedido=R1.CalcularTotalPedido(TotalCafes, 0);
                float SubTotal=R1.CalcularSubTotal(TotalExtras, TotalPedido);
                float IVA=R1.CalcularIVA(SubTotal);
                float Total=R1.CalcularTotal(SubTotal, IVA);
                R1.MostrarCharola(Total, SubTotal, IVA, TotalCafes, TotalExtras, TotalCafesCalientes, TotalCafesFrios);
                opc=0;
            }
            //Ver Orden Opcion 3 FIN
        }
        while (opc!=4);
        //menus FIN
        //Proceder pago Inicio
        R1.Pagar();
        //proceder a pago fin
    }
    
}
