package lab1.modules

class FizzBuzz: IFizzBuzz {

    init {
        val rango = 1..100
        for (numero in rango) {
            divisible(numero)
        }
    }

    override fun divisible(numero: Int) {
        var mensaje: String
        if (numero % 3 == 0 && numero % 5 == 0) {
            mensaje = "FizzBuzz"
        } else if (numero % 3 == 0) {
            mensaje = "Fizz\t"
        } else if (numero % 5 == 0) {
            mensaje = "Buzz\t"
        } else {
            mensaje = "$numero\t\t"
        }

        if (numero % 10 == 0) {
            mensaje += "\n"
        }
        printValue(mensaje)
    }

    override fun printValue(texto: String) {
        print(texto)
    }
}