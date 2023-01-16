package arrayofobjects;

public class ArrayOfObjects {

    public static void main(String[] args) {
        Student[] list = new Student[3];//declaration of array of object

        //storing the valus into the object
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setStdId(991674712);

        Student s2 = new Student();
        s2.setName("John");
        s2.setStdId(991674526);

        Student s3 = new Student();
        s3.setName("Stewie");
        s3.setStdId(991634242);

        //storing the values in the list created
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        //printing the array of list
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName() + " " + list[i].getStdId());

        }

    }

}
