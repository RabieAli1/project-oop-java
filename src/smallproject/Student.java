    package smallproject;

    public class Student extends Person{

        public int student_id;
        public Student(String name,int age,int student_id ){
            super(name,age);
            this.student_id=student_id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "student_id=" + student_id +
                    ", age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
