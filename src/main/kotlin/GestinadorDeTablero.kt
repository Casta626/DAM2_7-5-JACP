class GestinadorDeTablero(var tiempo:Int, var area:Int) {
    fun makeArea() {
        println(area)
        for (i in 0..area) {
            print("0,$i ")
        }
        println()
        for (i in 0..area) {
            print("$i,0 ")
        }
        println()

        for (i in 0..area) {
            print("$area,$i ")
        }

        println()
        for (i in 0..area) {
            print("$i,$area ")
        }
        if (tiempo >=10 && area>=1) {
            println()
            tiempo-=10
            area--
            makeArea()
        }else{
            println()
            println()
            println("El juego ha terminado")
        }
    }

}