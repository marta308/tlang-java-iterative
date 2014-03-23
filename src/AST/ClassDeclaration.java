/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.3 */
package AST;

/**
 * @ast node
 * @declaredat /home/marta/workspace/TLang_iterative/src/spec/TLang.ast:8
 * @production ClassDeclaration : {@link Declaration} ::= <span class="component">ClassBody:{@link Declaration}*</span>;

 */
public class ClassDeclaration extends Declaration implements Cloneable {
  /**
   * @apilevel internal
   */
  public ClassDeclaration clone() throws CloneNotSupportedException {
    ClassDeclaration node = (ClassDeclaration) super.clone();
    node.localCollHooks_visited = false;
    node.qname_visited = false;
    node.localLookup_String_visited = null;
    node.lookupNOWC_String_visited = null;
    node.isCorrect_visited = false;
    node.getCompilationUnit_visited = false;
    return node;
  }
  /**
   * @apilevel internal
   */
  public ClassDeclaration copy() {
    try {
      ClassDeclaration node = (ClassDeclaration) clone();
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
  public ClassDeclaration fullCopy() {
    ClassDeclaration tree = (ClassDeclaration) copy();
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
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/PrettyPrint.jrag:16
   */
  public void pp(java.io.Writer writer, int indent) throws java.io.IOException{
  	for(int i = 0; i < indent; i++)
  		writer.write("- ");
    writer.write("ClassDeclaration: " + getName() + "\n");
    for (Declaration d:getClassBodyList()) {
      d.pp(writer, indent + 1);
    }
  }
  /**
   */
  public ClassDeclaration() {
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
  public ClassDeclaration(String p0, List<Declaration> p1) {
    setName(p0);
    setChild(p1, 0);
  }
  /**
   */
  public ClassDeclaration(beaver.Symbol p0, List<Declaration> p1) {
    setName(p0);
    setChild(p1, 0);
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
    localCollHooks_visited = false;
    qname_visited = false;
    localLookup_String_visited = null;
    lookupNOWC_String_visited = null;
    isCorrect_visited = false;
    getCompilationUnit_visited = false;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * Replaces the lexeme Name.
   * @param value The new value for the lexeme Name.
   * @apilevel high-level
   */
  public void setName(String value) {
    tokenString_Name = value;
  }
  /**
   * JastAdd-internal setter for lexeme Name using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Name
   * @apilevel internal
   */
  public void setName(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setName is only valid for String lexemes");
    tokenString_Name = (String)symbol.value;
    Namestart = symbol.getStart();
    Nameend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Name.
   * @return The value for the lexeme Name.
   * @apilevel high-level
   */
  public String getName() {
    return tokenString_Name != null ? tokenString_Name : "";
  }
  /**
   * Replaces the ClassBody list.
   * @param list The new list node to be used as the ClassBody list.
   * @apilevel high-level
   */
  public void setClassBodyList(List<Declaration> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the ClassBody list.
   * @return Number of children in the ClassBody list.
   * @apilevel high-level
   */
  public int getNumClassBody() {
    return getClassBodyList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ClassBody list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ClassBody list.
   * @apilevel low-level
   */
  public int getNumClassBodyNoTransform() {
    return getClassBodyListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ClassBody list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ClassBody list.
   * @apilevel high-level
   */
  public Declaration getClassBody(int i) {
    return (Declaration) getClassBodyList().getChild(i);
  }
  /**
   * Check whether the ClassBody list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasClassBody() {
    return getClassBodyList().getNumChild() != 0;
  }
  /**
   * Append an element to the ClassBody list.
   * @param node The element to append to the ClassBody list.
   * @apilevel high-level
   */
  public void addClassBody(Declaration node) {
    List<Declaration> list = (parent == null || state == null) ? getClassBodyListNoTransform() : getClassBodyList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addClassBodyNoTransform(Declaration node) {
    List<Declaration> list = getClassBodyListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ClassBody list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setClassBody(Declaration node, int i) {
    List<Declaration> list = getClassBodyList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ClassBody list.
   * @return The node representing the ClassBody list.
   * @apilevel high-level
   */
  public List<Declaration> getClassBodyList() {
    List<Declaration> list = (List<Declaration>) getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the ClassBody list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ClassBody list.
   * @apilevel low-level
   */
  public List<Declaration> getClassBodyListNoTransform() {
    return (List<Declaration>) getChildNoTransform(0);
  }
  /**
   * Retrieves the ClassBody list.
   * @return The node representing the ClassBody list.
   * @apilevel high-level
   */
  public List<Declaration> getClassBodys() {
    return getClassBodyList();
  }
  /**
   * Retrieves the ClassBody list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ClassBody list.
   * @apilevel low-level
   */
  public List<Declaration> getClassBodysNoTransform() {
    return getClassBodyListNoTransform();
  }
  /**
   * @apilevel internal
   */
  protected boolean localCollHooks_visited = false;
  /**
   * @attribute syn
   * @aspect Hooks
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Hooks.jrag:12
   */
  public java.util.List<DeclarationHook> localCollHooks() {
    if (localCollHooks_visited) {
      throw new RuntimeException("Circular definition of attr: localCollHooks in class: org.jastadd.ast.AST.SynDecl");
    }
    localCollHooks_visited = true;
    try {
    		java.util.List<DeclarationHook> res = new java.util.LinkedList<DeclarationHook>();
      		for(Declaration d : getClassBodyList()){
      	  		if(d instanceof DeclarationHook)
      	  			res.add((DeclarationHook)d);
      	  		else
      	    		res.addAll(d.localCollHooks());
      	  	}
      		return res;
      	}
    finally {
      localCollHooks_visited = false;
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean qname_visited = false;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/NameAnalysis.jrag:7
   */
  public String qname() {
    if (qname_visited) {
      throw new RuntimeException("Circular definition of attr: qname in class: org.jastadd.ast.AST.SynDecl");
    }
    qname_visited = true;
    try {  return "" + ((parentName() != null)? parentName() + "." : "") + getName();  }
    finally {
      qname_visited = false;
    }
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set localLookup_String_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/NameAnalysis.jrag:61
   */
  public java.util.List<Declaration> localLookup(String label) {
    Object _parameters = label;
    if(localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: localLookup in class: org.jastadd.ast.AST.SynDecl");
    }
    localLookup_String_visited.add(_parameters);
    try {
      	java.util.List<Declaration> res = new java.util.LinkedList<Declaration>();
      	for(Declaration d : getClassBodyList()){
      		if(label.equals("*"))
      			res.add(d);
      	  	else if(label.equals(d.getName()))
      	  		res.add(d);
      	}
      	return res;
      }
    finally {
      localLookup_String_visited.remove(_parameters);
    }
  }
  /**
   * @apilevel internal
   */
  protected java.util.Set lookupNOWC_String_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/NameAnalysis.jrag:110
   */
  public Declaration lookupNOWC(String label) {
    Object _parameters = label;
    if(lookupNOWC_String_visited == null) lookupNOWC_String_visited = new java.util.HashSet(4);
    if (lookupNOWC_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: lookupNOWC in class: org.jastadd.ast.AST.SynDecl");
    }
    lookupNOWC_String_visited.add(_parameters);
    try {
    	   for(Declaration d : getClassBodyList()){
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
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/WellFormedness.jrag:27
   */
  public boolean isCorrect() {
    if (isCorrect_visited) {
      throw new RuntimeException("Circular definition of attr: isCorrect in class: org.jastadd.ast.AST.SynDecl");
    }
    isCorrect_visited = true;
    try {
    		if (!this.isCorrectLocal())
    			return false;
    		for(Declaration d : getClassBodyList()){
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
   * @attribute inh
   * @aspect WellFormedness
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/WellFormedness.jrag:4
   */
  public CompilationUnit getCompilationUnit() {
    if (getCompilationUnit_visited) {
      throw new RuntimeException("Circular definition of attr: getCompilationUnit in class: org.jastadd.ast.AST.InhDecl");
    }
    getCompilationUnit_visited = true;
    CompilationUnit getCompilationUnit_value = getParent().Define_CompilationUnit_getCompilationUnit(this, null);

    getCompilationUnit_visited = false;
    return getCompilationUnit_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean getCompilationUnit_visited = false;
  /**
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/NameAnalysis.jrag:19
   * @apilevel internal
   */
  public String Define_String_parentName(ASTNode caller, ASTNode child) {
    if (caller == getClassBodyListNoTransform()) {
      int i = caller.getIndexOfChild(child);
      return "" + ((parentName() != null)? parentName() + "." : "") + getName();
    }
    else {
      return getParent().Define_String_parentName(this, caller);
    }
  }
  /**
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/WellFormedness.jrag:7
   * @apilevel internal
   */
  public CompilationUnit Define_CompilationUnit_getCompilationUnit(ASTNode caller, ASTNode child) {
    if (caller == getClassBodyListNoTransform()) {
      int i = caller.getIndexOfChild(child);
      return getCompilationUnit();
    }
    else {
      return getParent().Define_CompilationUnit_getCompilationUnit(this, caller);
    }
  }
}
