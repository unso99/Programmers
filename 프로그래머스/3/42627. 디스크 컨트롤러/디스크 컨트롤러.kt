class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        var answer = 0
        var index = 0
        var time = 0
    
        val queue = java.util.PriorityQueue<IntArray>(compareBy{it[1]})

        java.util.Arrays.sort(jobs, compareBy{it[0]})

        while(index < jobs.size || !queue.isEmpty()){
            while(index < jobs.size && jobs[index][0] <= time) queue.offer(jobs[index++])

            if(queue.isEmpty()){
                time = jobs[index][0]
            }else{
                val job = queue.poll()
                answer += time - job[0] + job[1]
                time += job[1]
            }
        }

        return answer / jobs.size
    }
}