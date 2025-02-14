package com.java.company.BeyondJava8;

public class Question5 {
    public static void main(String[] args) {
        // repeat()
        String repeated = "Hello ".repeat(3);
        System.out.println("Here is the example of repeat() method applied on 'Hello' string: ");
        System.out.println(repeated);
        System.out.println();

        // strip() vs trim()
        String str1 = "   Hello World!   ";
        System.out.println("Here is the example of strip() vs trim() methods : ");
        System.out.println("'" + str1.strip() + "'");
        System.out.println("'" + str1.trim() + "'");
        System.out.println();

        // isBlank()
        System.out.println("Here is the example of isBlank() method : ");
        System.out.println("Is blank: " + str1.isBlank());
        System.out.println();

        // indent()
        System.out.println("Here is the example of indent() method : ");
        String str2 = "Hello\nWorld!";
        System.out.println(str2.indent(4));
        System.out.println();

        // transform()
        System.out.println("Here is the example of transform() method : ");
        String transformed = "hello".transform(s -> s.toUpperCase());
        System.out.println(transformed);
        System.out.println();

        // stripIndent()
        System.out.println("Here is the example of stripIndent() method : ");
        String indented = "    Hello\n    World!".stripIndent();
        System.out.println(indented);
        System.out.println();

        // translateEscapes()
        System.out.println("Here is the example of translateEscapes() method : ");
        String escaped = "Hello\\nWorld!\\tTab".translateEscapes();
        System.out.println(escaped);
        System.out.println();

        // formatted()
        System.out.println("Here is the example of formatted() method : ");
        String formatted = "My name is %s and I am %d years old.".formatted("Alice", 25);
        System.out.println(formatted);
        System.out.println();

        // Triple quotes (Text Blocks)
        System.out.println("Here is the example of textBlock : ");
        String textBlock = """
                           Hello,
                           This is a multi-line string.
                           Java 13 introduced text blocks!
                           """;
        System.out.println(textBlock);
    }
}

