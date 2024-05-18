package FinalAssignmet;

public class Assignment9 
{
//	Find the default values of all the datatypes if declared as global variable
	
	static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;
    static String defaultString;

	public static void main(String[] args) 
	{
		System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: '" + defaultChar + "'");
        System.out.println("boolean: " + defaultBoolean);
        System.out.println("String: " + defaultString);
	}

}
