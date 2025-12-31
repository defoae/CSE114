package Lab20;

import java.io.*;
import java.util.Scanner;

public class ReformatCode {
    public static void main(String[] args){
        File file = new File("/Users/dimashmadiyar/IdeaProjects/firstPrograsm/src/Lab20/" + args[0]);
        StringBuilder content = new StringBuilder();
        try {
            Scanner input = new Scanner(file);
            do{
                String line = input.nextLine();
                content.append(line);
                content.append("\n");
            }
            while(input.hasNextLine());
            for (int i = 0; i < content.length(); i++){
                if(String.valueOf(content.charAt(i)).equals("{")){
                    content.deleteCharAt(i);
                    content.insert(i-1, " {");
                }
            }
            String s = content.toString();
            String result = s.replaceAll("\\n\\s*(\\{)", " {");
            System.out.println(result);
        } catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
    }
}
