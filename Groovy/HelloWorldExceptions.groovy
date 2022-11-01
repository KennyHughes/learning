class HelloWorldExceptions {
    static void main(String[] args) {
        Person johndoe = new Person()
        johndoe.setFirstName("John")
        johndoe.setLastName("Doe")
        johndoe.setAge(40)

        try{
        johndoe.getFirstName().toLong()
        } catch (NumberFormatException e) {
            assert e instanceof NumberFormatException
            println "Cannot convert a String into a Long"
        }
    }
}