/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.3 */
package AST;

/**
 * @ast node
 * @declaredat /home/marta/workspace/TLang_iterative/src/spec/TLang.ast:9
 * @production MethodDeclaration : {@link Declaration} ::= <span class="component">Parameters:{@link FieldOrHookDeclaration}*</span> <span class="component">MethodBody:{@link FieldOrHookDeclaration}*</span>;

 */
public class MethodDeclaration extends Declaration implements Cloneable {
  /**
   * @apilevel internal
   */
  public MethodDeclaration clone() throws CloneNotSupportedException {
    MethodDeclaration node = (MethodDeclaration) super.clone();
    node.localCollHooks_visited = false;
    node.qname_visited = false;
    node.localLookup_String_visited = null;
    node.lookupNOWC_String_visited = null;
    node.isCorrect_visited = false;
    return node;
  }
  /**
   * @apilevel internal
   */
  public MethodDeclaration copy() {
    try {
      MethodDeclaration node = (MethodDeclaration) clone();
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
  public MethodDeclaration fullCopy() {
    MethodDeclaration tree = (MethodDeclaration) copy();
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
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/PrettyPrint.jrag:25
   */
  public void pp(java.io.Writer writer, int indent) throws java.io.IOException{
  	for(int i = 0; i < indent; i++)
  		writer.write("- ");
    writer.write("MethodDeclaration: " + getName() + "\n");
    for(int i = 0; i < indent+1; i++)
  		writer.write("- ");
  	writer.write("Parameters:\n");
    for (Declaration d:getParametersList()) {
      d.pp(writer, indent + 1);
    }
    for(int i = 0; i < indent+1; i++)
  		writer.write("- ");
  	writer.write("Method Body:\n");
    for (Declaration d:getMethodBodyList()) {
      d.pp(writer, indent + 1);
    }
  }
  /**
   */
  public MethodDeclaration() {
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
    setChild(new List(), 1);
  }
  /**
   */
  public MethodDeclaration(String p0, List<FieldOrHookDeclaration> p1, List<FieldOrHookDeclaration> p2) {
    setName(p0);
    setChild(p1, 0);
    setChild(p2, 1);
  }
  /**
   */
  public MethodDeclaration(beaver.Symbol p0, List<FieldOrHookDeclaration> p1, List<FieldOrHookDeclaration> p2) {
    setName(p0);
    setChild(p1, 0);
    setChild(p2, 1);
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
    localCollHooks_visited = false;
    qname_visited = false;
    localLookup_String_visited = null;
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
   * Replaces the Parameters list.
   * @param list The new list node to be used as the Parameters list.
   * @apilevel high-level
   */
  public void setParametersList(List<FieldOrHookDeclaration> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Parameters list.
   * @return Number of children in the Parameters list.
   * @apilevel high-level
   */
  public int getNumParameters() {
    return getParametersList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Parameters list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Parameters list.
   * @apilevel low-level
   */
  public int getNumParametersNoTransform() {
    return getParametersListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Parameters list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Parameters list.
   * @apilevel high-level
   */
  public FieldOrHookDeclaration getParameters(int i) {
    return (FieldOrHookDeclaration) getParametersList().getChild(i);
  }
  /**
   * Check whether the Parameters list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParameters() {
    return getParametersList().getNumChild() != 0;
  }
  /**
   * Append an element to the Parameters list.
   * @param node The element to append to the Parameters list.
   * @apilevel high-level
   */
  public void addParameters(FieldOrHookDeclaration node) {
    List<FieldOrHookDeclaration> list = (parent == null || state == null) ? getParametersListNoTransform() : getParametersList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addParametersNoTransform(FieldOrHookDeclaration node) {
    List<FieldOrHookDeclaration> list = getParametersListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Parameters list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParameters(FieldOrHookDeclaration node, int i) {
    List<FieldOrHookDeclaration> list = getParametersList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Parameters list.
   * @return The node representing the Parameters list.
   * @apilevel high-level
   */
  public List<FieldOrHookDeclaration> getParametersList() {
    List<FieldOrHookDeclaration> list = (List<FieldOrHookDeclaration>) getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Parameters list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameters list.
   * @apilevel low-level
   */
  public List<FieldOrHookDeclaration> getParametersListNoTransform() {
    return (List<FieldOrHookDeclaration>) getChildNoTransform(0);
  }
  /**
   * Retrieves the Parameters list.
   * @return The node representing the Parameters list.
   * @apilevel high-level
   */
  public List<FieldOrHookDeclaration> getParameterss() {
    return getParametersList();
  }
  /**
   * Retrieves the Parameters list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameters list.
   * @apilevel low-level
   */
  public List<FieldOrHookDeclaration> getParameterssNoTransform() {
    return getParametersListNoTransform();
  }
  /**
   * Replaces the MethodBody list.
   * @param list The new list node to be used as the MethodBody list.
   * @apilevel high-level
   */
  public void setMethodBodyList(List<FieldOrHookDeclaration> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the MethodBody list.
   * @return Number of children in the MethodBody list.
   * @apilevel high-level
   */
  public int getNumMethodBody() {
    return getMethodBodyList().getNumChild();
  }
  /**
   * Retrieves the number of children in the MethodBody list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the MethodBody list.
   * @apilevel low-level
   */
  public int getNumMethodBodyNoTransform() {
    return getMethodBodyListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the MethodBody list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the MethodBody list.
   * @apilevel high-level
   */
  public FieldOrHookDeclaration getMethodBody(int i) {
    return (FieldOrHookDeclaration) getMethodBodyList().getChild(i);
  }
  /**
   * Check whether the MethodBody list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasMethodBody() {
    return getMethodBodyList().getNumChild() != 0;
  }
  /**
   * Append an element to the MethodBody list.
   * @param node The element to append to the MethodBody list.
   * @apilevel high-level
   */
  public void addMethodBody(FieldOrHookDeclaration node) {
    List<FieldOrHookDeclaration> list = (parent == null || state == null) ? getMethodBodyListNoTransform() : getMethodBodyList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addMethodBodyNoTransform(FieldOrHookDeclaration node) {
    List<FieldOrHookDeclaration> list = getMethodBodyListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the MethodBody list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setMethodBody(FieldOrHookDeclaration node, int i) {
    List<FieldOrHookDeclaration> list = getMethodBodyList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the MethodBody list.
   * @return The node representing the MethodBody list.
   * @apilevel high-level
   */
  public List<FieldOrHookDeclaration> getMethodBodyList() {
    List<FieldOrHookDeclaration> list = (List<FieldOrHookDeclaration>) getChild(1);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the MethodBody list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the MethodBody list.
   * @apilevel low-level
   */
  public List<FieldOrHookDeclaration> getMethodBodyListNoTransform() {
    return (List<FieldOrHookDeclaration>) getChildNoTransform(1);
  }
  /**
   * Retrieves the MethodBody list.
   * @return The node representing the MethodBody list.
   * @apilevel high-level
   */
  public List<FieldOrHookDeclaration> getMethodBodys() {
    return getMethodBodyList();
  }
  /**
   * Retrieves the MethodBody list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the MethodBody list.
   * @apilevel low-level
   */
  public List<FieldOrHookDeclaration> getMethodBodysNoTransform() {
    return getMethodBodyListNoTransform();
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
      		for(Declaration d : getParametersList()){
      			if(d instanceof DeclarationHook)
      	  			res.add((DeclarationHook)d);
      		}
      		for(Declaration d : getMethodBodyList()){
      			if(d instanceof DeclarationHook)
      	  			res.add((DeclarationHook)d);
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
      	for(Declaration d : getParametersList()){
      		if(label.equals("*"))
      			res.add(d);
      	  	else if(label.equals(d.getName()))
      	  		res.add(d);
      	}
      	for(Declaration d : getMethodBodyList()){
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
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/NameAnalysis.jrag:118
   */
  public Declaration lookupNOWC(String label) {
    Object _parameters = label;
    if(lookupNOWC_String_visited == null) lookupNOWC_String_visited = new java.util.HashSet(4);
    if (lookupNOWC_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attr: lookupNOWC in class: org.jastadd.ast.AST.SynDecl");
    }
    lookupNOWC_String_visited.add(_parameters);
    try {
    	   for(Declaration d : getParametersList()){
    		   if(label.equals(d.qname()))
    			   return d;
    	   }
    	   for(Declaration d : getMethodBodyList()){
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
    		for(Declaration d : getParametersList()){
    			if(!d.isCorrect())
    				return false;
    		}
    		for(Declaration d : getMethodBodyList()){
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
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/NameAnalysis.jrag:23
   * @apilevel internal
   */
  public String Define_String_parentName(ASTNode caller, ASTNode child) {
    if (caller == getMethodBodyListNoTransform()) {
      int i = caller.getIndexOfChild(child);
      return "" + ((parentName() != null)? parentName() + "." : "") + getName();
    }
    else if (caller == getParametersListNoTransform()) {
      int i = caller.getIndexOfChild(child);
      return "" + ((parentName() != null)? parentName() + "." : "") + getName();
    }
    else {
      return getParent().Define_String_parentName(this, caller);
    }
  }
  /**
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/WellFormedness.jrag:9
   * @apilevel internal
   */
  public CompilationUnit Define_CompilationUnit_getCompilationUnit(ASTNode caller, ASTNode child) {
    if (caller == getParametersListNoTransform()) {
      int i = caller.getIndexOfChild(child);
      return getCompilationUnit();
    }
    else if (caller == getMethodBodyListNoTransform()) {
      int i = caller.getIndexOfChild(child);
      return getCompilationUnit();
    }
    else {
      return getParent().Define_CompilationUnit_getCompilationUnit(this, caller);
    }
  }
}
