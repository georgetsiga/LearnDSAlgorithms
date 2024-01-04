package coderbyte

class QuestionsMarks {
    fun QuestionsMarksLogic(str: String): String {

        // code goes here
        val charArray = str.toCharArray()
        var qMarkCounter = 0
        var nextDigit = -1
        var sum = 0
        var result = "false"

        for (c in charArray) {
            println("Character: $c")
            println("Counter: $qMarkCounter")
            println("Result: $result")
            println("____________________")
            if (c.isDigit()) {
                sum = nextDigit + Integer.valueOf(c.toString())
                nextDigit = Integer.valueOf(c.toString())

                if (sum != 10) {
                    qMarkCounter = 0
                    result = "false"
                    continue
                }

                result = if (qMarkCounter == 3 && sum == 10)
                    "true"
                else
                    "false"
                qMarkCounter = 0
            } else if (c == '?') {
                qMarkCounter++
            }
        }
        return result
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val input = "acc?7??sss?3rr1??????5"
            //val input = "9???1???9??1???9"
            println(QuestionsMarks().QuestionsMarksLogic(input))
        }
    }
}