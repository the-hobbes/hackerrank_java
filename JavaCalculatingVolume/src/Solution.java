/**
  * https://www.hackerrank.com/challenges/calculating-volume
  * usage:
  * $ cat input | java Solution
  */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;
import java.lang.NumberFormatException;


class Output{ // output class, 'cause thats what the client code (Solution) wants
  public void display(double volume){
    System.out.println(String.format("%.3f", volume)); // 3 digits
  }
}

class Volume{
  // main class overloaded 'cause thats what the client code (Solution) wants
  double volume;

  public double main(int a){ // cube
    volume = Math.pow(a, 3);
    return volume;
  }
  public double main(int l, int b, int h){ // cuboid
    volume = l * b * h;
    return volume;
  }
  public double main(double r){ // hemisphere
    volume = (2.0 / 3.0) * Math.PI * Math.pow(r, 3);
    return volume;
  }
  public double main(double r, double h){ // cylinder
    volume = Math.PI * Math.pow(r, 2) * h;
    return volume;
  }
}

class Calculate{
  Output output = new Output();
  Scanner sc = new Scanner(System.in);

  // create a volume object because thats what the client code (Solution) wants
  public static Volume get_Vol() {
      return new Volume();
  }

  public int getINTVal() throws IOException{ // naming is dumb, but thats what client code wants
    int intVal = sc.nextInt();
    if (intVal <= 0) {
      throw new NumberFormatException("All the values must be positive");
    }
    return intVal;
  }

  public double getDoubleVal(){
    double doubleVal = sc.nextDouble();
    if (doubleVal <= 0) {
      throw new NumberFormatException("All the values must be positive");
    }
    return doubleVal;
  }
}


public class Solution{

	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();
		try{
			Calculate cal=new Calculate();
			int T=cal.getINTVal();
			while(T-->0){
			double volume = 0.0d;
			int ch=cal.getINTVal();
			if(ch==1){

				int a=cal.getINTVal();
				volume=Calculate.get_Vol().main(a);


			}
			else if(ch==2){

				int l=cal.getINTVal();
				int b=cal.getINTVal();
				int h=cal.getINTVal();
				volume=Calculate.get_Vol().main(l,b,h);

			}
			else if(ch==3){

				double r=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r);

			}
			else if(ch==4){

				double r=cal.getDoubleVal();
				double h=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r,h);

			}
			cal.output.display(volume);
			}

		}
		catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}


	}
}

/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate
