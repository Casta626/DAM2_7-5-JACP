/*
    Para hacer los cuadrados hay que saber su numero total, en el caso de tener un cuadrado de 4x4
    hacemos las combinaciones de [0,0|0,1|0,2|0,3|0,4] este siendo su lado "norte" haciendo el contrario
    obtenemos el "sur" [4,0|4,1|4,2|4,3|4,4], para el "oeste" tenemos el [0,0|1,0|2,0|3,0|4,0]
    y haciendolo al reves tenemos el "este" [0,4|1,4|2,4|3,4|4,4]
    Resumiendo sabiendo el tamaño del cuadrado podemos obtener los lados de manera muy facil siguiendo los patrones.
    */
/*
Como se repiten algunas coordenadas ya que son los vertices de los lados se pueden poner en una lista para que no se repita.
*/

class GestinadorDeTablero(var tiempo:Int, var area:Int,var jugadores: MutableList<String>) {

    fun makeArea(): Int {

        var puntos: MutableList<String> = mutableListOf()

        println()
        println(area)
        for (i in 0..area) {
            puntos.add("0.$i")
            print("0.$i ")

        }
        println()
        for (i in 0..area) {
            puntos.add("$i.0")
            print("$i.0 ")
        }
        println()

        for (i in 0..area) {
            puntos.add("$area.$i")
            print("$area.$i ")
        }

        println()
        for (i in 0..area) {
            puntos.add("$i.$area")
            print("$i.$area ")
        }

        println()
        var lista_puntos = puntos.toList().distinct()
        println(lista_puntos.toString())
        println()
        for (j in 0 until jugadores.size){
            if (lista_puntos.contains(jugadores[j])){
                jugadores.removeAt(j)
                println("El jugador "+(j+1)+" ha sido eliminado")
            }else{
                println("Vamos para bingo")
            }
        }
        //println("JUGADORES RESTANTES: "+jugadores.size)

        if (tiempo >=10 && area>=2) {
            println()
            tiempo-=10
            area--
            makeArea()
        }else{
            println()
            println()
            println("El juego ha terminado")
            println("Jugadores restantes:"+jugadores.size)

        }
        return jugadores.size
    }


}