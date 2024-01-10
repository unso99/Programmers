class Solution {
    fun solution(numbers: LongArray): LongArray {
        var answer = LongArray(numbers.size)
        for(i in numbers.indices){
            var number = numbers[i].toString(2)

            if(!number.contains('0')) {
                number = "0$number"
                answer[i] = findNext(number)
                continue
            }

            val arr = number.toCharArray()
            if(arr[arr.lastIndex] == '0'){
                arr[arr.lastIndex] = '1'
                answer[i] = String(arr).toLong(2)
                continue
            }

            answer[i] = findNext(number)

            
        }
        return answer
    }

    fun findNext(number : String) : Long{
        val arr = number.toCharArray()
        for(i in arr.lastIndex downTo 0){
            if(arr[i] == '0') {
                arr[i] = '1'
                arr[i+1] = '0'
                return String(arr).toLong(2)
            }
        }

        return 0L
    }
}