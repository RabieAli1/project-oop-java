package smallproject;


public class Main {

    public static void main(String[] args) {
        // هنضيف هنا مكتبة اوبجيكت يعني
        library lib= new library();

        // هنضيف هنا كتب اوبجيكت برضو
        Book book1=new Book("Clean Code","Rabie Ali");
        Book book2=new Book("OOP Whit java","Rabie Ali"); // بحب أكتب أسمي عندك مانع ؟؟
        Book book3=new Book("C# ASP .net  ","Eng / Rabie Ali");   //  صل على النبي طيب

        // ضيف الكتب في المكتبة بقا يعم
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        //أعمل أوبجكت طالب
        Student s1=new Student("Rabie Ali ",19,1);

        //هنستخدم ميثود الاستلاف  يا رب تشتغل طلعت عيني
        lib.borrowBook("Clean Code",s1);


        // نعرض الكتب المتاحة بالمثود بقا أنا تعبت و الله
        lib.showAvailableBook();

        // تعالى نعمل اوبجيكت لأمين المكتبة الراجل تعب معانا
        Librarian obj=new Librarian("Rabie Ali",19,200000000);// كتر فلوس محدش واخد باله
        System.out.println(obj);

    }
}