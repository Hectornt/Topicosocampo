# Hilos en java  
  
### ¿Que es un hilo?  
Thread (hilo, tarea) es la clase base de Java para definir hilos de ejecución concurrentes dentro de un mismo programa. En Java, como lenguaje O.O., el concepto de concurrencia está asociado a los objetos: Son los objetos los que actúan concurrentemente con otros.  
  

### Implementación  
En Java los hilos están encapsulados en la clase Thread. Para crear un hilo tenemos dos posibilidades:  
* Heredar de Thread redefiniendo el método run().  
* Crear una clase que implemente la interfaz Runnable que nos obliga a definir el método run().  

En ambos casos debemos definir un método run() que será el que contenga el código del hilo. Desde dentro de este método podremos llamar a cualquier otro método de cualquier objeto, pero este método run() será el método que se invoque cuando iniciemos la ejecución de un hilo. El hilo terminará su ejecución cuando termine de ejecutarse este método run().    
  
Para crear nuestro hilo mediante herencia haremos lo siguiente:  
<public class EjemploHilo extends Thread>  
{  
    <public void run()()>    
     {    
         // Código del hilo    
     }    
}              


