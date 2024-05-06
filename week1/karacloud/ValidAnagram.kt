package week1.karacloud

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val arr = IntArray(26)
    for (c in s) arr[c - 'a']++
    for (c in t) arr[c - 'a']--

    return arr.all { it == 0 }
}