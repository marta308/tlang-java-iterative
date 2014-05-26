package exampleprogs;

import java.util.Collection;
import java.util.LinkedList;


import AST.*;

public class Main {

	public static void main(String[] args) {
		checkArgNum(args);
		String recipe = args[0];
		String indir = args[1];
		String outdir = args[2];
		
		CompilationUnit compUnit = null;
		List<ClassDeclaration> classes = null;
		long sum = 0;
		long start, end;
		
		for (int i = 0; i < 10; i++) {
			classes = Compiler.compile(indir);
			CompositionProgram cp = CompositionLangCompiler
					.compile(recipe);
			compUnit = new CompilationUnit(classes, cp);
		

			start = new java.util.Date().getTime();
			try {
				PerformCompositions.performCompositions(compUnit);
			} catch (CompositionException e) {
				System.out.println(e.getMessage());
			}
			end = new java.util.Date().getTime();
			sum += (end - start);
		}
		
		Compiler.prettyPrint(compUnit, outdir);
		System.out.println("Execution Time: " + sum / 10  + "ms");
	}


	public static void checkArgNum(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: composition recipe file, infolder, outfolder");
			System.exit(1);
		}
	}

}
