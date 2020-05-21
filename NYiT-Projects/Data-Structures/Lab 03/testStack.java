public class testStack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.setMaxSize(5); //Set the maxSize to 5.

        if (s.pop() == null) System.out.println("Stack is empty.");

        if(!s.push("One")) System.out.println("Stack is full.");
        if(!s.push("Two")) System.out.println("Stack is full.");
        if(!s.push("Three")) System.out.println("Stack is full.");
        if(!s.push("Four")) System.out.println("Stack is full.");
        if(!s.push("Five")) System.out.println("Stack is full.");
        if(!s.push("Six")) System.out.println("Stack is full.");

        if (s.pop() == null) System.out.println("Stack is empty.");
        if (s.pop() == null) System.out.println("Stack is empty.");
    }
}
