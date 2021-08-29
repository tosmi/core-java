package at.stderr.textfile;

/**
 * Hello world!
 *
 */
public class App
{
    record Employee(String name, int sallary, int year, int month, int day){}

    public static void main( String[] args )
    {
	var staff = new Employee[3];

	staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
	staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
	staff[1] = new Employee("Toni Tester", 40000, 1990, 3, 27);
    }
}
