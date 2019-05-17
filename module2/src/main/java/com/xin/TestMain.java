package com.xin;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Arrays;

/**
 * @author zhaoxin
 * @create 2019-05-15 10:45
 * @desc
 **/
public class TestMain {

    /**
     * 1 3 0 0 5 -> 12345 true
     * 00135
     * @param numbers
     * @return
     */
    public boolean isContinuous(int [] numbers) {

        if (numbers.length == 0) {
            return false;
        }

        int num_0 = 0;
        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] == 0) {
                num_0 +=1;
            }
        }

        Arrays.sort(numbers);   // 排序


        // 0 2 3 4 6
        if (num_0 == 0) {
            if ((numbers[4] - numbers[3]==1) && (numbers[3] - numbers[2]==1)&& (numbers[2] - numbers[1]==1) && (numbers[1] - numbers[0]==1)) {
                return true;
            } else {
                return  false;
            }
        } else if (num_0 == 1) {
            if((numbers[4] - numbers[1] >=3) && (numbers[4] - numbers[1] <=4) &&( numbers[4] != numbers[3]) &&( numbers[3] != numbers[2]) &&( numbers[2] != numbers[1])){
                return true;
            } else {
                return false;
            }
        } else if (num_0 == 2) {
            if((numbers[4] - numbers[2] >=2) && (numbers[4] - numbers[2] <=4) &&( numbers[4] != numbers[3]) &&( numbers[3] != numbers[2])){
                return true;
            } else {
                return false;
            }
        } else if (num_0 == 3) {
            if((numbers[4] - numbers[3] >=1) && (numbers[4] - numbers[3] <=4) &&( numbers[4] != numbers[3])){
                return true;
            } else {
                return false;
            }
        } else if (num_0 == 4) {
            return true;
        }

        return true;
    }

    public int add(int num1,int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String [] args) {
       int [] num = {1,0,0,5,0};
       boolean res = new TestMain().isContinuous(num);
       System.out.println(res);

       int calc = new TestMain().add(13,15);
        System.out.println(calc);

    }
}
