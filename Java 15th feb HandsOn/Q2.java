Q2) Create a file and give the name “data.txt” and then read the
file from the application and then override the same file with
new data.

Ans.
package com.org.gen.15thfebHandsOn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {
public static void main(String args[]) throws IOException {
//Instantiating the File class
String filePath = "D://data.txt";
//Instantiating the Scanner class to read the file
Scanner sc = new Scanner(new File(filePath));
//instantiating the StringBuffer class
StringBuffer buffer = new StringBuffer();
//Reading lines of the file and appending them to StringBuffer
while (sc.hasNextLine()) {
buffer.append(sc.nextLine()+System.lineSeparator());
}
String fileContents = buffer.toString();
System.out.println("Contents of the file: "+fileContents);
//closing the Scanner object
 sc.close();
String oldLine = "No preconditions and no impediments. Simply Easy Learning!";
String newLine = "Enjoy the free content";
//Replacing the old line with new line
fileContents = fileContents.replaceAll(oldLine, newLine);
//instantiating the FileWriter class
FileWriter writer = new FileWriter(filePath);
System.out.println("");
System.out.println("new data: "+fileContents);
 writer.append(fileContents);
 writer.flush();
}
}