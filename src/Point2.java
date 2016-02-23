import Parser.CommandParser;

/**
 * { your description of the project here }
 */

/**
 * The class containing the main method, the entry point of the application.
 *
 * @author {your name here}
 * @version {put something here}
 */
public class Point2
{

    /**
     * The entry point of the application.
     *
     * @param args
     *            The name of the command file passed in as a command line
     *            argument.
     */
    public static void main(String[] args)
    {
    	if (args.length != 1)
        {
            System.out
                    .println("Error: Incorrect number of arguments provided\n");
        }
        else
        {
            CommandParser parser = new CommandParser(args[0]);
            parser.parseFile();
        }
    }
}
