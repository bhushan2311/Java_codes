package DSA;

/*
1. Inside push function, push elements in st1
2. Inside pop function,
    i. while st1 !empty, pop all elements of st1 and push in st2
    ii. pop top elem of st2 only once and store it in a variable
    iii. while st2 !empty, pop all elements of st2 and push in st1
    iv. return the element that stored in a variable
*/

class Queue_2_stack extends StackImplementation{

    Queue_2_stack(int n){
        super(n);
    }
}

public class queue_using_stack {

    static int n = 5;
    public static Queue_2_stack st1 = new Queue_2_stack(n);
    public static Queue_2_stack st2 = new Queue_2_stack(n);

    public static void push(int v){
        st1.Push(v);
    }

    public static int pop(){
        while(!st1.isEmpty()){
            st2.Push(st1.Pop());
        }
        int elem = st2.Pop();
        while (!st2.isEmpty()){
            st1.Push(st2.Pop());
        }
        return elem;
    }
    public static void main(String[] args) {

        push(3);
        push(1);
        push(4);
        push(7);
        push(7);
        push(7);            // stack overflow here

        int v = pop();
        while (v != -1) {
            System.out.println(v);
            v=pop();
        }

//        System.out.println(pop());
//        System.out.println(pop());
//        System.out.println(pop());
//        System.out.println(pop());          // -1 as queue is empty
    }
}
