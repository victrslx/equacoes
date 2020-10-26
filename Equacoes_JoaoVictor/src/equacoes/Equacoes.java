package equacoes;

import java.util.Scanner;

public class Equacoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float a, b, c, delta, x1, x2;
        
        System.out.print("Informe o valor de A: ");
         a = entrada.nextFloat();
        System.out.print("Informe o valor de B: ");
         b = entrada.nextFloat();
        System.out.print("Informe o valor de C: ");
         c = entrada.nextFloat();
        if(a!=0){
            System.out.println("Não é possivvel calcular, pois 'A' é diferente de 0");
        delta =(b*b)-(4*a*c);
        
        if((delta > 0)){
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("O resultados das Equações é:"+x1+x2);
        }}else{
        System.out.println("A Equação não possui resultados reais");
        }
    
    }
    }
