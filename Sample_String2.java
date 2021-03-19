package OnClass.Session1;

//spell-checker: Disable

public class Sample_String2 { 
    public static void main (String [] args) { 
        // So sánh với chuỗi 
        String str_Sample = "Rockstar"; 
        System.out.println ("So sánh với 'ROCKSTAR':" + str_Sample.compareTo ("rockstar")); 
        // So sánh với - Bỏ qua trường hợp 
        System.out.println ("So sánh với 'ROCKSTAR' - Trường hợp bị bỏ qua:" + str_Sample.compareToIgnoreCase ("ROCKSTAR")); 
    } 
}
