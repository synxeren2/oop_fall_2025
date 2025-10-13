1. Aşağıdaki UML diyagramının Inheritence design pattern özelliğini de göz önüne alarak kodlayınız?
   <img src="/img/class1.jpg" width="60%"/>

2. Overload nedir? Override nedir?
3. SuperClass nedir? SubClass nedir?

4. Aşağıdaki kodları okuyup anlamaya çalışın, ardından soruları cevaplayınız?
   <pre>
class Animal {

  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}

// inherit from Animal
class Dog extends Animal {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog labrador = new Dog();

    // access field of superclass
    labrador.name = "Rohu";
    labrador.display();

    // call method of superclass
    // using object of subclass
    labrador.eat();

  }
}
</pre>


▓ SuperClass hangisidir?
░ Hangi sınıf miras almıştır?
▓ labrodor nesnesi sadece Dog sınıfındaki değişkenleri kullanabilir?
░ display() methodu nasıl override edilir?

5. Aşağıdaki konularda pre-reading yapınız?
   -Diziler ve Listeler
   -Abstract sınıf ve method
   -Interface
   -Polymorphism
