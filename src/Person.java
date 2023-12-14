public class Person {

    private String lastName;
    private String firstName;
    private int age;
    private int hp;
    private int direction;
    private int x;
    private int y;
    private int z;

    private int numPlayers = 0;

    //Constructor
    public Person(String firstName){
        this.firstName = "P";
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.direction = 1;
        this.hp = 20;
        numPlayers++;
    }

    public Person(String firstName, String lastName, int x, int y, int z){
        this.lastName = lastName;
        this.firstName = firstName;
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = 1;
        this.hp = 20;
        numPlayers++;
    }
    public Person (String firstName, String lastName, int age, int hp, int direction, int x, int y, int z){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.hp = hp;
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.z = z;
        numPlayers++;
    }

    public String toString() {
        return String.format("First name: %s Last Name: %s Age: %d Health : %d", this.firstName, this.lastName, this.age, this.hp, this.direction, this.x, this.y, this.z);
    }

    //Accessors
    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public int getAge(){
        return age;
    }

    public int getHp(){ return hp;}

    public int getDirection(){ return direction;}

    //Mutators
    public void setFirstname(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public
}