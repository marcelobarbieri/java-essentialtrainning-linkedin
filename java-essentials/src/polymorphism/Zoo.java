package polymorphism;

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch(); // fetch is fun!
        rocky.makeSound(); // woof
        feed(rocky); // here´s your dog food

        Animal sasha = new Dog();
        sasha.makeSound(); // woof

        sasha = new Cat();
        sasha.makeSound(); // meow
        ((Cat)sasha).scratch(); // I am a cat. I scratch things.
        feed(sasha); // here´s your cat food
    }

    public static void feed (Animal animal) {
        if (animal instanceof Dog)
            System.out.println("here´s your dog food");
        else if (animal instanceof Cat)
            System.out.println("here´s your cat food");
    }

}
