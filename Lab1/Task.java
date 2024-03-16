class Task
{
public static void main (String args[])
{

System.out.println("Hello Java,My Name Is Gehad!!");
int x, y;
x = 10; y = 20;
if(x < y) System.out.println("x < y");
x = x * 2;
 if(x == y) System.out.println("x = y");
 x = x * 2;
if(x > y) System.out.println("x > y");

if(x == y) System.out.println("you won't see this");

System.out.println("Please Print numbers from 0 to 9");
int number = Integer.parseInt(args[0]);
int i;
for(i=0;i<number;i++)
{
System.out.println("number "+ i);
}

}
}