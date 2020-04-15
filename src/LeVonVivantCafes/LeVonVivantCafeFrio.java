
package LeVonVivantCafes;

public class LeVonVivantCafeFrio extends LeVonVivantCafe {
    private int CantidadHielo;
    private int CantidadAzucar;
    private int Ingrediente1;
    private int Ingrediente2;
    
    public LeVonVivantCafeFrio(int ch, int ca,int i1,int i2){
        this.CantidadHielo=ch;
        this.CantidadAzucar=ca;
        this.Ingrediente1=i1;
        this.Ingrediente2=i2;
}
    public int getHielo(){
     int ch=this.CantidadHielo;
     return ch;
    }
    public int getAzucar(){
     int ca=this.CantidadAzucar;
     return ca;
    }
    public int getIngrediente1(){
     int i1=this.Ingrediente1;
     return i1;
    }
    public int getIngrediente2(){
     int i2=this.Ingrediente2;
     return i2;
    }
}
