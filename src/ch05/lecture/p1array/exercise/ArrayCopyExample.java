package ch05.lecture.p1array.exercise;

public class ArrayCopyExample {
    public static void main(String[] args) {

        String[] oidStrArray = {"java", "array", "copy"};


        String[] newStrArray = new String[5];

        System.arraycopy(oidStrArray, 0, newStrArray, 0, oidStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
            
        }
    }
}
