package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Hashtable;

import parser.Parser;
import lexer.Lexer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		
		
		// TODO Auto-generated method stub

		File file = new File("/home/tiger/Desktop/test.txt");
		Reader reader = null;
		reader = new InputStreamReader(new FileInputStream(file));

		Lexer lex = new Lexer(reader);
		Parser parser = new Parser(lex);
		parser.program();
		System.out.print("\n");
	}

}
