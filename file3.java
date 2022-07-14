import java. util. Scanner;
public class Login_page {
public static void main(String[] args) {
Scanner sc = new Scanner(System. in);
String sp=" ";
System. out. println("Enter the Username");
String uname = sc. nextLine();
if((uname. contains(sp)) || uname. length()<4){
