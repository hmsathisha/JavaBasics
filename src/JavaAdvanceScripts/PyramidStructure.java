/*
  #### First Method of Debugging
 There are multiple steps required to debug a java program in eclipse such as:
Setting breakpoints
Starting the debugger
controlling the program execution. For line by line use F6 and F5 to step into a method
Evaluating variables etc

########## second method

Set the breakpoints in all the method which you want to debug
F3 can be used to navigate into the method
Then start the debugging
Press F5

 */

package JavaAdvanceScripts;

public class PyramidStructure {

	public static void main(String[] args) {
		
		for (int i=0; i<=5; i++) {
			for (int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print(" * ");
			} 
			System.out.println();
		}

	}

}
