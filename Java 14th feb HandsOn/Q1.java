Q1) Write a java program declare the string array Batch Id and just
mention some batch id with different years eg. ACD22XD, & find
out all the batch ids which belongs to the year 22 and print the
total count of all those batch ids.
Ans.

package com.org.14thfebHandsOn;

public class Q1 {
    public static int countSubstr(String[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("22"))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String [] batchId = {"ACD22XD","BFC22KO","LMN20AB","KLC21BA","ABC22FE"};
        System.out.println("Count in which 22 appears : "+countSubstr(batchId));
    }
}
