public class LibBook {
    private String bookId;
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private boolean isAvailable;
    private String borrowerName;
    
    public LibBook(String bookId, String title, String author, 
                String publisher, int publicationYear) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
        this.borrowerName = "";
    }
    
    public void displayInfo() {
        System.out.println("รหัสหนังสือ: " + bookId);
        System.out.println("ชื่อหนังสือ: " + title);
        System.out.println("ผู้แต่ง: " + author);
        System.out.println("สำนักพิมพ์: " + publisher);
        System.out.println("ปีที่พิมพ์: " + publicationYear);
        System.out.println("สถานะ: " + (isAvailable ? "พร้อมให้ยืม" : "ถูกยืมแล้ว"));
        if (!isAvailable) {
            System.out.println("ผู้ยืม: " + borrowerName);
        }
    }
    
    public boolean borrowBook(String borrower) {
        if (isAvailable) {
            isAvailable = false;
            borrowerName = borrower;
            System.out.println("ยืมหนังสือ '" + title + "' สำเร็จ");
            return true;
        } else {
            System.out.println("หนังสือ '" + title + "' ถูกยืมแล้ว");
            return false;
        }
    }
    
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("คืนหนังสือ '" + title + "' สำเร็จ");
            borrowerName = "";
        } else {
            System.out.println("หนังสือ '" + title + "' อยู่ในห้องสมุดอยู่แล้ว");
        }
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
}
