import java.util.*;


public class BetterProgrammerTask {

    public static List<String> transferFromAtoC(int n) {
        /*
          Towers Of Hanoi.
          There are three pegs: A, B and C. There are n disks. All disks are different in size.
          The disks are initially stacked on peg A so that they increase in size from the top to the bottom.
          The goal is to transfer the entire tower from the A peg to the C peg.
          One disk at a time can be moved from the top of a stack either to an empty peg or to
          a peg with a larger disk than itself on the top of its stack.

          The method should return a sequence of disk moves, each move is a String with two letters (A, B or C)
          corresponding to the peg the disk moves from and the peg it moves to.
          For example, the move "AC" means that a top disk from peg A should be moved to peg C.
         */

        List<String> moves = new ArrayList<String>();

        move(n, "A", "B", "C", moves);

        return moves;
    }

    public static void move(int n, String start, String auxiliary, String end, List<String> moves) {
        if (n == 1) {
            moves.add(start + end);
        } else {
            move(n - 1, start, end, auxiliary, moves);
            moves.add(start + end);
            move(n - 1, auxiliary, start, end, moves);
        }
    }

    public static void main(String args[]) {

        List<String> movies = transferFromAtoC(3);

        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }
    }
}
