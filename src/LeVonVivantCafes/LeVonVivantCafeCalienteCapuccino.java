
package LeVonVivantCafes;

public class LeVonVivantCafeCalienteCapuccino extends LeVonVivantCafeCaliente {
    
    private int crema;
    private int azucar;
    private int cafe;
    private int tamano;
    
    public int setCrema(int gcrema)
    {
        this.crema=gcrema;
        return gcrema;
    }
    public int setCafe(int gcafe)
    {
        this.cafe=gcafe;
        return gcafe;
    }
    public int setTamano(int tam)
    {
        this.tamano=tam;
        return tam;
    }
    public int setAzucar(int gazucar)
    {
        this.cafe=gazucar;
        return gazucar;
    }
}
