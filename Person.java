/**
 * @author Sarah Carlucci
 */

public class Person {
    
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String image;


    public Person(String firstName, String lastName, int age, int height, int weight, String skinColor, String hairColor, String eyeColor, String address) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setAddress(address);
        setImage(image);

    }

    public String getName() {
        return "First Name: " + firstName + "\nLastName: " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = name;
    } 

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    } 

    public String getAddress() {
        return "Address: " + address;
    }

    public void setAddress(String address) {
        this.address = address; 
    }

    public String getImage() {
        return "Person looks like " + image;
    }

    public void setImage(String image) {
        this.image = image;
    } 
}
