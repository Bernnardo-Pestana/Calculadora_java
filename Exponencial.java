public class Exponencial implements Operação{
    
    public double calcular(double a, double b)
    {
       double aux = a;
        while(b != 0)
        {
           a = a*aux;
           b--;
        }
       return a; 
    }
    
}
