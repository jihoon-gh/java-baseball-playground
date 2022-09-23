package domain;

import java.util.*;
import java.util.stream.Collectors;

public class Computer {
    List<Integer> nums = new ArrayList<>();

    public Computer(){
        generateNumbers();
    }
    public Computer(List<Integer> test){
        nums=test;
    }
    public void generateNumbers(){
        nums.clear();
        while(nums.size()<3){
            Integer a = (int)((Math.random()*10000)%10);
            checkAndAddNumber(a);
        }
    }
    public void checkAndAddNumber(Integer a){
        if(nums.contains(a)) return;
        nums.add(a);
    }
    public int getSizeOfList(){
        return nums.size();
    }

    public Integer checkBall(Integer k){
        if(nums.contains(k)) return 1;
        return 0;
    }
    public int getBall(List<Integer> values){
        Integer ball = 0;
        for(Integer x : values){
            ball+=checkBall(x);
        }
        return ball;
    }

    public int getStrike(List<Integer> values){
        Integer strike = 0;
        for(int i =0;i<values.size();i++){
            strike +=checkStrike(i,values);
        }
        return strike;
    }

    private Integer checkStrike(int i, List<Integer> values) {
        if(nums.get(i)==values.get(i)) return 1;
        return 0;
    }

    public void printNums(){
        for(Integer a : nums){
            System.out.print(a);
        }
        System.out.println('\n');
    }


}
