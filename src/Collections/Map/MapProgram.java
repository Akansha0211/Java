package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        //Putting key value pair in map
        languages.put("Java","a compiled high level, object-oriented , platform independent language");
        languages.put("Python","an interpreted, object-oriented ,high level programming language with dynamic semantics");
        languages.put("Algol","an algorithmic language");
        languages.put("BASIC","Beginners all purpose symbolic Instruction Code");
        languages.put("Lisp","Therein lies madness");

        System.out.println(languages.get("Java")); // a compiled high level, object-oriented , platform independent language

        //Although keys are unique but if again used then replaced but gives no errors.
        languages.put("Java","this course is about Java");
        System.out.println(languages.get("Java"));



    }
}
