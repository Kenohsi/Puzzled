import java.util.Scanner;

public class Player {
    public final int color;
    public String name;

    public Player(int color, String name) {
        this.color = color;
        this.name = name;
    }


    public int getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void makeMove(vierGewinnt vierg) {
        Scanner s = new Scanner(System.in);
        int spielerEingabe = s.nextInt();
        int row;
        int colm;


    }

    public boolean setzeChipAmigo(Player p, int row, int col) {
        boolean schonBesetzt = true;                               // true wenn "schon besetzt"


        return schonBesetzt;
    }

    public static void main(String[] args) {
        Player p1 = new Player(0, "kenogewinner");      // 0 -> Rot
        Player p2 = new Player(1, "ivanaverliert");     // 1 -> Gelb
        vierGewinnt spielfeld = new vierGewinnt(p2, p1);
    }

}
