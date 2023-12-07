import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.*;

class testC09317 {
	  //suma
	  @Test
	     void testSuma() {
	        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
	        int resultado = context.procesar(1, 10);
	        assertEquals(11, resultado);
	    }
	  
	  @Test
	     void testSuma2() {
	        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
	        int resultado = context.procesar(111, 10);
	        assertEquals(121, resultado);
	    }
	  
	  @Test
	     void testSuma3() {
	        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
	        int resultado = context.procesar(0, 0);
	        assertEquals(0, resultado);
	    }
	  
	  //resta
	  @Test
	     void testResta() {
		        OperacionAritmetica context = new OperacionAritmetica(new Resta());
		        int resultado = context.procesar(6, 6);
		        assertEquals(0, resultado); 
		  }
	  
	  @Test
	     void testResta2() {
		        OperacionAritmetica context = new OperacionAritmetica(new Resta());
		        int resultado = context.procesar(12, 6);
		        assertEquals(6, resultado); 
		  }
	  

	   //resta invalida
	   @Test
	     void testRestaInvalida() {
	        OperacionAritmetica context = new OperacionAritmetica(new Resta());
	        int resultado = context.procesar(4, 6);
	        assertEquals(-2, resultado); 
	    }

	    
	   //multiplicacion
	   @Test
	     void testMultiplicacion() {
	        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
	        int resultado = context.procesar(10, 10);
	        assertEquals(100, resultado);
	    }
	   
	 
	   @Test
	     void testMultiplicacion2() {
	        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
	        int resultado = context.procesar(2, 10);
	        assertEquals(20, resultado);
	    }
	   
	
	   @Test
	     void testMultiplicacion3() {
	        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
	        int resultado = context.procesar(10, 3);
	        assertEquals(30, resultado);
	    }

	   
	   //division
	    @Test
	     void testDivision() {
	        OperacionAritmetica context = new OperacionAritmetica(new Division());
	        int resultado = context.procesar(10, 2);
	        assertEquals(5, resultado); 
	    }   
	    
	   
	   //divison entre 0
	    @Test
	     void testDivisionEntreCero() {
	        OperacionAritmetica context = new OperacionAritmetica(new Division());
	        int resultado = context.procesar(10, 0);
	        assertEquals(-3, resultado); 
	    }

	    
	    @Test
	     void testValoresNegativosSuma() {
	        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
	        int resultado = context.procesar(-10, 10);
	        assertEquals(-1, resultado); // Debería devolver el código de error -1
	    } 
	    
	    @Test
	     void testValoresNegativosSuma2() {
	        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
	        int resultado = context.procesar(10, -10);
	        assertEquals(-1, resultado); // Debería devolver el código de error -1
	    } 
	    
	    @Test
	     void testValoresNegativosResta() {
	        OperacionAritmetica context = new OperacionAritmetica(new Resta());
	        int resultado = context.procesar(-10, 10);
	        assertEquals(-1, resultado); // Debería devolver el código de error -1
	    } 
	    
	    @Test
	     void testValoresNegativosResta2() {
	        OperacionAritmetica context = new OperacionAritmetica(new Resta());
	        int resultado = context.procesar(10, -10);
	        assertEquals(-1, resultado); // Debería devolver el código de error -1
	    } 
	    
	    
	    @Test
	     void testValoresNegativosMultiplicacion() {
		        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
		        int resultado = context.procesar(-10, 10);
		        assertEquals(-1, resultado); // Debería devolver el código de error -1
		 } 
	    
	    @Test
	     void testValoresNegativosMultiplicacion2() {
		        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
		        int resultado = context.procesar(10, -10);
		        assertEquals(-1, resultado); // Debería devolver el código de error -1
		 } 
	     
	     
	    @Test
	     void testValoresNegativosDivision() {
		        OperacionAritmetica context = new OperacionAritmetica(new Division());
		        int resultado = context.procesar(-10, 10);
		        assertEquals(-1, resultado); // Debería devolver el código de error -1
		    } 
	     
	    @Test
	     void testValoresNegativosDivision2() {
		        OperacionAritmetica context = new OperacionAritmetica(new Division());
		        int resultado = context.procesar(10, -10);
		        assertEquals(-1, resultado); // Debería devolver el código de error -1
		    } 

}


