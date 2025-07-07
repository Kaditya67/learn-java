public class String_class {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        // Immutable Strings
        // String str = new String("Hello");   // not recommended --> creates a new object and is not memory efficient
        String str = "Hello World!";
        System.out.println(str);

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);       // true --> same object reference(same memory address)

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3 == s4);       // false --> different object reference

        System.out.println(s1.equals(s2));  // true --> same value
        System.out.println(s1.equals(s3));  // true --> same value

        // Mutable Strings
        StringBuilder sb = new StringBuilder("Hello");      // not thread safe

        StringBuffer sbf = new StringBuffer("Hello");   // poor performance
        System.out.println(sbf);

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println(sb.append(" World"));
        System.out.println(sb);

        System.out.println(sbf);
    }
}
