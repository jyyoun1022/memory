package lab.jaeyeal.memory.study;

public class LinkedList {

    static class Hat {
        private String color;
        private String type;

        public Hat() {
            this.color = "neutral";
            this.type = "undefined";
        }
    }

    static class BagOfHats {
        private static final int MAX_HATS = 5;
        private Hat[] hats;

        public BagOfHats() {
            hats = new Hat[MAX_HATS];
        }
    }

    //메소드가 완료되기 바로 전에 다음 프로그램에 대한 메모리 스냅샷을 그립니다. 각 메모리 세그먼트에 라벨을 명확하게 붙여야 합니다
    static class JavaMemoryModel {
        public final boolean Model = true;

//        이 시점에서 기억은 어떻게 보일까요
        public static void main(String[] args) {
            int j = 3;
            int x = j++;
            BagOfHats bag = new BagOfHats();

        }
        /**
         *  메서드 시작시
         *  스택 영역에 args,j,x,bag, 변수는 스택메모리에 할당
         *  힙 영역 BagOgHats 객체가 힙에 할당 하고 이 객체에는 초기화 시점에 Hat 객체배열을 갖고 있다.
         *
         *  j 변수가 스택에 3의 값으로 할당
         *   j++ 연산이 수행되고, 현재 j의 값 3이 x에 할당된 후에 j 값이 증가
         *   따라서 x = 3; j = 4가 된다.
         *
         *   BagOfHats 객체가 힙에 할당되고, 그 안에 크기가 4인 배열 hats를 생성
         *
         *   메서드 완료 직전에 스택영역의 args,j,x,bag, 변수는 소거, bag 변수가 힙에 할당된 BagOfHats 객체를 가리키고 있다.
         *
         *    메모리 에는 스택영역은 비어있고,
         *    힙 영역에는 BagOfHats 객체와 해당 객체 내의 Hat 배열만 남아있다.
         *
         */
    }
    public static void main(String[] args) {
    }
}
