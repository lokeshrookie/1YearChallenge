package M1.B;
import  java.util.*;


public class Main {


}

enum  Gender{
    MALE,
    FEMALE,
    UNKNOWN
}

class User{
    private String  firstName;
    private String  lastName;
    private int age;
    private Gender gender;

    public User(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String join(List<User> list){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).age > 23){
                if(i == list.size()-1){
                    str.append(list.get(i).firstName);
                }
                else{
                    str.append(list.get(i).firstName + "and");
                }
            }
        }

        return "In USA" + str.toString() + "can by alcohol.";
    }


    public User longestLastName(List<User> list){
        User longest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).lastName.length() > longest.lastName.length()){
                longest = list.get(i);
            }
        }
        return longest;

    }
    public  String  capitalLastName(List<User> list){
        StringBuilder lastNames = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            lastNames.append((list.get(i).lastName.toUpperCase()));
            lastNames.append(", ");
        }
        return lastNames.toString();

    }

}
