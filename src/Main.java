import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello" + "world";
        StringBuilder helloWordBuilder = new StringBuilder( "Hello" + "World");

        helloWorld.concat("This was added");
        helloWordBuilder.append("THIS IS ADDED");

        printInformation(helloWorld);
        printInformation(helloWordBuilder);

//    MORE ON STRINGBUILDER
        StringBuilder builderPlus = new StringBuilder("WOW This is an Object" + "Cant believe it");
        builderPlus.append("I added this");

        System.out.println(builderPlus);

//replace spacing with a /
        builderPlus.deleteCharAt(3).insert(3, '/');
        System.out.println(builderPlus);

//        replace characters
        builderPlus.replace(2, 7, "lol");
        System.out.println(builderPlus);

//        reverse them bois
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);


    }
//    A couple overloaded methods
    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }
    public static void printInformation(StringBuilder builder){
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
    }




}
