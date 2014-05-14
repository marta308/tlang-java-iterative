package exampleprogs;

import AST.CompilationUnit;
import AST.CompositionException;
import AST.Root;

public class PerformCompositions {

	public static void performCompositions(CompilationUnit compUnit) throws CompositionException{
		compUnit.checkWellformedness();
	}
}
