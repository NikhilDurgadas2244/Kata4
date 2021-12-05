
package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;


public class Kata4 {
    static List<Mail> mailList;
    static Histogram<String> histogram;
    public static void main(String[] args){
        execute();
    }
    
    public static void execute(){
        input();
        process();
        output();
    }
    
    public static void input(){
        String namefile = "email.txt";
        mailList = MailListReader.read(namefile);
    }
    
    public static void process(){
        histogram = MailHistogramBuilder.built(mailList);
    }
    
    public static void output(){
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "HistogramDisplay");
        histogramDisplay.execute();
    }
}
 