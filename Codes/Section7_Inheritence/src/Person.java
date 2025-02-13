public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(){
        this(null,null,0);
        System.out.println("Person Constructor empty ");
    }
    public Person(String firstName, String lastName, int age){
        System.out.println("Person Constructor 2");
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        }
        else
            this.age = age;
    }
    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
    public String getFullName(){
        if (firstName.isEmpty()){
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        }
        return firstName + " " + lastName;
    }
}
