package week1.karacloud

fun productExceptSelf(nums: IntArray): IntArray {
    val size = nums.size
    val result = IntArray(size) { 1 }
    var leftProduct = 1
    var rightProduct = 1

    for (i in 0..<size){
        result[i] *= leftProduct
        leftProduct *= nums[i]
        result[size - 1 - i] *= rightProduct
        rightProduct *= nums[size - 1 - i]
    }
    return result
}