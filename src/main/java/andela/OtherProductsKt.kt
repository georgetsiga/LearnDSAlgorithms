package andela

class OtherProductsKt {
    fun otherProducts(arr: Array<Int>): String {

        // code goes here
        val numbers = arr.toCollection(ArrayList<Int>())
        var index: Int = 0
        val resultStringList: ArrayList<String> = ArrayList()

        while (index <= numbers.size - 1) {
            val finalNumbers = ArrayList(numbers)
            finalNumbers.removeAt(index++)
            val resultString = finalNumbers.reduce{accumulator, i -> accumulator * i}
            resultStringList.add(resultString.toString())
        }
        return resultStringList.joinToString("-");

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val elements = arrayOf(1, 4, 3)
            val results = OtherProductsKt().otherProducts(elements)
            println(results)
        }
    }
}