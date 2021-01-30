import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();
        String input = scanner.nextLine();
        System.out.println("<h1>");
        System.out.println(title);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.println(content);
        System.out.println("</article>");

        while (!"end of comments".equals(input)) {

            System.out.println("<div>");
            System.out.println(input);
            System.out.println("</div>");
            input = scanner.nextLine();
        }

    }


}
