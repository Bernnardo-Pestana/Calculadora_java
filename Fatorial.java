
public class Fatorial implements Opera��o {
    
     public double calcular(double a, double b)
     {
        if((a == 0 ) || (a == 1))
                   return 1;
        else
           return a * calcular (a-1,b);
     }
    
}
