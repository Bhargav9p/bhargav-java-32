package day6;

public class PersonAge {
    public int printAge(int age) {
        if (age == 13) {
            System.out.println("Kid");

        } else if (age == 13 && age == 19) {
            System.out.println("Teen");

        } else {
            System.out.println("adult");
        }
        return age;
    }
        public static void main(String[] args){
            PersonAge a =new PersonAge();
            a.printAge(16);

        }
}
