package week1.karacloud

fun isPalindrome(s: String): Boolean {
    val result = s.filter { it.isLetterOrDigit() }
        .map { it.lowercase() }
    return result == result.reversed()
}


