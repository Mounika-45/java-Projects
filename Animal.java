package xyz;

 class animal {
	// Base class

	    public void eat() {
	        System.out.println("Animal is eating...");
	    }

	    public void sleep() {
	        System.out.println("Animal is sleeping...");
	    }

	    public void makeSound() {
	        System.out.println("Animal makes a sound...");
	    }
	}

	class Dog extends animal {
	    public void bark() {
	        System.out.println("Dog is barking...");
	    }

	    public void fetch() {
	        System.out.println("Dog is fetching the ball...");
	    }
	}

	class Cat extends animal {
	    public void meow() {
	        System.out.println("Cat is meowing...");
	    }

	    public void scratch() {
	        System.out.println("Cat is scratching the furniture...");
	    }
	}

	public class Animal {
	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        System.out.println("Dog's behavior:");
	        dog.eat();
	        dog.sleep();
	        dog.makeSound();
	        dog.bark();
	        dog.fetch();

	        System.out.println("\nCat's behavior:");
	        Cat cat = new Cat();
	        cat.eat();
	        cat.sleep();
	        cat.makeSound();
	        cat.meow();
	        cat.scratch();
	    }
	}


		
		// TODO Auto-generated method stub

	
