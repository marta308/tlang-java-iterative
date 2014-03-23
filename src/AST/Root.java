/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.3 */
package AST;

/**
 * @ast node
 * @declaredat /home/marta/workspace/TLang_iterative/src/spec/CompositionLang.ast:2
 * @production Root : {@link ASTNode} ::= <span class="component">CompilationUnits:{@link CompilationUnit}*</span> <span class="component">CompositionProgram:{@link CompositionProgram}</span>;

 */
public class Root extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel internal
   */
  public Root clone() throws CloneNotSupportedException {
    Root node = (Root) super.clone();
    node.collHooks_visited = false;
    node.findHook_String_visited = null;
    node.lookup_String_visited = null;
    node.isCorrect_visited = false;
    return node;
  }
  /**
   * @apilevel internal
   */
  public Root copy() {
    try {
      Root node = (Root) clone();
      node.parent = null;
      if(children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   */
  public Root fullCopy() {
    Root tree = (Root) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if(child != null) {
          child = child.fullCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * @aspect Compositions
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Compositions.jrag:55
   */
  public void doCompositions() throws CompositionException{
		Composer nextComposition = getCompositionProgram().nextComposition();
		//int iterationCnt = 0;
		while(nextComposition != null){
			//iterationCnt++;
			checkWellformedness();
			java.util.List<Declaration> sources = nextComposition.getSource();
			if(sources.size() != 1)
				throw new CompositionException("Incorrect composition source fragment."); 
			Declaration source = sources.get(0);
			java.util.List<Declaration> targets = nextComposition.getTarget();
			for(Declaration target : targets){
				target.bind(source, true);
			}
			if(nextComposition instanceof BindExhaust){
				source.removeSource();
			}
			nextComposition = getCompositionProgram().nextComposition();
		}
		checkWellformedness();
		//System.out.println("number of iterations: " + iterationCnt);
	}
  /**
   * @aspect WellFormedness
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/WellFormedness.jrag:62
   */
  public void checkWellformedness() throws CompositionException{
		if(!isCorrect())
			throw new CompositionException("System wellformedness violated.");
	}
  /**
   */
  public Root() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   */
  public void init$Children() {
    children = new ASTNode[2];
    setChild(new List(), 0);
  }
  /**
   */
  public Root(List<CompilationUnit> p0, CompositionProgram p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    collHooks_visited = false;
    findHook_String_visited = null;
    lookup_String_visited = null;
    isCorrect_visited = false;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * Replaces the CompilationUnits list.
   * @param list The new list node to be used as the CompilationUnits list.
   * @apilevel high-level
   */
  public void setCompilationUnitsList(List<CompilationUnit> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the CompilationUnits list.
   * @return Number of children in the CompilationUnits list.
   * @apilevel high-level
   */
  public int getNumCompilationUnits() {
    return getCompilationUnitsList().getNumChild();
  }
  /**
   * Retrieves the number of children in the CompilationUnits list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the CompilationUnits list.
   * @apilevel low-level
   */
  public int getNumCompilationUnitsNoTransform() {
    return getCompilationUnitsListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the CompilationUnits list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the CompilationUnits list.
   * @apilevel high-level
   */
  public CompilationUnit getCompilationUnits(int i) {
    return (CompilationUnit) getCompilationUnitsList().getChild(i);
  }
  /**
   * Check whether the CompilationUnits list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasCompilationUnits() {
    return getCompilationUnitsList().getNumChild() != 0;
  }
  /**
   * Append an element to the CompilationUnits list.
   * @param node The element to append to the CompilationUnits list.
   * @apilevel high-level
   */
  public void addCompilationUnits(CompilationUnit node) {
    List<CompilationUnit> list = (parent == null || state == null) ? getCompilationUnitsListNoTransform() : getCompilationUnitsList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addCompilationUnitsNoTransform(CompilationUnit node) {
    List<CompilationUnit> list = getCompilationUnitsListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the CompilationUnits list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setCompilationUnits(CompilationUnit node, int i) {
    List<CompilationUnit> list = getCompilationUnitsList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the CompilationUnits list.
   * @return The node representing the CompilationUnits list.
   * @apilevel high-level
   */
  public List<CompilationUnit> getCompilationUnitsList() {
    List<CompilationUnit> list = (List<CompilationUnit>) getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the CompilationUnits list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CompilationUnits list.
   * @apilevel low-level
   */
  public List<CompilationUnit> getCompilationUnitsListNoTransform() {
    return (List<CompilationUnit>) getChildNoTransform(0);
  }
  /**
   * Retrieves the CompilationUnits list.
   * @return The node representing the CompilationUnits list.
   * @apilevel high-level
   */
  public List<CompilationUnit> getCompilationUnitss() {
    return getCompilationUnitsList();
  }
  /**
   * Retrieves the CompilationUnits list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CompilationUnits list.
   * @apilevel low-level
   */
  public List<CompilationUnit> getCompilationUnitssNoTransform() {
    return getCompilationUnitsListNoTransform();
  }
  /**
   * Replaces the CompositionProgram child.
   * @param node The new node to replace the CompositionProgram child.
   * @apilevel high-level
   */
  public void setCompositionProgram(CompositionProgram node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the CompositionProgram child.
   * @return The current node used as the CompositionProgram child.
   * @apilevel high-level
   */
  public CompositionProgram getCompositionProgram() {
    return (CompositionProgram) getChild(1);
  }
  /**
   * Retrieves the CompositionProgram child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the CompositionProgram child.
   * @apilevel low-level
   */
  public CompositionProgram getCompositionProgramNoTransform() {
    return (CompositionProgram) getChildNoTransform(1);
  }
  /**
   * @apilevel internal
   */
  protected boolean collHooks_visited = false;
  /**
   * @attribute syn
   * @aspect Hooks
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Hooks.jrag:38
   */
  public java.util.List<DeclarationHook> collHooks() {
    if (collHooks_visited) {
      throw new RuntimeException("Circular definition of attr: collHooks in class: org.jastadd.ast.AST.SynDecl");
    }
    collHooks_visited = true;
    try {
      	  	java.util.List<DeclarationHook> hooks = new java.util.LinkedList<DeclarationHook>();
      		for(CompilationUnit cu : getCompilationUnitsList())
      			hooks.addAll(cu.collHooks());
      		return hooks;
      	}
    finally {
      collHooks_visited = false;
    }
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set findHook_String_visited;
  /**
   * @attribute syn
   * @aspect Hooks
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Hooks.jrag:45
   */
  public DeclarationHook findHook(String hookName) {
    Object _parameters = hookName;
    if(findHook_String_visited == null) findHook_String_visited = new java.util.HashSet(4);
    if (findHook_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: findHook in class: org.jastadd.ast.AST.SynDecl");
    }
    findHook_String_visited.add(_parameters);
    try {
      		for(DeclarationHook d: collHooks())
      			if(d.qname().equals(hookName))
      				return d;
      		return null;
      	}
    finally {
      findHook_String_visited.remove(_parameters);
    }
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set lookup_String_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/NameAnalysis.jrag:26
   */
  public java.util.List<Declaration> lookup(String declName) {
    Object _parameters = declName;
    if(lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: lookup in class: org.jastadd.ast.AST.SynDecl");
    }
    lookup_String_visited.add(_parameters);
    try {
      		java.util.List<Declaration> match = new java.util.LinkedList<Declaration>();
      		for(CompilationUnit cu : getCompilationUnitsList()){
      			match.addAll(cu.lookup(declName));
      		}
      		return match;
      	}
    finally {
      lookup_String_visited.remove(_parameters);
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean isCorrect_visited = false;
  /**
   * @attribute syn
   * @aspect WellFormedness
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/WellFormedness.jrag:11
   */
  public boolean isCorrect() {
    if (isCorrect_visited) {
      throw new RuntimeException("Circular definition of attr: isCorrect in class: org.jastadd.ast.AST.SynDecl");
    }
    isCorrect_visited = true;
    try {
    		for(CompilationUnit cu : getCompilationUnitsList()){
    			if(!cu.isCorrect())
    				return false;
    		}
    		return true;
    	}
    finally {
      isCorrect_visited = false;
    }
  }
  /**
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Compositions.jrag:5
   * @apilevel internal
   */
  public Root Define_Root_getRoot(ASTNode caller, ASTNode child) {
    if (caller == getCompositionProgramNoTransform()) {
      return this;
    }
    else {
      return getParent().Define_Root_getRoot(this, caller);
    }
  }
}
