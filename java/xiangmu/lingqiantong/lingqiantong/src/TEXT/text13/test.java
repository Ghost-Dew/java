package TEXT.text13;

public class test {
    public static void main(String[] args) {
        Student student = new Student("jack", "man", 19, "12010101");
//        student.printInfo();
        Teacher teacher = new Teacher("tom", "woman", 25, 5);
//        teacher.printInfo();
        Student student1 = new Student("smith", "woman", 20, "12010102");
        Teacher teacher1 = new Teacher("jerry", "man", 30, 10);
        Person[] arr=new Person[4];
        arr[0]=student;
        arr[1]=student1;
        arr[2]=teacher;
        arr[3]=teacher1;
        test test = new test();
//        test.bulluarray(arr);
        test.test(arr[0]);
    }

    public void bulluarray(Person[] arr){   //定义多态数组，按年龄从高到低排序
        Person temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j].getAge()<arr[j+1].getAge()){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void test(Person p){
        if (p instanceof Student){
            ((Student) p).study();
        }else if (p instanceof Teacher){
            ((Teacher) p).teach();
        }else System.out.println("nothing--");
    }
}
