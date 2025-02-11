public class Message {

    // Method to print the message
    public void printMessage(String name) {
        System.out.println("hello " + name);
    }


    public static void main(String[] args) {
        Message m = new Message();
        m.printMessage("Geek");
    }
}
