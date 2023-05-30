import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(4,5,6,7,1,2);
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
        demo(1,2,4,5);
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}