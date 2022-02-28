package Assignment3;
//importing java
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Filewritter {
        public void Filewritter() {
            try {

                File Text = new File("C:\\Users\\mmohd\\Desktop.txt");
                FileOutputStream is = new FileOutputStream(Text);
                OutputStreamWriter osw = new OutputStreamWriter(is);
                Writer wr = new BufferedWriter(osw);
                wr.write("Hai V-soft!");
                wr.close();
            }
            //here catch block execute
            catch (IOException e) {
                System.err.println("Problem writing to the file statsTest.txt");
            }
        }
         //Main function here
        public static void main(String[] args) {
            Filewritter write = new Filewritter();
            write.Filewritter();
        }

    }

