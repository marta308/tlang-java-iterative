package exampleprogs;

import AST.CompilationUnit;
import AST.CompositionException;

public class PerformCompositions {

	public static void performCompositions(CompilationUnit compUnit) throws CompositionException{
		compUnit.doCompositions();
	}
}
