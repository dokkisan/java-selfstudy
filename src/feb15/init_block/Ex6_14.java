package feb15.init_block;

// 참고자료 : 자바의 정석

public class Ex6_14 {
    // 클래스 초기화 블록
    static {
        System.out.println("static { }");
    }

    // 인스턴스 초기화 블록
    {
        System.out.println("{ }");
    }

    public Ex6_14() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14(); ");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
        Ex6_14 bt2 = new Ex6_14();
    }
}


