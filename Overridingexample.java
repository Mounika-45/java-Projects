package xyz;
class Animal{
	void sound() {
		System.out.println("Animals make sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Cat Meows");
	}
}


public class Overridingexample {

	public static void main(String[] args) {
		Animal a1=new Animal();
		Animal a2=new Dog();
		Animal a3=new Cat();
		// TODO Auto-gener;;
			

	}

}
