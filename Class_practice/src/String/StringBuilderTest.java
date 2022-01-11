package String;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));

        buffer.append(android);
        System.out.println(System.identityHashCode(buffer));
        // buffer의 주소는 변경되지 않음!

        String test = buffer.toString();
        System.out.println(test);
    }
}
