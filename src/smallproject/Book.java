    package smallproject;

    public class Book {
        protected String title;
        protected String author ;
        static int totalBooks;
        boolean isAvailable = true;

        public Book(String title,String author){
            this.author=author;
            this.title=title;
            this.isAvailable = true;
            totalBooks++;

        }

        void borrow(){
            if(isAvailable){
                isAvailable= false;
                System.out.println("Borrowed");
            }else
                System.out.println("Book is already in the library");

        }
        void returnBook(){
            if(isAvailable == false){
                isAvailable= true;
                System.out.println("Returned to the library");
            }else
                System.out.println("Book is already in the library");

        }

    }
