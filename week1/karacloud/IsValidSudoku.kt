package week1.karacloud

fun isValidSudoku(board: Array<CharArray>): Boolean {
    for (i in board.indices) {
        val row = mutableSetOf<Char>()
        val column = mutableSetOf<Char>()
        val cube = mutableSetOf<Char>()

        for (j in board.indices) {
            if (board[i][j] != '.' && !row.add(board[i][j])) {
                return false
            }

            if (board[j][i] != '.' && !column.add(board[j][i])) {
                return false
            }

            val cubeRow = 3 * (i / 3)
            val cubeCol = 3 * (i % 3)
            val num = board[cubeRow + j / 3][cubeCol + j % 3]
            if (num != '.' && !cube.add(num)) {
                return false
            }
        }
    }

    return true
}
