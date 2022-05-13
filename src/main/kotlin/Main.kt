import java.io.File
import java.io.InputStream
import java.nio.file.Files.write
import java.nio.file.StandardOpenOption

fun main(args: Array<String>) {

    /*
    val inputStream: InputStream = File("C:\\Users\\ercas\\Downloads\\DAM2_7-5-JACP\\src\\main\\resources\\prueba.txt").inputStream()
    val inputString = inputStream.bufferedReader().use { it.readText() }
    println(inputString) // muestra en consola todo el archivo
     */


    val inputStream2: InputStream = File("C:\\Users\\ercas\\Downloads\\DAM2_7-5-JACP\\src\\main\\resources\\test-1.in").inputStream()
    val lineas = mutableListOf<String>()
    inputStream2.bufferedReader().useLines { lines -> lines.forEach { lineas.add(it) } }
    var n = 1
    //lineas.forEach { println("${n++} " + it) } imprime todo el archivo numerando cada línea

    var w = 0
    var z = 2
    var boolean :Boolean = false
    lineas.forEach {

        if (lineas[w].contains("#")){
            println("Paramos")
        }else {
            println(it)
            w++
        }
    }
    //println(lineas[0])
    var area = lineas[0].toInt()
    var tiempo = lineas[1].toInt()
    var prueba = (lineas[3].removeRange(1..1).toFloat()/10).toString()
    println(prueba)



    var jugadores: MutableList<String> = mutableListOf()
    for (x in 2 until w){
        jugadores.add((lineas[x].removeRange(1..1).toFloat()/10).toString())

    }
    println(jugadores.toString())

    var a = GestinadorDeTablero(tiempo, area, jugadores)
    a.makeArea()
    println("Consolita "+a.makeArea())

    //  ESCRIBIR ARCHIVOS

    val outString = a.makeArea().toString()
    val archivo = File("C:\\Users\\ercas\\Downloads\\DAM2_7-5-JACP\\src\\main\\resources\\test-1.ans")
    write(archivo.toPath(), outString.toByteArray(), StandardOpenOption.CREATE)


}