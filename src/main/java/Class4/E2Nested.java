package Class4;

public class E2Nested {
    public static void main(String[] args) {

        double budget=35000;
        String engineType="hydbrid";
        if (budget>=50000){

            if (engineType.equals("Electric")){
                System.out.println("want to buy tesla");

            }else if (engineType.equals("hydbrid")) {
                System.out.println("I want toyota");
            }else {
                System.out.println("i want Porsche");
            }
        } else if (budget>=30000) {
            if (engineType.equals("electric"))
                System.out.println("i want Pulsar");
            else if (engineType.equals("hydbrid")) {
                System.out.println("i want camry");

            } else {
                System.out.println("hyundai Senata");
            }

        }else if (budget>=20000){
            if (engineType.equals("electric")) {
                System.out.println("nissan");
            } else if (engineType.equals("hydbrid")) {
                System.out.println("kia");
            }else {
                System.out.println("civic");
            }
            System.out.println("let save more");

        }


    }

}
