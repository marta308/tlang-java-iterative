package exampleprogs;

import AST.CompositionException;
import AST.Root;

public class PerformCompositions {

	public static void performCompositions(Root root) throws CompositionException{
		root.traverse();
	}
}
