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

    public static void move(int n, String first, String second, String third, List<String> moves) {
        
        if (n == 1) {
            moves.add(first + third);
        } else {
            move(n - 1, first, third, second, moves);
            moves.add(first + third);
            move(n - 1, second, first, third, moves);
        }
    }
}
