package andela

class NumberEncodingKt {
    fun NumberEncoding(str: String): String {

        // code goes here
        val alphabet = listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
        var resultString = StringBuilder()
        val characters = str.toCharArray()


        for(c in characters) {
            val index = alphabet.indexOf(c)
            if (index != -1) {
                resultString.append((index + 1 ).toString())
            } else {
                resultString.append(Character.toString(c))
            }
        }
        return resultString.toString()

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val elements = "hello 45"
            val results = NumberEncodingKt().NumberEncoding(elements)
            println(results)
        }
    }
}