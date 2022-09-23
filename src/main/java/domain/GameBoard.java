package domain;

import java.io.*;
import java.nio.Buffer;

public class GameBoard {

    public GameBoard(Computer computer,Player player){

    }
    public void printStartMessage() throws IOException {
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("숫자를 입력해 주세요 :");
        bw.flush();
        bw.close();
    }
    public String scanString() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
