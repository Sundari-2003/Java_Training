// 

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.util.List;
// import java.util.stream.Stream;

// public class WriteData {
//     public static void main(String[] args) throws IOException{
//         String path = "C:\\Users\\sundari.sridhar1\\Downloads\\Sundari Sridhar\\Java Fundamentals/mlajava.txt";

//         List<String> list = Stream.of("Hi hello", "Simple code", "MLA Sep Batch")
//                 .map(s -> s + " - success")
//                 .toList();

//         try {
//             Files.write(Paths.get(path), list);
//             Stream<String> read = Files.lines(Paths.get(path));
//             read.filter(dt -> dt.contains("Success")).map(String::toUpperCase).forEach(System.out::println);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

// }

package FileHandling;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class WriteData {
    public static void main(String[] args) throws IOException{
        String path = "C:\\\\Users\\\\sundari.sridhar1\\\\Downloads\\\\Sundari Sridhar\\\\Java Fundamentals/mlajava.txt";
        List<String> list = Stream.of("Hi hello", "Simple code", "MLA Sep Batch")
                                  .map(s -> s + " - success")
                                  .collect(Collectors.toList());

        try {
            Files.write(Paths.get(path), list);

            try (Stream<String> read = Files.lines(Paths.get(path))) {
                read.filter(dt -> dt.toLowerCase().contains("success"))
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
