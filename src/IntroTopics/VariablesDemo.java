package IntroTopics;

public class VariablesDemo {
    public static void main(String[] args) {
        // Assigning value during declaration
        int speedLimit = 60;
        // Updating the value of the variable
        speedLimit += 1; // speedLimit += 1; is a shorthand for speedLimit = speedLimit + 1;
        System.out.println(speedLimit); // 60+1 = 61
        // Declaring an empty variable
        int speed;
        // System.out.println(speed); // Spits Compile time error in Java
        speed = 20;
        System.out.println(speed); // works fine
    }
}
