public class Switch {
    public static void main(String[] args) {
        String stuff = "January";

        switch (stuff.toLowerCase()) {
            case "january":
                System.out.println("A");
                break;
            case "march":
                System.out.println("B");
                break;
            case "october":
                System.out.println("C");
                break;
            case "stuff":
                System.out.println("D");
                break;
            case "meh":
                System.out.println("E");
            default:
                System.out.println("None");
        }
    }
}
