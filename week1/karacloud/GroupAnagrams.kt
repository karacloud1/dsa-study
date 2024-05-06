package week1.karacloud
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val anagramMap = mutableMapOf<String, MutableList<String>>()

    for (s in strs) {
        val key = String(s.toCharArray().sortedArray())
        if (anagramMap.containsKey(key)) {
            anagramMap[key]!!.add(s)
        } else {
            val list = mutableListOf<String>()
            list.add(s)
            anagramMap[key] = list
        }
    }

    return anagramMap.values.toList()
}
