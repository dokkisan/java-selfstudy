package jan28.practice.framework;

// 즐거운 자바 강좌 45. 템플릿 메소드 패턴으로 추상 클래스 개념 익히기
/*
'초기화 -> 실행 -> 마무리' 순서의 프로그램이 있다고 하자.
이 중 초기화와 마무리 단계는 항상 같은 코드가 사용되고, 실행 단계는 매번 다른 코드를 사용할 수 있도록 한다.
Controller의 종류는 여러 개.
 */
public abstract class Controller {
    // 메서드가 오버라이드 되면 무조건 자식의 메서드로 실행 -> final로 오버라이딩 금지시킴
    protected final void init() {
        System.out.println("초기화 하는 코드입니다.");
    }

    protected final void close() {
        System.out.println("마무리 하는 코드입니다.");
    }

    protected abstract void run();

    // 메서드 실행 순서 강제 == **템플릿 메서드**
    public void execute() {
        this.init(); // this. 생략 가능
        this.run();
        this.close();
    }
}
