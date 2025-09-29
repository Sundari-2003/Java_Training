// package StreamAPI;

// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

// public class Exp1 {
//     public static void main(String[] args) {
//         List<String> data = Arrays.asList("Rohit" , "SKY" , "Kohli" , "Rahul");
        
//         // 1. Print the names which starts with "R" without StreamApi
//         for(String name : data){
//             if(name.startsWith("r")) System.out.println(name);
//         }

//         // Using Stream API
//         //1. Sequential
//         //2. Concurrent

//         System.out.println(data.stream().filter(x -> x.startsWith("r")));
//         data.stream().filter(x -> x.startsWith("r")).forEach(System.out::println);

//         List<String> fltrdata = data.stream().filter(x -> x.startsWith("r")).collect(Collectors.toList()); // tolinkedlist // toMap
//         fltrdata.forEach(x -> System.out.println(x.toUpperCase()));

//         //Distinct
//         List<String> fltrdata1 = data.stream().filter(x -> x.startsWith("r")).distinct().collect(Collectors.toList()); // tolinkedlist // toMap
//         fltrdata.forEach(x -> System.out.println(x.toUpperCase()));

//         Stream<String> strm = data.stream();
//     }
    
// }


package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exp1 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Rohit", "SKY", "Kohli", "Rahul");

        // 1. Print the names which start with "R" without Stream API
        for (String name : data) {
            if (name.startsWith("R")) System.out.println(name);
        }

        // Using Stream API
        // 1. Sequential
        // 2. Concurrent

        data.stream()
            .filter(x -> x.startsWith("R"))
            .forEach(System.out::println);

        List<String> fltrdata = data.stream()
            .filter(x -> x.startsWith("R"))
            .collect(Collectors.toList());

        fltrdata.forEach(x -> System.out.println(x.toUpperCase()));

        // Distinct
        List<String> fltrdata1 = data.stream()
            .filter(x -> x.startsWith("R"))
            .distinct()
            .collect(Collectors.toList());

        fltrdata1.forEach(x -> System.out.println(x.toUpperCase()));

        Stream<String> strm = data.stream(); // Just creating a stream, not used
    }
}