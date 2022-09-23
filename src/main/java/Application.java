import domain.Computer;
import domain.GameBoard;
import domain.Player;


public class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Player player = new Player();
        GameBoard gameBoard = new GameBoard(computer, player);
        Game

    }
}
