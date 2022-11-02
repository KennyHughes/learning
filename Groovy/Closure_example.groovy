class Closure_example {
    static void main(String[] args) {
        Person johnDoe = new Person()
        johnDoe.setFirstName("John")
        johnDoe.setLastName("Doe")
        johnDoe.setAge(40)

        Closure personToString = { Person person -> println person.toString() } 
        // personToString(johnDoe)

        handlePerson(personToString, johnDoe)

        Closure personFullName = {Person person ->
            println person.firstName + " " + person.lastName}

        handlePerson(personFullName, johnDoe)

    }

    static void handlePerson(Closure c, Person p) {
        if (p == null) {
            throw new RuntimeException("A person instance cannot be null")
        }
        c(p)
    }
    
}