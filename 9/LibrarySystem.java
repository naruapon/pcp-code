class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;
    private int pages;
    
    public Book(String isbn, String title, String author, double price, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }
    
    public void displayInfo() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + " THB");
        System.out.println("Pages: " + pages);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // สร้าง Object ที่ 1
        Book book1 = new Book("978-0134685991", "Effective Java", 
                             "Joshua Bloch", 1200, 416);
        
        // สร้าง Object ที่ 2
        Book book2 = new Book("978-0596009205", "Head First Java", 
                             "Kathy Sierra", 950, 720);
        
        // สร้าง Object ที่ 3
        Book book3 = new Book("978-0135166307", "Clean Code", 
                             "Robert Martin", 1350, 464);
        
        // แต่ละ Object มีข้อมูลของตัวเอง
        System.out.println("Book 1:");
        book1.displayInfo();
        
        System.out.println("\nBook 2:");
        book2.displayInfo();
        
        System.out.println("\nBook 3:");
        book3.displayInfo();
    }
}
