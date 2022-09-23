package View;

import java.util.Scanner;

public class InputView {

    public InputView() {}
    public String getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
