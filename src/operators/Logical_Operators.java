package operators;

public class Logical_Operators {//(logical && || !)
    public static void main(String[] args) {
        int age=30;
        String name = "Sunitha";
        String name1="Sunitha";

        boolean result = age>10 && age>50;
        System.out.println(result);

        boolean correct_name =!(name==name1 || name != name1);
        System.out.println(correct_name);







    }
}
