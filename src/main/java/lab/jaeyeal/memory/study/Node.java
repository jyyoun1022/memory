package lab.jaeyeal.memory.study;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    // 쪽지, 배송지, 사용자 개인정보 관리(결제 수단 등록)
    public Node removeOdd(Node head) {
        // head가 비어있을 때
        if (head == null) {
            return null;
        }
        // 리스트의 시작을 저장하기 위한 변수
        Node current = head;
        Node prev = null;

        // 홀수인 노드를 찾아 제거
        while (current != null) {
            if (current.data % 2 != 0) {
                // 홀수인 경우 해당 노드를 제거
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next
                }
            }
        }
    }
    public static void main(String[] args) {
    }
}
