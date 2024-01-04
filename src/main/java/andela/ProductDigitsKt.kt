package andela

import java.util.*
import kotlin.collections.ArrayList

class ProductDigitsKt {
    fun productDigits(num: Int): Int {
        val pairs: ArrayList<Int> = ArrayList()
        val stack = LinkedList<Int>()
        pairs.removeAt(0)
        // code goes here
        for(firstPair in 1..num) {
            if(num % firstPair == 0) {
                val secondPair = num / firstPair
                pairs.add("$firstPair$secondPair".length)
            }
        }

        val sortedPairs = pairs.sorted()
        return sortedPairs.first()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val input = 8 //90, 24
            println(ProductDigitsKt().productDigits(input))
        }
    }
}