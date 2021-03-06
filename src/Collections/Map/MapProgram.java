package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        //Putting key value pair in map

//        languages.put("Java","a compiled high level, object-oriented , platform independent language");
//        languages.put("Python","an interpreted, object-oriented ,high level programming language with dynamic semantics");
//        languages.put("Algol","an algorithmic language");
//        languages.put("BASIC","Beginners all purpose symbolic Instruction Code");
//        languages.put("Lisp","Therein lies madness");
//        System.out.println(languages.get("Java")); // a compiled high level, object-oriented , platform independent language
//        //Although keys are unique but if again used then replaced but gives no errors.
//        languages.put("Java","this course is about Java");
//        System.out.println(languages.get("Java"));



//        System.out.println(languages.put("Java","a compiled high level, object-oriented , platform independent language"));// null
//        languages.put("Python","an interpreted, object-oriented ,high level programming language with dynamic semantics");
//        languages.put("Algol","an algorithmic language");
//        languages.put("BASIC","Beginners all purpose symbolic Instruction Code");
//        languages.put("Lisp","Therein lies madness");
//        // gives previous value of key "Java"
//        // But if we put sout when the value is put into the map then it gives null value
//        System.out.println(languages.put("Java","this course is about Java")); // gives previous value of key "Java"
//        System.out.println(languages.get("Java"));  // gives changed value of key "Java"



//        if (languages.containsKey("Java")){
//            System.out.println("Java already exists");
//        }else {
//            languages.put("Java","a compiled high level, object-oriented , platform independent language");
//            System.out.println("Java added successfully");
//        }
//        languages.put("Python","an interpreted, object-oriented ,high level programming language with dynamic semantics");
//        languages.put("Algol","an algorithmic language");
//        languages.put("BASIC","Beginners all purpose symbolic Instruction Code");
//        languages.put("Lisp","Therein lies madness");
//        if (languages.containsKey("Java")){
//            System.out.println("Java is already in the map");
//        }else {
//            languages.put("Java","this course is for Java");
//        }
//        System.out.println("****************");
//        for (String key : languages.keySet()){
//            System.out.println(key+":"+languages.get(key));
//        }

        //OUPUT  :There is no order in the output
//        Java:a compiled high level, object-oriented , platform independent language
//        BASIC:Beginners all purpose symbolic Instruction Code
//        Lisp:Therein lies madness
//        Python:an interpreted, object-oriented ,high level programming language with dynamic semantics
//        Algol:an algorithmic language



//        languages.put("Java","a compiled high level, object-oriented , platform independent language");
//        languages.put("Python","an interpreted, object-oriented ,high level programming language with dynamic semantics");
//        languages.put("Algol","an algorithmic language");
//        languages.put("BASIC","Beginners all purpose symbolic Instruction Code");
//        languages.put("Lisp","Therein lies madness");
//        languages.remove("Lisp");
//        if (languages.remove("Algol","a family of of algorithmic languages")){
//            System.out.println("Algol removed");
//        }else {
//            System.out.println("Algol not removed, key-value pair not found");
//        }
//        System.out.println(languages.replace("Lisp","a functional programming language with imperative features")); // null
//        System.out.println(languages.replace("Scala","this will not work")); // null
//        for (String key : languages.keySet()){
//            System.out.println(key+":"+ languages.get(key));
//        }

        //OUTPUT : key-value pair of Lisp and its corresponding value is removed due to remove() method. This has no relation with replace() method
//        Java:a compiled high level, object-oriented , platform independent language
//        BASIC:Beginners all purpose symbolic Instruction Code
//        Python:an interpreted, object-oriented ,high level programming language with dynamic semantics
//        Algol:an algorithmic language

        languages.put("Java","a compiled high level, object-oriented , platform independent language");
        languages.put("Python","an interpreted, object-oriented ,high level programming language with dynamic semantics");
        languages.put("Algol","an algorithmic language");
        languages.put("BASIC","Beginners all purpose symbolic Instruction Code");
        languages.put("Lisp","Therein lies madness");
        //languages.remove("Lisp");
//        if (languages.remove("Algol","a family of of algorithmic languages")){
//            System.out.println("Algol removed");
//        }else {
//            System.out.println("Algol not removed, key-value pair not found");
//        }
        if (languages.replace("Lisp","Therein lies madness","a functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        }else {
            System.out.println("Lisp was not replaced");
        }
        for (String key : languages.keySet()){
            System.out.println(key+":"+ languages.get(key));
        }

        //OUTPUT:
//        Lisp replaced
//        Java:a compiled high level, object-oriented , platform independent language
//        BASIC:Beginners all purpose symbolic Instruction Code
//        Lisp:a functional programming language with imperative features
//        Python:an interpreted, object-oriented ,high level programming language with dynamic semantics
//        Algol:an algorithmic language

    }
}
