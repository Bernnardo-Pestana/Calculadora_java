public class Principal {
    
    public static  void main(String[] args) {
        
        double a =10,b=100;
        
       Soma soma = new Soma();
       subtra��o sub = new subtra��o();
       Multiplica��o mult = new Multiplica��o();
       Divis�o div = new Divis�o();
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
