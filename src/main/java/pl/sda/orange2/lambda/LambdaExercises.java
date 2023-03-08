package pl.sda.orange2.lambda;

public class LambdaExercises {
    public static void main(String[] args) {

        BoysDoCry boysDoCry = new ChlopaiTezPlacza();
        boysDoCry.sinoreki();
        ((ChlopaiTezPlacza) boysDoCry).sing();

        ChlopaiTezPlacza boysBoCry2 = new ChlopaiTezPlacza();
        boysBoCry2.sing();

        //anonymous class
        BoysDoCry anonymousClassReference = new BoysDoCry() {
            @Override
            public void sinoreki() {
                System.out.println("Anonimowy sinoreki");
            }
        };
        anonymousClassReference.sinoreki();

        BoysDoCry firstLambda = () -> {
        };
        BoysDoCry secondLambda = () -> System.out.println("Lambda!!");
        secondLambda.sinoreki();

        BoysDoCry thirdLambda = () -> {
            System.out.println("First instruction in thirdLambda");
            System.out.println("Secound instruction in thirdLambda");
        };
        thirdLambda.sinoreki();

        System.out.println("___________coffee time____________");

        CoffeeMaker myCoffeeMaker = (int water, String coffeeType) -> {
            return "my coffee";
        };
        CoffeeMaker myCoffeeMaker2 = (int water, String coffeeType) -> "my coffee";
        CoffeeMaker myCoffeeMaker3 = (int water, String coffeeType) -> {
            System.out.println("brewing...");
            return "flat white";
        };
        String myCoffee = myCoffeeMaker3.prepare(4, "white flat");
        System.out.println("my coffee is ready: " + myCoffee);

        CoffeeMaker shortVersion = (water, coffeeType) -> "my new coffee";
        shortVersion.prepare(3, "latte");

    }
}
