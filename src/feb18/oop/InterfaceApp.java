package feb18.oop;

// 참고자료 : 생활코딩 Java Interface 1, 2

// 인터페이스는 약속, 클래스의 형태를 규정한다.

interface Calculable {
    // 인터페이스에는 메서드와 변수가 정의될 수 있음.
    double PI = 3.14; // 변수는 값이 들어와야 함.
    int sum(int v1, int v2);
}

interface Printable {
    void print();
}

class RealCal implements Calculable, Printable {
    @Override
    public int sum(int v1, int v2) {
        return v1+v2;
    }

    public void print() {
        System.out.println("This is RealCal.");
    }
}

public class InterfaceApp {
    public static void main(String[] args) {
        RealCal c = new RealCal();
        System.out.println(c.sum(2, 1));
        c.print();
        System.out.println(c.PI);
    }
}
