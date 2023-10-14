package sevensem.advancejava.thread.classassignment;

import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        String inputFile="D:\\learnjavawithraj\\sevensem\\advancejava\\thread\\classassignment\\input.txt";
        String outputFile="D:\\learnjavawithraj\\sevensem\\advancejava\\thread\\classassignment\\output.txt";

        FileReader fileReader = new FileReader(inputFile);

        // Create a BufferedReader to read from the FileReader
        BufferedReader reader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter(outputFile);

        BufferedWriter writer = new BufferedWriter(fileWriter);
        String line;
        while ((line=reader.readLine())!=null){
            String uppercaseLine = line.toUpperCase();
            // Write the uppercase line to the output file
            writer.write(uppercaseLine);
            writer.newLine();

        }
        reader.close();
        writer.close();
        System.out.println("Content to converted to uppercase and written to"+outputFile);

    }
}
