package calculadora;

import java.util.Scanner;

/**
 *
 * @author infiurkidi
 */
public class Calculadora_ITZIAR {

    public static  Scanner teclado=new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int op,x,y;
        
        do{
        System.out.println("*************************");    
        System.out.println("**   Menu calculadora  **");
        System.out.println("** 1.-Sumar            **");
        System.out.println("** 2.-Restar           **");
        System.out.println("** 3.-Multiplicar      **");
        System.out.println("** 4.-Dividir          **");
        System.out.println("** 5.-Salir            **");
        System.out.println("*************************");
        do{
            System.out.println("introduce la opción deseada(1-5):");
            op=teclado.nextInt();
            
        }while(op<1 ||op>5);
        
        switch(op){
            case 1: 
                    int suma;
                    do{
                        System.out.println("Primer operando(>=0):");
                        x=teclado.nextInt();
                    }while(x<0);
                     do{
                        System.out.println("Segundo operando(>=0):");
                        y=teclado.nextInt();
                    }while(y<0);
                    suma=x+y;
                    System.out.println("El resultado de la suma: "+suma);
                    break;
            case 2: 
                    int resta;
                    do{
                        System.out.println("Primer operando(>=0):");
                        x=teclado.nextInt();
                    }while(x<0);
                     do{
                        System.out.println("Segundo operando(>=0):");
                        y=teclado.nextInt();
                    }while(y<0);

                    resta=x-y;
                    System.out.println("El resultado de la resta:"+resta);
                    break;    
            case 3: 
                    int multiplicacion;
                    do{
                        System.out.println("Primer operando(>=0):");
                        x=teclado.nextInt();
                    }while(x<0);
                     do{
                        System.out.println("Segundo operando(>=0):");
                        y=teclado.nextInt();
                    }while(y<0);

                    multiplicacion=x*y;
                    System.out.println("El resultado del producto:"+multiplicacion);
                    break;      
            case 4: 
                    int division;
                    do{
                        System.out.println("Primer operando(>=0):");
                        x=teclado.nextInt();
                    }while(x<0);
                     do{
                        System.out.println("Segundo operando(>0):");
                        y=teclado.nextInt();
                    }while(y<0); //vamos a evitar división por 0

                    if(y==0) division=-1;
                    else 
                        division=x/y;
                    
                    System.out.println("El resultado de la división:"+division);
                    break;
            case 5: System.out.println("Fin !!");break;
            default: System.out.println("Opción "+op+" no disponible, vuelva a intentarlo.");break;
                            
        }
        
        }while(op!=5); 
    }
    
    /*public static int suma(){
        int x,y;
        do{
            System.out.println("Primer operando(>=0):");
            x=teclado.nextInt();
        }while(x<0);
         do{
            System.out.println("Segundo operando(>=0):");
            y=teclado.nextInt();
        }while(y<0);
        
        return x+y;
    }*/
    
    /*public static int resta(){
        int x,y;
        do{
            System.out.println("Primer operando(>=0):");
            x=teclado.nextInt();
        }while(x<0);
         do{
            System.out.println("Segundo operando(>=0):");
            y=teclado.nextInt();
        }while(y<0);
        
        return x-y;
    }*/
    
    /*public static int multiplicacion(){
        int x,y;
        do{
            System.out.println("Primer operando(>=0):");
            x=teclado.nextInt();
        }while(x<0);
         do{
            System.out.println("Segundo operando(>=0):");
            y=teclado.nextInt();
        }while(y<0);
        
        return x*y;
    }*/
    
  /*  public static int division(){
        int x,y,resultado;
        do{
            System.out.println("Primer operando(>=0):");
            x=teclado.nextInt();
        }while(x<0);
         do{
            System.out.println("Segundo operando(>0):");
            y=teclado.nextInt();
        }while(y<0); //vamos a evitar división por 0
        
        if(y==0) resultado=-1;
        else 
            resultado=x/y;
        
        return resultado;
    }*/
        
}   
