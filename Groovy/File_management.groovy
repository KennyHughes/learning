class File_management {
    static void main(String[] args) {
        Person johnDoe = new Person()

        File file = new File("john-doe.txt")

        println file.getText('UTF-8')

        file.eachLine { line, no -> 
            if (no == 1) {
                johnDoe.setFirstName(line)
            } else if (no == 2) {
                johnDoe.setLastName(line)
            } else if (no == 3) {
                johnDoe.setAge(line.toInteger())
            } else {
                throw new RuntimeException("A person text file should only have 3 lines")
            }
            
        }

    println johnDoe

    }
}