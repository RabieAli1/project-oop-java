    package smallproject;

    public class Librarian extends Person{
        public float salary;
        public Librarian(String name,int age ,float salary){
            super( name, age );
            this.salary=salary;
        }

        @Override
        public String toString() {
            return "Librarian{" +
                    "salary=" + salary +
                    ", age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
