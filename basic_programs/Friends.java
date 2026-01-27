import java.util.Scanner;
class Friends{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int ageAmar=input.nextInt();
int ageAkbar=input.nextInt();
int ageAnthony=input.nextInt();
double heightAmar=input.nextDouble();
double heightAkbar=input.nextDouble();
double heightAnthony=input.nextDouble();
if(ageAmar<=ageAkbar&&ageAmar<=ageAnthony)
System.out.println("Youngest is Amar");
else if(ageAkbar<=ageAmar&&ageAkbar<=ageAnthony)
System.out.println("Youngest is Akbar");
else
System.out.println("Youngest is Anthony");
if(heightAmar>=heightAkbar&&heightAmar>=heightAnthony)
System.out.println("Tallest is Amar");
else if(heightAkbar>=heightAmar&&heightAkbar>=heightAnthony)
System.out.println("Tallest is Akbar");
else
System.out.println("Tallest is Anthony");
input.close();
}
}
