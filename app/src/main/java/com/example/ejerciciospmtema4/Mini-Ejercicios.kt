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
        println(remplazar("pito chicoa"))
        //ejercicio13
//        var a= null
//        var b = null
//        var suma= (a?:1) + (b?:1)
//        var resta=(a?:1) - (b?:1)
//        var multiplicacion=(a?:1) * (b?:1)
//        println("$suma   $resta   $multiplicacion")

        //ejercicio14
        var a= null
        var b = null
        var suma= (a?:1) + (b?:1)
        var resta=(a?:1) - (b?:1)
        var multiplicacion=(a?:1) * (b?:1)
        println("$suma   $resta   $multiplicacion")

       println(any("Hola"))

        //e.16,17,18
        println("introduce dos numeros")
        var numero1 = readLine()
        var numero2 = readLine()
       println(dividir(null, null))



    }
//ejercicio16,17,18
    fun dividir(numero1: String?, numero2: String?):Double{
    var res=0.0
        if((numero1 is String) and (numero2 is String)){

    var n= numero1?.toInt() ?: 10
    var n2 = numero2?.toInt() ?: 20
        if(n<=0 || n2<=0){
            throw RuntimeException("No se puede dividir entre 0")
        }else if (n%n2==0){
            throw ArithmeticException("El divisor es igual a 0")
        }else{
            res= (n/n2).toDouble()
        }
        }else{
            throw RuntimeException("pito")
        }
        return res
    }

//ejercicio15
    fun any(parametro:Any):Int{
        var res=0
        if(parametro is String){
            return parametro.length
        }
        return res
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
