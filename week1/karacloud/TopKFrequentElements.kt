package week1.karacloud

import java.util.*

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val freqMap = nums.groupBy { it }.mapValues { it.value.size }

    val pq = PriorityQueue<Map.Entry<Int, Int>>(k) { a, b -> b.value - a.value }
    pq.addAll(freqMap.entries)

    val result = mutableListOf<Int>()
    repeat(k) {
        result.add(pq.poll().key)
    }

    return result.toIntArray()
}