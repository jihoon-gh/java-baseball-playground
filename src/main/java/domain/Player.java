package domain;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Integer> nums = new ArrayList<>();

    public Player(){}
    public void changeStringToInteger(String[] values){
        for(String s : values){
            nums.add(Integer.parseInt(s));
        }
    }
    public List<Integer> getNums(){
        return nums;
    }

}
