package pl.sda.orange2.lambda;

public class LambdaExercises {
    public static void main(String[] args) {

        BoysDoCry boysDoCry = new ChlopaiTezPlacza();
        boysDoCry.sinoreki();
        ((ChlopaiTezPlacza)boysDoCry).sing();

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

    }
}
