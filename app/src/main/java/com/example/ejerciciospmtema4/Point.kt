package com.example.ejerciciospmtema4



//21.Crea una clase Point con propiedades x e y. Implementa una función infix
//que calcule la distancia entre dos puntos.
//class Point(val punto:Double)
//infix fun Point.distancia(otroPunto: Point):Point{
//    return Point(this.punto-otroPunto.punto)
//}
//
//fun main(){
//    val a = Point(10.23)
//    val b = Point(17.2)
//    val c = Point(20.12)
//
//    val res= b distancia c
//
//    println("La distancia que hay es: ${res.punto}")
//}


//22.Define una variable lazy que almacene la suma de dos números. La suma
//debe calcularse solo cuando se accede a la variable. Luego, usa lateinit para
//inicializar una variable de tipo String antes de asignarle un valor.
//class Suma{
//    lateinit var variable:String
//    fun inicializar(){
//        variable="Inicializando"
//        println(variable)
//    }
//}
//val variable by lazy {
//    val numero1=1.5
//    val numero2=2.2
//    println(numero1+numero2)
//}
//fun main(){
//
//    val instancia = Suma()
//    instancia.inicializar()
//    println(variable)
//
//}


//23. With:
//Utiliza la función with para configurar un objeto StringBuilder. Agrega tres
//líneas de texto al objeto y luego imprime el resultado.

//class Pito{
//    var nombre:String=""
//    var tamano:Double=0.0
//    var color:String=""
//}
//fun main(){
//    val pito=Pito()
//
//    with(pito){
//        nombre="Juan Carlos"
//        tamano=12.69
//        color="Negro"
//    }
//    println("Nombre del pito: ${pito.nombre} \n" +
//            "Tamaño del pito: ${pito.tamano} \n" +
//            "Color del pito: ${pito.color}")
//
//}

//24. Apply:
//Crea una clase Person con propiedades como name, age, y address. Utiliza
//la función apply para construir una instancia de Person con valores
//específicos.
//
//class Pito{
//    var nombre:String=""
//    var tamano:Double=0.0
//    var color:String=""
//}
//fun main(){
//    val pito=Pito()
//
//    pito.apply{
//        nombre="Juan Carlos"
//        tamano=12.69
//        color="Negro"
//    }
//    println("Nombre del pito: ${pito.nombre} \n" +
//            "Tamaño del pito: ${pito.tamano} \n" +
//            "Color del pito: ${pito.color}")
//}

//25. Run:
//Define una función calculateArea que toma la longitud y el
//ancho de un rectángulo y devuelve su área. Luego, utiliza run
//para imprimir el área de un rectángulo específico

fun main(){


    class Rectangulo (var longitud: Double = 0.0, var ancho: Double = 0.0)

    var rec = Rectangulo(3.0, 6.0)

    rec.run {
        var area = calculateArea(longitud, ancho)
        println(area)
    }

}
fun calculateArea(longitud:Double, ancho:Double):Double{

    return longitud * ancho

}

//26. Let:
//Declara una cadena nullable y utiliza la función let para
//imprimir su longitud solo si no es nula.
//data class Pito(val nombre: String?, val apellido: String?)
//fun main(){
//    var pito:Pito?= Pito("Pitito", "Gordo")
//    val longitud = pito?.let {
//        it.nombre!!.length
//        it.apellido!!.length
//    }?: 0
//    if (pito != null) {
//        println("Nombre: ${pito.nombre} \n" +
//                "Apellido: ${pito.apellido} \n" +
//                "Longitud apellido: $longitud")
//    }
//}

//27. Also:
//Crea una lista de números y utiliza la función also para
//imprimir un mensaje antes y después de aplicar una
//operación a cada elemento de la lista.

//fun main(){
//    val lista = mutableListOf(1,2,3,4,5,6,69)
//    val tamanoPito = lista.also { println("¿Tendras el pito chico?") }
//        .map { it}
//        .also { println("Cual sera tu tamaño? Tendras suerte?") }
//        .sum()
//    println("Y.... te mide $tamanoPito \n¡¡Enhorabuena campeon!!")
//}