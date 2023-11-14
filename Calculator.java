public class Calculator{

public static  void main(String[] args){

int firstNum=Integer.parseInt(args[0]);
int secondNum=Integer.parseInt(args[1]);
int thirdNum=Integer.parseInt(args[2]);
int average=firstNum+secondNum+thirdNum;
System.out.println("Average of three Number : "+average);
}
}

 class Swap{

public static  void main(String[] args){

int firstNum=Integer.parseInt(args[0]);
int secondNum=Integer.parseInt(args[1]);

System.out.println("Now First Number is : "+firstNum);
System.out.println("Now Second Number is : "+secondNum);

firstNum=firstNum+secondNum;
secondNum=firstNum-secondNum;
firstNum=firstNum-secondNum;



System.out.println("Now First Number is : "+firstNum);
System.out.println("Now Second Number is : "+secondNum);

}
}


class CircleArea{

public static  void main(String[] args){


int radius=Integer.parseInt(args[0]);
System.out.println("Provided circle area is : "+radius);

double circleArea=3.14*radius*radius;

double circlePerimeter=2*3.14*radius;

System.out.println("Circle Area is : "+circleArea);
System.out.println("Circle Perimeter is : "+circlePerimeter);


}
}


class GreatestNumber {

	public static void main(String[] args) {

		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		int thirdNum = Integer.parseInt(args[2]);

		if (firstNum > secondNum) {

			if (firstNum > thirdNum) {
				System.out.println("Greatest number is : " + firstNum);
			} else {
				System.out.println("Greatest number is : " + thirdNum);
			}
		} else {
			if (secondNum > thirdNum) {
				System.out.println("Greatest number is : " + secondNum);

			} else {
				System.out.println("Greatest number is : " + thirdNum);

			}
		}

	}

}


class Positivity{
public static void main(String[] args) {

int number=Integer.parseInt(args[0]);

if(number>0){
System.out.println("Number is positive");
}
else if(number==0){
System.out.println("Number is neutral");

}
else{
System.out.println("Number is negative");

}

}


}