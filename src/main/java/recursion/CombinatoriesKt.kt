package recursion

import kotlin.jvm.JvmStatic
import java.util.ArrayList

class CombinatoriesKt {
    fun combinations(arr: Array<String>): Array<String?> {
        val elements = arr.toCollection(ArrayList<String>())
        elements.removeAt(0)
        if (elements.isEmpty()) {
            return arrayOf(" ")
        }
        val firstElem = elements[0]
        //val restOfElem = elements.copyOfRange(1, elements.size)
        val restOfElem = elements.drop(1) as Array<String>
        val combsWithoutFirst = combinations(restOfElem)
        val combsWithFirst: MutableList<String> = ArrayList()
        for (item in combsWithoutFirst) {
            val combination = (firstElem + item).trim { it <= ' ' }
            combsWithFirst.add(combination)
        }
        val result = combsWithoutFirst.copyOf(combsWithoutFirst.size + combsWithFirst.size)
        System.arraycopy(combsWithFirst.toTypedArray(), 0, result, combsWithoutFirst.size, combsWithFirst.size)
        return result
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val elements = arrayOf("a", "b", "c", "d")
            val results = CombinatoriesKt().combinations(elements)
            println(results.contentToString())
        }
    }
}