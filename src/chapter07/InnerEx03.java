package chapter07;

/*
public class InnerEx03 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;  // 외부클래스의 private멤버도 접근 가능하다.
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // 스태틱클래스는 외부클래스의 인스턴스멤버에 접근할 수 없다.
        // int siv = outerIv; // 비 static 필드 'outerIv'은(는) static 컨텍스트에서 참조할 수 없습니다
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;   // JDK1.8부터 final 생략 가능

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            // 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능하다.
            int liv3 = lv;  // 에러!!!(JDK1.8부터 에러 아님)
            int liv4 = LV;  // OK
        }
    }
}
*/
