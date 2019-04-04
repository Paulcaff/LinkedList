package hamlet;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HashMapStart {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\t00202160\\IdeaProjects\\LinkedList\\resouces\\hamlet.txt";
        Map<String,Integer> names = new HashMap();



        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String identifier = lineParser.next();
                    names.put(identifier,lineNumber);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

       Set<String> keySet = names.keySet();
        for (String key : keySet){

            Integer line = names.get(key);
            System.out.println(key + " : " + line);

        }


    }

}

