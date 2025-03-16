public class boolean1{
    public static void main(String[] args){
        boolean studied = true;
        boolean wellRested = true;

        if (wellRested){
            System.out.println("Best of luck today!");
            if (studied){
                System.out.println("You are prepared for your exam!");
            }else {
                System.out.println("Study before your exam!");
            }
        }
    }
}