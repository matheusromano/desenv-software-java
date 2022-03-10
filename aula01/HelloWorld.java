package aula01;
class HelloWorld {
    public static void main(String[] args) { 
        Greet("Matheus", "Romano");
        
    }

    public static void Greet(String firstName, String lastName) {
        System.out.printf("Hello:" + firstName + lastName);
    }
}