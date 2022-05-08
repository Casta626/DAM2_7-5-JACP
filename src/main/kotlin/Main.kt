fun main(args: Array<String>) {
    /*
    Para hacer los cuadrados hay que saber su numero total, en el caso de tener un cuadrado de 4x4
    hacemos las combinaciones de [0,0|0,1|0,2|0,3|0,4] este siendo su lado "norte" haciendo el contrario
    obtenemos el "sur" [4,0|4,1|4,2|4,3|4,4], para el "oeste" tenemos el [0,0|1,0|2,0|3,0|4,0]
    y haciendolo al reves tenemos el "este" [0,4|1,4|2,4|3,4|4,4]
    Resumiendo sabiendo el tamaño del cuadrado podemos obtener los lados de manera muy facil siguiendo los patrones.
    */
    /*
    Como se repiten algunas coordenadas ya que son los vertices de los lados se pueden poner en una lista para que no se repita.
    *
    var a = 4
    println(a)
    for (i in 0..a) {
        print("0,$i ")
    }
    println()
    for (i in 0..a) {
        print("$i,0 ")
    }
    println()

    for (i in 0..a) {
        print("$a,$i ")
    }

    println()
    for (i in 0..a) {
        print("$i,$a ")
    }
    a--
    println()
    println(a)
    for (i in 0..a) {
        print("0,$i ")
    }
    println()
    for (i in 0..a) {
        print("$i,0 ")
    }
    println()

    for (i in 0..a) {
        print("$a,$i ")
    }

    println()
    for (i in 0..a) {
        print("$i,$a ")
    }

    a--
    println()
    println(a)
    for (i in 0..a) {
        print("0,$i ")
    }
    println()
    for (i in 0..a) {
        print("$i,0 ")
    }
    println()

    for (i in 0..a) {
        print("$a,$i ")
    }

    println()
    for (i in 0..a) {
        print("$i,$a ")
    }

    a--
    println()
    println(a)
    for (i in 0..a) {
        print("0,$i ")
    }
    println()
    for (i in 0..a) {
        print("$i,0 ")
    }
    println()

    for (i in 0..a) {
        print("$a,$i ")
    }

    println()
    for (i in 0..a) {
        print("$i,$a ")
    }
*/
    var a = GestinadorDeTablero(125, 10)
    a.makeArea()
}