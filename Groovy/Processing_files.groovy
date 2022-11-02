class Processing_files {
    static void main(String[] args){
        List<Integer> allNumbers = readAllNumbers()
        println allNumbers

        Integer maxNumber = allNumbers.max()
        assert maxNumber == 2044

        Integer sum = allNumbers.sum()
        println sum
    }

    private static List<Integer> readAllNumbers() {
        File resourcesDir = new File("resources")
        List<Integer> allNumbers = []

        resourcesDir.eachFile { file ->
            file.eachLine { line ->
                if (line.isNumber()){
                    allNumbers << line.toInteger()
                }
            }
        }
    return allNumbers
    }

}