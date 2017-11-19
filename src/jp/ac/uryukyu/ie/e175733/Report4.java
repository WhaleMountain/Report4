package jp.ac.uryukyu.ie.e175733;

public class Report4 {
    public static void main(String[] args){
        try {
            String str=null;
            System.out.println(str.length());

        } catch (NullPointerException e) {
            System.out.println("Exception : NullPointerException");
            System.out.println(e.getMessage());
        }
    }
}
