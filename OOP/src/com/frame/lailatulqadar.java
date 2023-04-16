package com.frame;

public class lailatulqadar {
    public static void doa(){
        String doaa="ya allah";
        int i;
        for (i=0; i<1; i++){
            System.out.println(doaa);
            i=i-1;
            pause(1500);
        }
        
        
    }
    public static void pause(int time){
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public static void main(String[] args) {
        doa();
    }
    
}
