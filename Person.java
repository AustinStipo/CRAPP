/**
 * @author Sarah Carlucci
 */
import java.util.UUID;

public class Person {
    private UUID id;
    private String firstName;
    private String lastName;
    private int age;
    private int height; //in inches
    private int weight;
    private String skinColor;
    private String hairColor;
    private String eyeColor;
    private String address;
    private String image;


    public Person(UUID id, String firstName, String lastName, int age, int height, int weight, String skinColor, String hairColor, String eyeColor, String address) {
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setSkinColor(skinColor);
        sethairColor(hairColor);
        setEyeColor(eyeColor);
        setAddress(address);
        setImage(image);
    }
    
    public UUID getUuid() {
        return id;
    }

    public String getName() {
        return "First Name: " + firstName + "\nLastName: " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getSkinColor() {
        return this.skinColor;
    }

    public void sethairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }
}
