class Solution {
    private var answerSet = mutableSetOf<Int>() 
    fun solution(numbers: String): Int {
        var answer = 0
        val cards = numbers.toCharArray()
        cards.forEachIndexed { index, c -> 
            addNumber(c.toString(), cards.filterIndexed { i, _ -> index != i })
        }
        
        answerSet.forEach { 
            if(isPrime(it)) answer++
        }
        return answer
    }

    fun addNumber(number: String, cards: List<Char>) {
        answerSet.add(number.toInt())
        if(cards.isEmpty()) return
        
        cards.forEachIndexed{index, c -> 
            addNumber("$number$c",cards.filterIndexed { i, _ -> index != i  })
        }
    }

    fun isPrime(n: Int): Boolean {
        return n > 1 && (2 until n).none { n % it == 0 }

    }
}


