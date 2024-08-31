package lab1.modules

interface IBaseNumber {
    val numero: Int

    fun printValue()
}

enum class NumberType {
    PRIME,
    ODD,
    EVEN
}

data class EvaluationResult(val numero: Int, val divisores: ArrayList<Int>, val tipo: NumberType)

interface IFizzBuzz {
    fun divisible(numero: Int)
    fun printValue(mensaje: String)
}

class PrimeNumber(override val numero: Int, val divisores: ArrayList<Int>) : IBaseNumber {
    init {
        printValue()
        printArray()
    }

    override fun printValue() {
        print(numero)
    }

    fun printArray () {
        print (" [")
        for (valor in divisores) {
            print(" $valor")
        }
        print(" ]\n")
    }
}

class OddNumber(override val numero: Int, val divisores: ArrayList<Int>) : IBaseNumber {

    init {
        printValue()
        printArray()
    }

    override fun printValue() {
        print(numero)
    }

    fun printArray () {
        print (" [")
        for (valor in divisores) {
            print(" $valor")
        }
        print(" ]\n")
    }
}

class EvenNumber(override val numero: Int, val divisores: ArrayList<Int>) : IBaseNumber {

    init {
        printValue()
        printArray()
    }

    override fun printValue() {
        print(numero)

    }

    fun printArray () {
        print (" [")
        for (valor in divisores) {
            print(" $valor")
        }
        print(" ]\n")
    }
}
