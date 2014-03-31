package exampleprogs;

import java.util.Collection;
import java.util.LinkedList;

import AST.*;

public class Main {

	private static List<CompilationUnit> compUnits = null;

	public static void main(String[] args) {
		String recipe = getFilename(args);
		String outdir = "out";

		mainOneLoop(recipe);

		final long start = new java.util.Date().getTime();

		for (int i = 0; i < 5; i++) {
			mainOneLoop(recipe);
		}

		final long end = new java.util.Date().getTime();
		System.out.println("\nExecution Time: " + (end - start) / 5 + "ms");
		
		Compiler.prettyPrint(compUnits, outdir);
	}

	private static void mainOneLoop(String recipe) {
		String indir = "in";
		
		compUnits = Compiler.compile(indir);

		CompositionProgram cp = CompositionLangCompiler
				.compile(recipe);
		//assert (cp != null);

		Root root = new Root(compUnits, cp);

		try {
			root.doCompositions();
		} catch (CompositionException e) {
			System.out.println(e.getMessage());
		}
		
		//java.util.List<Declaration> match = new java.util.LinkedList<Declaration>();
		//match.addAll(root.lookup("subject.**.classhk"));
		//for(Declaration d : match)
		//	System.out.println(d.qname());

	}

	public static String getFilename(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: composition recipe file");
			System.exit(1);
		}
		return args[0];
	}

}
