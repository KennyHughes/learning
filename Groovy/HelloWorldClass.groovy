class HelloWorldClass {

    static void main(String[] args) {
        Person person1 = new Person()
        person1.setFirstName("John")
        person1.setLastName("Doe")
        person1.setAge(40)

    println person1.getFullName()
    println person1.age

    if (person1.getAge() >= 45 && person1.getAge() <=65) {
        println person1.getFullName() + " is middle-aged"
    } else {
        println person1.getFullName() + " is " + person1.getAge() + " years old"
    }

    def persons = [person1, new Person(firstName: "Mary", lastName: "Hill", age: 40)]

    for (Person p : persons) {
        println p.getFullName()
        println p
    }

    }
}