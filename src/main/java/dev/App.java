package src.main.java.dev;
import com.github.lalyos.jfiglet.FigletFont;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
//        Figlet:
        String asciiArt = FigletFont.convertOneLine("App");
        System.out.println(asciiArt);
    }
}
