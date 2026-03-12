package smallproject;

public class library {
    static Book[] books=new Book[10]; // <=هحط هنا و ليكن عشر كتب مكتبة صغيرة بقا
    int bookCount=0;   // عدد الكتب اللي اتحطط بالفعل هنزودها تحت في الميثود


    public  void addBook(Book b){              // b هنا اي برميتر عادي عادي
        books[bookCount] = b; // حط يا برنس الكتاب هنا في أول مكان فاضي
        bookCount++;   // زوووووووووود كتاب واحد لكل إضافة كتاب
        System.out.println(b.title + " added!");
    }


    void showAvailableBook(){
        System.out.println("Available Books: ");
        for (int i=0; i<bookCount;i++){
            if(books[i].isAvailable){     //دي اللي كنا عملينها في كلاس البوك
                System.out.println(books[i].title);   // هيعرض أأأأسم الكتاب
            }
        }
    }

    public void borrowBook(String title, Student s) {      //
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equals(title)) {         // لقى الكتاب؟
                books[i].borrow();
                System.out.println(s.name + " borrowed " + title);
                return; // خلص اخرج من الـ method
            }
        }
        System.out.println("Book not found!"); // ملقاش الكتاب
    }
}



