package recursion

import kotlin.jvm.JvmStatic
import recursion.PermutationsKt

class PermutationsKt {
    fun permute(input: String) {
        permuteRecursively(input, 0, input.length)
    }

    fun permuteRecursively(str: String, start: Int, end: Int) {
        var elements = str
        if (start == end - 1) {
            println("Perm: $elements")
        } else {
            for (i in start until end) {
                elements = swap(elements, start, i)
                permuteRecursively(elements, start + 1, end)
                elements = swap(elements, start, i)
            }
        }
    }

    fun swap(source: String, start: Int, position: Int): String {
        val sourceChars = source.toCharArray()
        val tempChar: Char
        tempChar = sourceChars[start]
        sourceChars[start] = sourceChars[position]
        sourceChars[position] = tempChar
        return String(sourceChars)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val input = "abc"
            PermutationsKt().permute(input)
        }
    }
}