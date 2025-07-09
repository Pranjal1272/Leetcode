class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Create three sets, one for row, one for col, one for the square
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialising all the HashSets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.')
                    continue;

                char value = board[r][c];
                int boxIndex = (r / 3) * 3 + (c / 3);

                if (rows[r].contains(value) || cols[c].contains(value) || boxes[boxIndex].contains(value)) {
                    // Not valid sudoku
                    return false;
                }

                // Add the value for other iterations to check
                rows[r].add(value);
                cols[c].add(value);
                boxes[boxIndex].add(value);
            }
        }

        // No repeat means all conditions are satisfied, so return true
        return true;
    }
}