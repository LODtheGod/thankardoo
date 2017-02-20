import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner input=  new Scanner(System.in);
	String channel_name;
	String channel_name_correct;
	System.out.println("Welcome to JOGORDOO: the text based game");
	System.out.println("Start with making a youtube channel");
	do{
	System.out.println("What is your channel name:");
	channel_name=input.nextLine();
	System.out.println("Your channels name is " + channel_name + ", right?");
	channel_name_correct = input.nextLine();
	} while (!channel_name_correct.equalsIgnoreCase ("yes"));

	}

}
