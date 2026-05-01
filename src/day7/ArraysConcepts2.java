package day7;

public class ArraysConcepts2 {
    public static void main(String[] args) {

        int[] marks = new int[5];
        marks[2]=10;
        marks[0]=15;
        marks[4]=15;
        //marks[5]=155; AIOB

        for(int m :marks)
        {
            System.out.println(m);
        }


        Object[] personalInfo = {"Jason", 32, 'M', 82.45, false};

        String[] tabs = new String[100];
        tabs[0]= "HOME";
        tabs[1]= "GIFT CERTIFICATES";
        tabs[2]= "BRANDS";
        tabs[3]= "BLOGS";
        tabs[4]= "CONTACT US";
    }
}


//Jason, 32, M, 82.45, false

