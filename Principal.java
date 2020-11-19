public class Principal {
    
    public static  void main(String[] args) {
        
        double a =10,b=100;
        
       Soma soma = new Soma();
       subtração sub = new subtração();
       Multiplicação mult = new Multiplicação();
       Divisão div = new Divisão();
       Fatorial fat = new Fatorial();
       Exponencial ex = new Exponencial();
       Porcentagem porc = new Porcentagem();
    
     System.out.println(soma.calcular(a, b) + "\n");
      System.out.println(sub.calcular(a, b) + "\n");
      System.out.println(mult.calcular(a, b) + "\n");
      System.out.println(div.calcular(a, b) + "\n");
      System.out.println(fat.calcular(a, b) + "\n");
      System.out.println(ex.calcular(a, b) + "\n");
      System.out.println(porc.calcular(a, b) + "\n");
    }
    
}
