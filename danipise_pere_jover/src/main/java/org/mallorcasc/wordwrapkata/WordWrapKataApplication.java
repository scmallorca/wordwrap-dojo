package org.mallorcasc.wordwrapkata;

public class WordWrapKataApplication {

    public static void main(String[] args) {

    	if(args.length!=2) {
    		System.err.println("Two params required, column and text.");
    		System.exit(-1);
		}
		int col = 0;
		try {
			col = Integer.valueOf(args[0]);
		} catch (NumberFormatException e) {
			System.err.println("The first param must be an integer.");
			System.exit(-1);
		}

		System.out.print(Wrapper.wrap(args[1], col));
	}
}
