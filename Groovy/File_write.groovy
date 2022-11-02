class File_write {
    static void main(String[] args) {
        File textFile = new File("mary-hill.txt")
        textFile.withWriter('UTF-8') { writer ->
            writer.writeLine("Mary")
            writer.writeLine("Hill")
            writer.writeLine("30")
        }

        textFile.append("1")
        textFile << "2"
            

            Person thomasMarks = new Person("Thomas", "Marks", 21)
            File binFile = new File( "thomas-marks.bin")
            binFile.withObjectOutputStream { out ->
                out.writeObject(thomasMarks)}
    }

}