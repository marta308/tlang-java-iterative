package exampleprogs;

import java.util.Collection;
import java.util.LinkedList;


import AST.*;

public class Main {

	private static List<ClassDeclaration> classes = null;
	private static CompilationUnit compUnit = null;

	public static void main(String[] args) {
		String recipe = getFilename(args);
		String indir = args[1];
		String outdir = args[2];
		
		classes = Compiler.compile(indir);

		CompositionProgram cp = CompositionLangCompiler
				.compile(recipe);

		compUnit = new CompilationUnit(classes, cp);

		mainOneLoop();

		final long start = new java.util.Date().getTime();

		for (int i = 0; i < 10; i++) {
			mainOneLoop();
		}

		final long end = new java.util.Date().getTime();
		System.out.println("\nExecution Time: " + (end - start) / 10 + "ms");
		
		Compiler.prettyPrint(compUnit, outdir);
	}

	private static void mainOneLoop() {
			
		try {
			PerformCompositions.performCompositions(compUnit);
		} catch (CompositionException e) {
			System.out.println(e.getMessage());
		}
		
		//Declaration match = null;
		//final long start = System.nanoTime();
		//match = root.lookup("subject.inner1.method2.-1");
		//final long end = System.nanoTime();
		//for(Declaration d : match)
		//System.out.println(match.qname());
		//System.out.println("\nExecution Time: " + (end - start) + "ns");

		//String[] res = Declaration.split("*.*.pp");
		//System.out.println(res[0]);
		//System.out.println(res[1]);
		//if(res[2]!= null)
		//	System.out.println(res[2]);

	}

	public static String getFilename(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: composition recipe file, infolder, outfolder");
			System.exit(1);
		}
		return args[0];
	}

}
