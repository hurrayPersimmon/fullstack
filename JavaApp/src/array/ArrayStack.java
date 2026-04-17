package array;

public class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    //public {결과형} {메소드명}({매개변수}) {실행문}
    //따라서 생성자는 반환형이 없고, 클래스명과 동일한 이름을 가진다.
    // this는 객체 자신을 가리키는 참조변수로, 클래스 내에서 멤버변수와 지역변수를 구분할 때 사용된다.
    // 사실 ArrayStack의 인자로 ArrayStack this, int size가 들어가야 하지만
    // 자바에서는 this는 생략해야 한다.
    public ArrayStack(int size){
        top = -1;
        capacity = size;
        stack = new int[size];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(stack[top--]);
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(stack[top]);
            return;
        }
        System.out.println("Stack is empty");

    }


    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(10);
        stack.push(20);
        stack.peek();
        stack.pop();
        stack.display();

    }

}
