package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        //первое задание

        try (FileInputStream fileIn = new FileInputStream("D:\\file.txt");
             FileOutputStream fileOut = new FileOutputStream("D:\\copied_file.txt");
        ) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


////////////////////////////////////////////////////////////
        // Второе задание
         try ( OutputStream output = new FileOutputStream("D:\\src\\io\\a.txt");
              InputStream input = new FileInputStream("D:\\src\\io\\a.txt");
        ) {
            char[] symbols = {'a', 'b', 'c'};

            for ( char sym :symbols){
                output.write(sym);
            }

            int size = input.available();
            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }

        } catch (IOException e) {
            System.out.print("Exception");
        }

////////////////////////////////////////////////////////////////////////////////////////
        //третье задание
        try (InputStream source = new FileInputStream("D:\\file1.txt");
             OutputStream destination = new FileOutputStream("D:\\file2.txt");
             BufferedInputStream buf = new BufferedInputStream(source, 100);
        ) {
            int i;

            while ((i = buf.read()) != -1) {

                destination.write((char) i);
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}


