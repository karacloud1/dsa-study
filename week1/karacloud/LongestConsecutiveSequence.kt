package week1.karacloud

fun longestConsecutive(nums: IntArray): Int {
    val map = nums.toHashSet()

    var max = 0
    for (num in nums) {
        if (!map.contains(num)) {
            continue
        }

        var left = num
        var right = num

        while (map.contains(--left)) {
            map.remove(left)
        }
        while(map.contains(++right)) {
            map.remove(right)
        }

        val count = right-left-1;
        if (count > max) {
            max = count
        }
    }
    return max
}