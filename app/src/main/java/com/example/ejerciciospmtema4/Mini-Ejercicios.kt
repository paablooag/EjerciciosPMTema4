package com.example.ejerciciospmtema4



    fun main(){
        println(longitud("Hola calvo"))
        println(comparacion("Hola calvo", "Hola Calvo"))
        var cadena1="Hola calvo"
        var cadena2="Hola Calvo"
        //CompareTo
        println( cadena1.compareTo(cadena2) )
        println(mayusculas("jaja"))
        println(minusculas("JAJA"))
        println(trim(" hola "))
        println(subcadena("sadajshdjkashda"))
        println(remplazar("pito chico"))
        var cadenaSub="Pito Chico Grande"
        println(cadenaSub.split(","))
        println(unirlas("pito", "chico"))
        //ejercicio11
        var cadena="asdhaskjdhkjashda %s askjudhaskdh %d".format("pito", 10)
        println(cadena)
        //Ejercicio12
        println(remplazar("pito chico"))

    }

    fun longitud(cadena:String):Int{
        var res=0
        res=cadena.length
        return res
    }

    fun comparacion(cadena1:String, cadena2:String):Boolean{
    var cadena1lower= cadena1.lowercase()
    var cadena2lower= cadena2.lowercase()
        if(cadena1lower.equals(cadena2lower)){
            return true
        }
        return false
    }

    fun mayusculas(cadena:String):String{
        return cadena.uppercase()
    }
    fun minusculas(cadena:String):String{
        return cadena.lowercase()
    }
    fun trim(cadena: String):String{
        return cadena.trim()
    }
    fun subcadena(cadena: String):String{
        return cadena.substring(5, 10)
    }
    fun remplazar(cadena:String):String{
        return cadena.replace("pito", "pene")
    }
    fun unirlas(cadena1:String, cadena2:String):String{
        return cadena1+cadena2
    }
