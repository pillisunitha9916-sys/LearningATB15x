package operators;

public class Ternary_Operators {

    //condition ? expression1 : expression2;
    public static void main(String[] args) {
        int suni_age_goa = 20;

        String result = (suni_age_goa >18)  ? "eligible to go goa" : "not eligible to go goa";
        System.out.println(result);

        String result1 = (suni_age_goa <18) ? (suni_age_goa>25 ? "she can drink" : "she can't drink") : "not eligible to go goa";
        System.out.println(result1);



    }
}
