package W2Day4;

public class SudokuSolver {

    static void solver_rec(int[][] grid, int[][] copy_grid, int row, int col) {
        int wr = row;
        int wc = col;
        if (wr == 9) {
            return;
        }

        if (grid[wr][wc] != 0) {
            // if()
        }

    }

    static void solver(int[][] grid, int row, int column) {

        int[][] copy_grid = grid;
        solver_rec(grid, copy_grid, 0, 0);

    }

    public static void main(String[] args) {

        int grid[][] = {
                { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };

        solver(grid, 0, 0);

    }
}
