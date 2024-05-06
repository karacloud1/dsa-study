package week1.karacloud

fun twoSum2(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.size - 1
    while (numbers[left] + numbers[right] != target) {
        if (numbers[left] + numbers[right] > target) {
            right--
        } else {
            left++
        }
    }
    return intArrayOf(++left, ++right)
}