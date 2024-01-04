public class Person {

    private String lastName;
    private String firstName;
    private int age;
    private int hp;
    private int direction;
    private int x;
    private int y;
    private int z;
    private int damage;

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
    }    // Will
    public String getFirstName(){
        return firstName;
    } // Simplify
    public int getX(){return x;} //NORTH and SOUTH
    public int getY(){return y;} // UP and DOWN
    public int getZ(){return z;} // EAST AND WEST
    public int getAge(){
        return age;
    } //Not a baby, not a skeleton
    public int getHp(){ return hp;} // Not dead, not a demigod (yet)
    public int getDirection(){ return direction;} // Only 6 directions
    public double getDistance(int x, int y, int z){
        return Math.sqrt(Math.pow(x - this.x,2) + Math.pow(y - this.y,2) + Math.pow(z - this.z,2));
    }
    public double getDistance(Person person){
        return this.getDistance(person.getX(),person.getY(),person.getZ());
    }

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
    public void move(int direction, int units){this.direction = direction;}
    public void teleport(Person person){
        person.getX(); // get other player's x
        this.getX(); // get THIS x
    }
    public void teleport(int x, int y, int z){this.x = x; this.y = y; this.z = z;}
    public void attack(Person person, int damage) {
        this.damage = damage;
    }


}