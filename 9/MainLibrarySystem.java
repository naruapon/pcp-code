public class MainLibrarySystem {
    public static void main(String[] args) {
        // สร้างวัตถุหนังสือหลายเล่ม
        LibBook book1 = new LibBook("B001", "Java Programming Fundamentals", 
                              "John Smith", "Tech Publishers", 2023);
        LibBook book2 = new LibBook("B002", "Data Structures and Algorithms", 
                              "Jane Doe", "Academic Press", 2022);
        LibBook book3 = new LibBook("B003", "Database Management Systems", 
                              "Robert Johnson", "Tech Publishers", 2024);
        
        System.out.println("=== ข้อมูลหนังสือในห้องสมุด ===\n");
        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
        System.out.println();
        book3.displayInfo();
        
        System.out.println("\n=== การยืม-คืนหนังสือ ===\n");
        book1.borrowBook("นายสมชาย ใจดี");
        book2.borrowBook("นางสาวสมหญิง รักเรียน");
        book1.borrowBook("นายประยุทธ์ มานะดี"); // พยายามยืมหนังสือที่ถูกยืมแล้ว
        
        System.out.println("\n=== สถานะหนังสือหลังการยืม ===\n");
        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
        
        System.out.println("\n=== การคืนหนังสือ ===\n");
        book1.returnBook();
        
        System.out.println("\n=== สถานะหนังสือหลังการคืน ===\n");
        book1.displayInfo();
    }
}
