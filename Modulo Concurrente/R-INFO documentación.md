# Documentación de R-INFO
### Estructura basica del programa
```
programa nombre_del_programa
procesos
    proceso nombreDelModulo( parametros )
    variables
        declaracion de
        variables locales
        al modulo
    comenzar
        algoritmo
        que realiza
        el modulo
    fin
areas
    nombreArea : tipoDeArea( region )
robots
    robot nombreTipoRobot
    variables
        en el caso
        de que se necesiten
    comenzar
        instrucciones
        que componen
        el algoritmo para
        este tipo de robot
    fin
variables
    nombreVariableRobot: nombreTipoRobot
comenzar
    AsignarArea( nombreVariableRobot, nombreArea )
    Iniciar( nombreVariableRobot, avenida, calle )
fin
```


### Operadores
#### Booleanos:
| Tipo | Sintaxis |
| ---------- | ---------- |
| negacion  | ~	  | 
| o |  |  |
| y | &  | 
| Igual | =  | 
| Distinto | <>  |

#### Numericos:
| Tipo | Sintaxis |
| ---------- | ---------- |
| Igual  | =	  | 
| Distinto |  <>  |
| Menor | <  | 
| Mayor | >  | 
| Menor o Igual | <=  |
| Mayor o Igual | >= |
| Negacion | ~F = V |
#### Aritmeticos:
| Tipo | Sintaxis |
| ---------- | ---------- |
| Suma  | +	  | 
| Resta |  -  |
| Multiplicacion | * | 
| Division | /  | 

#### Asignacion:
| Tipo | Sintaxis |
| ---------- | ---------- |
| 1er Asignacion  | :	| 
| 2da Asignacion |  := |

### Estructuras de control
#### Estructura Si-Sino:
```
si ( condicion )
    bloque
    de codigo
    a ejecutar
sino
    bloque
    de codigo
    a ejecutar
```
```
Ejemplo:
si ( n1 > n2 )
    max := n1
sino
    si ( n2 > n1 )
        max := n2
```

#### Estructura Mientras:
```
mientras ( condicion )
    bloque
    de codigo
    a ejecutar
```
```
Ejemplo:
mientras ( ( n < max ) | ( cont < 5 ) )
    n := n * n
    cont := cont +1
```

#### Estructura Repetir:
```
repetir ( cantidad )
    bloque
    de codigo
    a ejecutar
```
```
Ejemplo:
repetir exponente
    res := res * base
```

### Instrucciones de R-INFO
| Sintaxis | Descripcion |
| ---------- | ---------- |
| PosAv	  | El numero representa la avenida actual del robot	  | 
| PosCa |  El numero representa la calle actual del robot  |
| HayFlorEnLaEsquina | El booleano representa si hay una flor en la esquina actual | 
| HayPapelEnLaEsquina | El booleano representa si hay un papel en la esquina actual  | 
| HayFlorEnLaBolsa | El booleano representa si hay una flor en el inventario  |
| HayPapelEnLaBolsa | El booleano representa si hay un papel en el inventario |
| tomarFlor | toma una flor de la esquina actual y la guarda en el inventario |
| tomarPapel |  toma un papel de la esquina actual y lo guarda en el inventario  |
| depositarFlor | deposita una flor del inventario en la esquina actual  | 
| depositarPapel | deposita un papel del inventario en la esquina actual | 
| mover | se mueve  |
| derecha | la direccion del robot gira a la derecha|
| Pos( avenida, calle ) | inicializa en avenida y calle ingresada |
| Random( variableReceptora, valorMinimo, valorMaximo ) | genera un numero random |

### Instrucciones de R-INFO.Comunicación
| Sintaxis |
| ---------- |
| Informar( 'cadenaDeCaracteres', valor )	  | 	  
| EnviarMensaje( valor, nombreVariableRobot ) |   
| RecibirMensaje( variableReceptora, nombreEmisor ) |  
| RecibirMensaje( variableReceptora, * ) |   
