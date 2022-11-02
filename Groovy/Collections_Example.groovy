class Collections_Example {
    static void main(String[] args) {
        Person johndoe = new Person("John", "Doe", 40)
        Person marhill = new Person("Mary", "Hill", 30)
        Person thomasMarks = new Person("Thomas", "Marks", 21)
    }

    def allPersons = [johnDoe, maryHill, thomasMarks]

    assert allPersons instanceof List
    assert allPersons.size() == 3
    assert allPersons[2] == thomasMarks

    allPersons.each {
        println it
    }

    allPersons.eachWithIndex { Person entry, int i ->
        println i + ": " + entry
        }

    allPersons.find { it.lastname == 'Hill'} == maryHill

    allPersons.collect { it.age <= 30} == {false, true, true}

    allPersons.sort { it.age } == {thomasMarks, maryHill, johnDoe}

}