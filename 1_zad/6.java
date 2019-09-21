public class Main {
    public static void main(String[] args) {
        String line = "Блин я устал";
        System.out.println(censored(line));
	}
 
    public static String censored(String line) {
        String new_line = line.replace("Блин", "");
        String new_line = new_line.replace("блин", "");
        return new_line;
    }
}
