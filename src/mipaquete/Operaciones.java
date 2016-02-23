package mipaquete;

import java.io.IOException;

/**
* Esta {@code esto es code } clase define objetos que contienen metodos de operaciones entre enteros como suma {@link #calculaSuma(int, int) } {@linkplain  #calcularResta(int, int)  } 
* @author  Enrique Hormilla
* @deprecated No se aconseja su uso,la calse Math es mas completa.
* @version 1.0
* @see <a href="http://docs.oracle.com/javase/8/docs/api/index.html">Java API 8</a>
* @since   2016-02-01
* 
 */
public class Operaciones {
    
    private int a,b;
   /**
     * El valor de SMI = {@value #SMI }
     */
    public static final double SMI = 5322.234;
    
     /**
     * Constructor que inicializa la clase con los dos entero a 0.
     * @see #Operaciones() 
     * 
     */
    public Operaciones() {
        this.a = 0;
        this.b = 0;
        
    }
    
     /**
     * Constructor que inicializa la clase con los dos entero.
     * @exception IOException On input error.
     * @see IOException
     * @param a Número Entero
     * @param b Número Entero
     * 
     * @see #Operaciones(int, int) 
     */
    public Operaciones(int a, int b) throws IOException {
        this.a = a;
        this.b = b;
    }

    /**
     * Metodo que suma dos enteros y retorna el resultado
     * @param a Número Entero
     * @param b Número Entero
     * @return int Un entero que es el resultado de a + b
     * @deprecated No se aconseja su uso,la calse Math es mas completa.
     * @see #calculaSuma(int, int) 
     * @throws IllegalArgumentException Si a o b no son numeros reales
     */
    public int calculaSuma(int a,int b){
        if((a<0)|| (b<0)){
            throw new IllegalArgumentException("Este metodo esta creado solo para numeros reales");
        }
        return a+b;
    }

    /**
     * Metodo que resta dos enteros y retorna el resultado
     * @param a Número Entero
     * @param b Número Entero
     * @return int Un entero que es el resultado de a - b
     * @deprecated No se aconseja su uso,la calse Math es mas completa.
     * @see #calcularResta(int, int) 
     */
    public int calcularResta(int a,int b){
        return a-b;
    }

    /**
     * Metodo que multiplica dos enteros y el parametro introducido,retorna el resultado
     * @param parametro Número Entero
     * @return int Un entero que es el resultado de a * b *parametro
     * @deprecated No se aconseja su uso,la calse Math es mas completa.
     * @see #multiplicarNumero(int) 
     */
    public int multiplicarNumero(int parametro){
        return a*b*parametro;
    }
    
}
