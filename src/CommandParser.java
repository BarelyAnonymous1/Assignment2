
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * CommandParser class used to scan through a file with a Scanner and retrieve
 * specific values to create a SkipList of Rectangles
 * 
 * @author Jonathan DeFreeuw (jondef95), Preston Lattimer (platt)
 * @version 2
 */
public class CommandParser
{
    /**
     * String field to hold the file that has been input
     */
    private String   inputFile;

    /**
     * SkipList used to hold the KeyValue Pairs for Rectangles
     */
    private Database base;

    /**
     * constructor for parser, stores filename
     * 
     * @param file
     *            name for the file that is being parsed
     */
    public CommandParser(String file)
    {
        inputFile = file;
        base = new Database();
    }

    /**
     * function used to scan through the file input into the main program
     * 
     * @return boolean did the parsing succeed?
     */
    public boolean parseFile()
    {
        Scanner scanner = null;
        Exception d = null;
        try
        {
            scanner = new Scanner(new File(inputFile));
        }
        catch (FileNotFoundException e)
        {
            d = e;
            e.printStackTrace();
            System.out.println(e.getMessage());
        } // Create new scanner
        if (d == null)
        {
            while (scanner.hasNext())
            { // While the scanner has information to read
                String cmd = scanner.next(); // Read the next command
                switch (cmd) {
                    case ("insert"):
                    {
                        parseInsert(scanner);
                        break;
                    }
                    case ("remove"):
                    {
                        parseRemove(scanner);
                        break;
                    }
                    case ("regionsearch"):
                    {
                        parseRegionSearch(scanner);
                        break;
                    }
                    case ("duplicates"):
                    {
                        parseDuplicates();
                        break;
                    }
                    case ("search"):
                    {
                        parseSearch(scanner);
                        break;
                    }
                    case ("dump"):
                    {
                        base.dump();
                        break;
                    }
                    default:
                    {
                        break;
                    }
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * private method that allows the parser to scan a line and insert the new
     * rectangle into a SkipList
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already initialized
     * @postcondition if coordinates are correct, a node is added to the list
     */
    private void parseInsert(Scanner scanner)
    {
        String name = scanner.next();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        char c = name.charAt(0);
        if (checkDim(x, y) && Character.isAlphabetic(c))
        {
            Point point = new Point(name, x, y);
            KVPair<String, Point> pair = new KVPair<String, Point>(name,
                    point);
            base.insert(pair);
            System.out.println("Point inserted: (" + name + ", " + x + ", "
                    + y + ")");
        }
        else
            System.out.println("Point rejected: (" + name + ", " + x + ", "
                    + y + ")");
    }

    /**
     * private method that allows the parser to scan a line and remove a
     * rectangle based on either name or coordinates
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already initialized
     * @postcondition if the rectangle exists, it is removed from the list
     */
    private void parseRemove(Scanner scanner)
    {
        String name = scanner.next();
        if (!isNumeric(name))
        {
            Point found = base.removeKey(name);
            if (found == null)
                System.out.println("Point not removed: " + name);
            else
                System.out.println("Point removed: " + found.toString());
        }
        else
        {
            int x = Integer.parseInt(name);
            int y = scanner.nextInt();
            if (checkDim(x, y))
            {
                Point searchPoint = new Point(null, x, y);
                Point found = base.removeValue(searchPoint);
                if (found == null)
                    System.out.println(
                            "Point not found: (" + x + ", " + y + ")");
                else
                    System.out
                            .println("Point removed: " + found.toString());
            }
            else
                System.out
                        .println("Point rejected: (" + x + ", " + y + ")");
        }
    }

    /**
     * private method that allows the parser to scan a line and search the
     * SkipList for Rectangles within a certain region
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already initialized
     * @postcondition if the height and width are appropriate, a list of
     *                rectangles are output to the console
     */
    private void parseRegionSearch(Scanner scanner)
    {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        if (!(height < 1 | width < 1))
        {
            System.out.println("Points intersecting region (" + x + ", "
                    + y + ", " + width + ", " + height + "):");
            Rectangle regionRect = new Rectangle("regionRect", x, y, width,
                    height);
            // base.regionSearch(regionRect);
            System.out.println("1 quadtree nodes visited");
        }
        else
        {
            System.out.println("Rectangle rejected: (" + x + ", " + y
                    + ", " + width + ", " + height + ")");
        }
        // look in the SkipList for all Rectangles in the region
    }

    /**
     * private method that allows the parser to scan a line and search a list
     * for the specific rectangle; if it exists, output it to the console
     * 
     * @param scanner
     *            the scanner that is used to search the file
     * @precondition the scanner input is already initialized
     * @postcondition if coordinates are correct, a node is added to the list
     */
    private void parseSearch(Scanner scanner)
    {
        String name = scanner.next();
        SkipNode<String, Point> searchResult = base.search(name);
        if (null == base.search(name))
        {
            System.out.println("Point not found: " + name);
        }
        else
        {
            System.out.println(
                    "Point found: " + searchResult.getValue().toString());
            while (searchResult.next[0] != null && searchResult.next[0]
                    .getKey().compareTo(searchResult.getKey()) == 0)
            {
                searchResult = searchResult.next[0];
                System.out.println("Point found: "
                        + searchResult.getValue().toString());
            }
        }
    }

    /**
     * calls the intersections function of the SkipList to output all
     * intersections of rectangles
     * 
     * @precondition the correct command has been asserted
     * @postcondition terminal will have outputs containing intersections of
     *                rectangles, if any
     */
    private void parseDuplicates()
    {
        System.out.println("Duplicate points:");
        base.duplicates();
    }

    /**
     * checks for numeric nature of the string
     * 
     * @param str
     *            string taken to be checked
     * @return a boolean false or true.
     */
    private static boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * helper method to do math regarding the dimensions of the point
     * 
     * @param x
     *            coordinate
     * @param y
     *            coordinate
     * @return a boolean true or false
     */
    public boolean checkDim(int x, int y)
    {
        return (x >= 0 && y >= 0 && x < 1024 && y < 1024);
    }

}