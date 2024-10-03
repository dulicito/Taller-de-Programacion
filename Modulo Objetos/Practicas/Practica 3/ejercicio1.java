ENUNCIADO:
1-A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el
tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
Provea métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)
B- Realizar un programa que instancie un triángulo, le cargue información leída desde
teclado e informe en consola el perímetro y el área.
NOTA: Calcular el área con la fórmula Área = s(s − a)(s − b)(s − c) , donde a, b y c
son los lados y s = . La función raíz cuadrada es Math.sqrt(#) a+b+c
    
package tema3;

import PaqueteLectura.Lector;
/**
 *
 * @author sofia
 */
public class ejercicio1 {
    public static void main(String[] args) {
        
        
        double lado1,lado2,lado3;
        String color,relleno;
        
        
        System.out.println("Inciso 1");
        System.out.print("Ingrese lado1: ");lado1 = Lector.leerDouble();
        System.out.print("Ingrese lado2: ");lado2 = Lector.leerDouble();
        System.out.print("Ingrese lado3: ");lado3 = Lector.leerDouble();
        System.out.print("Ingrese color de linea: ");color = Lector.leerString();
        System.out.print("Ingrese color de relleno: ");relleno = Lector.leerString();
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3,color,relleno);
        
        
        System.out.println("Inciso 2");
        System.out.println("El perimetro es: "+String.format("%.2f", triangulo.calcularPerimetro()));
        System.out.println("El area es: "+String.format("%.2f", triangulo.calcularArea()));
    }
}
