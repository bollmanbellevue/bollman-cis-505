/*
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentIO {
    private static final String FILE_NAME = "grades.csv";
    private static File file = new File(FILE_NAME);

    /** 
     * Add transactions (fields are space delimited) to a file. Creates a file if it does not exist.
     * @param transactions - List of transactions to add.
     * @throws IOException - May throw an exception if there is an issue with file Read/Write.
     */
    public static void insert(Student student) throws IOException {
        /* 
            - write the entered values to a csv file named grades.csv.
            - Values for "firstName, lastName, course, and grade."
        */
        PrintWriter writer = getFilePrintWriter();

        // Write each transaction to a line with space delimited fields.
        String csvRecord = String.format("%s,%s,%s,%s", student.getFirstName(),
                student.getLastName(), student.getCourse(), student.getGrade());
        writer.println(csvRecord);

        // Close the PrintWriter.
        writer.close();
    }

    /**
     * Instantiates a PrintWriter for the student csv file. Creates a file with header if the file does not exist.
     * @return PrintWriter - A PrintWriter that writes to the student csv file.
     * @throws IOException
     */
    private static PrintWriter getFilePrintWriter() throws IOException {
        /* 
            - write the entered values to a csv file named grades.csv. 
            - The grades.csv file should have a header row
        */
        PrintWriter output = null;

        // Create a file if it does not exist.
        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
            output.println("firstName,lastName,course,grade");
        }

        return output;
    }

    /** 
     * Read the file contents, 1 student per line. The file contains a header row. The fields are comma delimited.
     * @return ArrayList<Student> - The Student in the file.
     * @throws IOException - May throw an exception if there is an issue with file Read/Write.
     */
    public static ArrayList<Student> findAll() throws IOException {
        // Instantiate a scanner with a File as the source. 
        Scanner input = new Scanner(file);

        // Create an empty ArrayList to add transactions to.
        ArrayList<Student> students = new ArrayList<>();

        // Read the file until there aren't any more records.
        boolean isHeader = true;
        while (input.hasNext()) {
            if (isHeader) {
                continue;
            }

            String line = input.nextLine();
            // The transaction information is space delimited.
            String[] record = line.split(",");

            /*
                The fields are as follows based on the insert format:
                [0] firstName
                [1] lastName
                [2] course
                [3] grade
             */

            // Instantiate new transaction with file information and add to transaction list.
            Student student = new Student(record[0], record[1], record[2], record[3]);
            students.add(student);
        }

        // Close the scanner.
        input.close();

        // Return the parsed contents.
        return students;
    }
}
