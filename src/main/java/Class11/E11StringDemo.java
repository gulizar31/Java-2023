package Class11;public class E11StringDemo {

    public static void main(String[] args) {

        String str="sdhfsbBHJNBH134";
        System.out.println(str.replaceAll("[A-Z]", "*"));
        System.out.println(str.replaceAll("[a-z]", "*"));
        System.out.println(str.replaceAll("[^A-Z]","*"));



    }

}



