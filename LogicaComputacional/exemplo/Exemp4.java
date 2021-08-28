import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner robert = new Scanner(System.in);
	    System.out.println("Digite o primeiro número!");
	    int num1 = robert.nextInt();
	    System.out.println("Digite o segundo número!");
	    int num2 = robert.nextInt();
	    System.out.println("Digite o terceiro número!");
	    int num3 = robert.nextInt();
        //controleDePeso(num1,num2);
        //segundo();
        //terceiro();
        quarto(num1,num2,num3);
	}
	
	public static void controleDePeso(float pesoPermitido, float peso){
        float excesso;
        float multa;
        
        if(pesoPermitido < peso){
            excesso = peso - pesoPermitido;
            multa = excesso * 4;
            System.out.println("Houve excesso de: "+excesso+"kg, com multa de R$"+multa);
        }
        else if(peso == pesoPermitido){
            System.out.println("Na riscaaaa!");
        }
        else{
            System.out.println("O pescador não vai pagar nada!");
        }
	}
	
	public static void segundo(){
	    int x = 0;
	    
	    while(x<10){
	        if(x % 2 == 0){
	            System.out.println(x);
	        }
	        x++;
	    }
	}
	
	public static void terceiro(){
	    int x = 0;
	    int y = 0;
	    
	    while(x<100){
	        if(x % 7 == 0){
	            y++;
	        }
	        x++;
	    }
	    System.out.println(x+" "+y);
	}
	
	public static void quarto(int n1, int n2, int n3){
	    float media = (float) (n1+n2+n3)/3;
	    
	    if(media<4){
	        System.out.println("E");
	    }
	    else if(media<6){
	        System.out.println("D");
	    }
	    else if(media<7.5){
	        System.out.println("C");
	    }
	    else if(media<9){
	        System.out.println("B");
	    }
	    else{
	        System.out.println("A");
	    }
	}
}
