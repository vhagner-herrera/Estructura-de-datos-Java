package recursividad;

public class SumaRecursivaIndirecta {
    //Sumar los valores inferiores a un #
    // # - 5
    // 1+2+3+4+5


    public static int suma(int n){
        //casos base - recursivo
        if(n==0)
            return 0;
        else
            return n+suma(n-1);
    }

    public static int sumaAux(int n){
        return suma(n);
    }

    public static void main(String[] args)
    {
        System.out.println("Suma:"+sumaAux(5));
    }
}
