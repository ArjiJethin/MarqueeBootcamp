package W2Day3;

import java.util.*;

public class MazeSolver {

    static int solnctr;

    static void ms_helper(int[][] maze, boolean[][] visited, int start, int end, int solnctr) {

    }

    static void maze_solver(int[][] maze) {
        boolean[][] visited = new boolean[10][10];
        solnctr = 0;
        ms_helper(maze, visited, 0, 0, 0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] maze = { { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 0, 1, 1, 1, 1, 1, 0 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 0, 0, 0, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }, { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 } };

        maze_solver(maze);

        sc.close();
    }
}
