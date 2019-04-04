package hamlet;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Hamlet {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\t00202160\\IdeaProjects\\LinkedList\\resouces\\hamlet.txt";
        Set<String> names = new TreeSet<>();
        int counter = 0;


        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String identifier = lineParser.next();
                    names.add(identifier);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            counter ++;
            System.out.println(iterator.next());
        }

        System.out.println(names.size()+"  "+counter);



    }

    }

