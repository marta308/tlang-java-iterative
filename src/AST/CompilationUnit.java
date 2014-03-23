/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.3 */
package AST;

/**
 * @ast node
 * @declaredat /home/marta/workspace/TLang_iterative/src/spec/TLang.ast:5
 * @production CompilationUnit : {@link ASTNode} ::= <span class="component">{@link ClassDeclaration}*</span>;

 */
public class CompilationUnit extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel internal
   */
  public CompilationUnit clone() throws CloneNotSupportedException {
    CompilationUnit node = (CompilationUnit) super.clone();
    node.collHooks_visited = false;
    node.lookup_String_visited = null;
    node.lookupNOWC_String_visited = null;
    node.isCorrect_visited = false;
    return node;
  }
  /**
   * @apilevel internal
   */
  public CompilationUnit copy() {
    try {
      CompilationUnit node = (CompilationUnit) clone();
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
  public CompilationUnit fullCopy() {
    CompilationUnit tree = (CompilationUnit) copy();
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
   * @aspect PrettyPrint
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/PrettyPrint.jrag:6
   */
  public void pp(java.io.Writer writer) throws java.io.IOException{
  	writer.write("CompilationUnit\n");
    for (Declaration d:getClassDeclarationList()) {
      d.pp(writer, 1);
    }
    writer.close();
  }
  /**
   */
  public CompilationUnit() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   */
  public void init$Children() {
    children = new ASTNode[1];
    setChild(new List(), 0);
  }
  /**
   */
  public CompilationUnit(List<ClassDeclaration> p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    collHooks_visited = false;
    lookup_String_visited = null;
    lookupNOWC_String_visited = null;
    isCorrect_visited = false;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * Replaces the ClassDeclaration list.
   * @param list The new list node to be used as the ClassDeclaration list.
   * @apilevel high-level
   */
  public void setClassDeclarationList(List<ClassDeclaration> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the ClassDeclaration list.
   * @return Number of children in the ClassDeclaration list.
   * @apilevel high-level
   */
  public int getNumClassDeclaration() {
    return getClassDeclarationList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ClassDeclaration list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ClassDeclaration list.
   * @apilevel low-level
   */
  public int getNumClassDeclarationNoTransform() {
    return getClassDeclarationListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ClassDeclaration list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ClassDeclaration list.
   * @apilevel high-level
   */
  public ClassDeclaration getClassDeclaration(int i) {
    return (ClassDeclaration) getClassDeclarationList().getChild(i);
  }
  /**
   * Check whether the ClassDeclaration list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasClassDeclaration() {
    return getClassDeclarationList().getNumChild() != 0;
  }
  /**
   * Append an element to the ClassDeclaration list.
   * @param node The element to append to the ClassDeclaration list.
   * @apilevel high-level
   */
  public void addClassDeclaration(ClassDeclaration node) {
    List<ClassDeclaration> list = (parent == null || state == null) ? getClassDeclarationListNoTransform() : getClassDeclarationList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addClassDeclarationNoTransform(ClassDeclaration node) {
    List<ClassDeclaration> list = getClassDeclarationListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ClassDeclaration list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setClassDeclaration(ClassDeclaration node, int i) {
    List<ClassDeclaration> list = getClassDeclarationList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ClassDeclaration list.
   * @return The node representing the ClassDeclaration list.
   * @apilevel high-level
   */
  public List<ClassDeclaration> getClassDeclarationList() {
    List<ClassDeclaration> list = (List<ClassDeclaration>) getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the ClassDeclaration list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ClassDeclaration list.
   * @apilevel low-level
   */
  public List<ClassDeclaration> getClassDeclarationListNoTransform() {
    return (List<ClassDeclaration>) getChildNoTransform(0);
  }
  /**
   * Retrieves the ClassDeclaration list.
   * @return The node representing the ClassDeclaration list.
   * @apilevel high-level
   */
  public List<ClassDeclaration> getClassDeclarations() {
    return getClassDeclarationList();
  }
  /**
   * Retrieves the ClassDeclaration list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ClassDeclaration list.
   * @apilevel low-level
   */
  public List<ClassDeclaration> getClassDeclarationsNoTransform() {
    return getClassDeclarationListNoTransform();
  }
  /**
   * @apilevel internal
   */
  protected boolean collHooks_visited = false;
  /**
   * @attribute syn
   * @aspect Hooks
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Hooks.jrag:4
   */
  public java.util.List<DeclarationHook> collHooks() {
    if (collHooks_visited) {
      throw new RuntimeException("Circular definition of attr: collHooks in class: org.jastadd.ast.AST.SynDecl");
    }
    collHooks_visited = true;
    try {
      		java.util.List<DeclarationHook> res = new java.util.LinkedList<DeclarationHook>();	
        	for (Declaration d : getClassDeclarationList()){
          		res.addAll(d.localCollHooks());
          	}
          	return res;
        }
    finally {
      collHooks_visited = false;
    }
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set lookup_String_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/NameAnalysis.jrag:34
   */
  public java.util.List<Declaration> lookup(String label) {
    Object _parameters = label;
    if(lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: lookup in class: org.jastadd.ast.AST.SynDecl");
    }
    lookup_String_visited.add(_parameters);
    try { 
      	String [] parts = label.split("\\.");
      	java.util.List<Declaration> resLocal = new java.util.LinkedList<Declaration>();
      	java.util.List<Declaration> res = new java.util.LinkedList<Declaration>();
      	for (Declaration d : getClassDeclarationList()){
      		if(parts[0].equals("*"))
      			resLocal.add(d);
          	else if(parts[0].equals(d.qname())) 
          		resLocal.add(d);
        }
        if(parts.length == 1)
        	return resLocal;
      	for (int i = 1; i < parts.length; i++){
      		res = new java.util.LinkedList<Declaration>();
      		for(Declaration d : resLocal)
      			for(Declaration d1 : d.localLookup(parts[i]))  //just impl of addall
      				res.add(d1);
      		if(!res.isEmpty()){
      			resLocal = new java.util.LinkedList<Declaration>();
      			for(Declaration d : res)
      				resLocal.add(d);
      		}
      		else break; 		
      	}
      	return res;
      }
    finally {
      lookup_String_visited.remove(_parameters);
    }
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set lookupNOWC_String_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/NameAnalysis.jrag:102
   */
  public Declaration lookupNOWC(String label) {
    Object _parameters = label;
    if(lookupNOWC_String_visited == null) lookupNOWC_String_visited = new java.util.HashSet(4);
    if (lookupNOWC_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: lookupNOWC in class: org.jastadd.ast.AST.SynDecl");
    }
    lookupNOWC_String_visited.add(_parameters);
    try {
    	   for (Declaration d : getClassDeclarationList()){
    		   if(label.equals(d.qname()))
    			   return d;
    	   }
    	   return null;
       }
    finally {
      lookupNOWC_String_visited.remove(_parameters);
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean isCorrect_visited = false;
  /**
   * @attribute syn
   * @aspect WellFormedness
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/WellFormedness.jrag:19
   */
  public boolean isCorrect() {
    if (isCorrect_visited) {
      throw new RuntimeException("Circular definition of attr: isCorrect in class: org.jastadd.ast.AST.SynDecl");
    }
    isCorrect_visited = true;
    try {
    		for (Declaration d : getClassDeclarationList()){
    			if(!d.isCorrect())
    				return false;
    		}
    		return true;
    	}
    finally {
      isCorrect_visited = false;
    }
  }
  /**
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/NameAnalysis.jrag:18
   * @apilevel internal
   */
  public String Define_String_parentName(ASTNode caller, ASTNode child) {
    if (caller == getClassDeclarationListNoTransform()) {
      int i = caller.getIndexOfChild(child);
      return null;
    }
    else {
      return getParent().Define_String_parentName(this, caller);
    }
  }
  /**
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/WellFormedness.jrag:5
   * @apilevel internal
   */
  public CompilationUnit Define_CompilationUnit_getCompilationUnit(ASTNode caller, ASTNode child) {
    if (caller == getClassDeclarationListNoTransform()) {
      int i = caller.getIndexOfChild(child);
      return this;
    }
    else {
      return getParent().Define_CompilationUnit_getCompilationUnit(this, caller);
    }
  }
}
