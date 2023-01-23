package chapter07;

public class InnerEx02 {
    class InstanceInner {}
    static class StaticInner {}

    // 인스턴스멤버 간에는 서로 직접 접근이 가능하다.
    InstanceInner iv = new InstanceInner();
    // static멤버 간에는 서로 직접 접근이 가능하다.
    static StaticInner cv = new StaticInner();

    static void staticMethod() {

    }

    void instanceMethod() {

    }

    void myMethod() {

    }
}
