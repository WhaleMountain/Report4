package jp.ac.uryukyu.ie.e175733;

public class Report4 {
    public static void main(String[] args){
        try {
            String str="3．14";
            double value=Double.parseDouble(str);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
