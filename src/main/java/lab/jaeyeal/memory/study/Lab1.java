package lab.jaeyeal.memory.study;

public class Lab1 {
    public static void main(String[] args) {
        int a = 999999999; // 단, 하나의 값을 저장할 수 있는 공간
        boolean flag = true || false;
        //PrimitiveType,원시타입,원시형=> int,long,short,double,boolean : null 이 될 수 없다.
        /** long, double, , Double*/

        String str = "문자열";
        Object str222 = null;
        Boolean flag2 = null;
        //ReferenceType,참조타입,참조형 => String,Class,Long,Double,Integer,Object : null을 가질 수 있다.

        int sub = 13;
        int main = 46;
        int temp = 0;

        temp = main; // 46
        main = sub;  // 13
        sub = temp;

        System.out.println(sub); // 46
        System.out.println(main); // 13









    }
}
