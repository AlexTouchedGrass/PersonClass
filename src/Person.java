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
        this("P","",16, 20, 1, 1, 1, 1);
    }

    public Person(String firstName, String lastName, int age, int direction, int x, int y, int z){
        this(firstName, lastName, 16, 20, direction, x, y, z);
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
        return String.format("First name: %s \nLast Name: %s \nAge: %d \nHealth : %d \nDirection: %d Coordinates: X %d Y %d Z %d", firstName, lastName, age, hp, direction, x, y, z);
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

    public void setHp(int hp){this.hp = hp;}

    public void setDirection(int direction){this.direction = direction;}

    public void setX(int x){this.x = x;}

    public void setY(int y){this.y = y;}

    public void setZ(int z){this.z = z;}
}