package Lambda_expression;
interface FunInf1 {

    String sayHello(String name);
}


public class Exp2 {
    public static void main(String[] args) {
        FunInf1 obj = (String  name) ->
        {
            System.out.println("Hi" + name);
            return "Executed the lambda expression and returned";
        };

        System.out.println(obj.sayHello(" SKY"));
        

    }
}
