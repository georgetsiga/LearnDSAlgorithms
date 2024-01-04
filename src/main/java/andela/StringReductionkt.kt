package andela
// Solution Steps:
// 1- Calculate the total sum of abc
// 2- If 2 adjacent chars are different, subtrat from the sum and
// replace them with the result
// 3- Do the same steps recursively.
//  The base case of recursion:
//  a- The length is 1
//  b- The result is equal to the input (all chars are equal like aaaa)

class StringReductionkt {
    @OptIn(ExperimentalStdlibApi::class)
    fun stringReduction(str: String): String {
        val sum = ('a'.code + 'b'.code + 'c'.code)
        return reduce(str, sum).length.toString()
    }

    @OptIn(ExperimentalStdlibApi::class)
    private fun reduce(str: String, sum: Int): String {
        if (str.length == 1) return str
        var result = ""
        var i: Int = 0
        while (i < str.length) {
            if (i + 1 < str.length && str[i] != str[i + 1]) {
                result += (sum - str[i].code - str[i + 1].code).toChar()
                i += 2
            } else {
                result += str[i]
                i++
            }
        }
        // if the result is equal to str, this means all chars are equal
        // So we don't need further processing
        if (result == str) return str
        return reduce(result, sum)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val str = "abcabc"
            println(StringReductionkt().stringReduction(str))
        }
    }


}