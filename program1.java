import java.util.Scanner;

class book {
    private String bookTitle, authorName, publisherName;
    private int id, yearOfPublication, numberOfAvailableCopies, totalCopies;

    public book() {
        bookTitle = "unknown";
        authorName = "unknown";
    }

    public book(int x) {
        bookTitle = "unknown";
        authorName = "unknown";
        id = x;
    }

    public void setDetails(String title, int year, String author, String publisher, int count) {
        bookTitle = title;
        yearOfPublication = year;
        authorName = author;
        publisherName = publisher;
        numberOfAvailableCopies = count;
    }

    public void getDetails() {
        System.out.println(bookTitle);
        System.out.println(yearOfPublication);
        System.out.println(authorName);
        System.out.println(publisherName);
        System.out.println(numberOfAvailableCopies);
    }

    public void issue() {
        if (numberOfAvailableCopies == 0) {
            System.out.println("The book you requested is not AVAILABLE");
        } else {
            numberOfAvailableCopies = numberOfAvailableCopies - 1;
        }
    }

    public void returnb() {
        numberOfAvailableCopies = numberOfAvailableCopies + 1;
    }
}

public class program1 {
    public static void main(String[] args) {
        int x = 5;
        book b[] = new book[x];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            b[i] = new book(i + 1);
        }
        System.out.println("Enter your Choice");
        System.out.println("1. Set Details");
        System.out.println("2. Get Details");
        System.out.println("3. Issue");
        System.out.println("4. Return");
        System.out.println("5. Exit");
        int ans = 0;
        while (ans == 0) {
            int cnt = sc.nextInt();
            if (cnt == 1) {
                System.out.println("Enter the ID of the book");
                int uid = sc.nextInt();
                System.out.println("Enter the title of book");
                String title = sc.next();
                System.out.println("Enter the name of author of the book");
                String author = sc.next();
                System.out.println("Enter the year of publication of the book");
                int year = sc.nextInt();
                System.out.println("Enter the name of publisher of the book");
                String publisher = sc.next();
                System.out.println("Enter the number of available copies of the book");
                int count = sc.nextInt();
                b[uid - 1].setDetails(title, year, author, publisher, count);
            } else if (cnt == 2) {
                System.out.println("Enter the ID of the book");
                int uid = sc.nextInt();
                b[uid - 1].getDetails();
            } else if (cnt == 3) {
                System.out.println("Enter the ID of the book you want to ISSUE");
                int uid = sc.nextInt();
                b[uid - 1].issue();
            } else if (cnt == 4) {
                System.out.println("Enter the ID of the book you want to RETURN");
                int uid = sc.nextInt();
                b[uid - 1].returnb();
            } else if (cnt == 5) {
                ans = 1;
            }
        }
    }
}