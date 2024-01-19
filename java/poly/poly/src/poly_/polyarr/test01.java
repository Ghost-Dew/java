package poly_.polyarr;
public class test01 {
    public static void main(String[] args) {
        Person[] persons=new Person[5];
        persons[0]=new Person("jack",20);
        persons[1]=new Student("jack",18,90);
        persons[2]=new Student("smith",18,80);
        persons[3]=new Teacher("jerry",28,6000);
        persons[4]=new Teacher("tom",38,9000);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student){
                //向下转型
                //Student student=(Student) persons[i];
                //student.study();
                ((Student)persons[i]).study();
            }else if (persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teach();
            }else if (persons[i] instanceof Person){
            }else System.out.println("false");
        }

    }
}
