/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.3 */
package AST;

/**
 * @ast node
 * @declaredat /home/marta/workspace/TLang_iterative/src/spec/TLang.ast:6
 * @production Declaration : {@link ASTNode} ::= <span class="component">&lt;Name:String&gt;</span>;

 */
public abstract class Declaration extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel internal
   */
  public Declaration clone() throws CloneNotSupportedException {
    Declaration node = (Declaration) super.clone();
    node.localCollHooks_visited = false;
    node.qname_visited = false;
    node.localLookup_String_visited = null;
    node.isCorrectLocal_visited = false;
    node.parentName_visited = false;
    node.getCompilationUnit_visited = false;
    return node;
  }
  /**
   * @aspect PrettyPrint
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/PrettyPrint.jrag:14
   */
  public void pp(java.io.Writer writer, int indent) throws java.io.IOException{}
  /**
   */
  public Declaration() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   */
  public void init$Children() {
  }
  /**
   */
  public Declaration(String p0) {
    setName(p0);
  }
  /**
   */
  public Declaration(beaver.Symbol p0) {
    setName(p0);
  }
  /**
   * @apilevel low-level
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    localCollHooks_visited = false;
    qname_visited = false;
    localLookup_String_visited = null;
    isCorrectLocal_visited = false;
    parentName_visited = false;
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
   * @apilevel internal
   */
  protected String tokenString_Name;
  /**
   */
  public int Namestart;
  /**
   */
  public int Nameend;
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
   * @attribute syn
   * @aspect WellFormedness
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/WellFormedness.jrag:27
   */
  public abstract boolean isCorrect();
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
    try {  return new java.util.LinkedList<DeclarationHook>();  }
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
    try {  return null;  }
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
    try {  return new java.util.LinkedList<Declaration>();  }
    finally {
      localLookup_String_visited.remove(_parameters);
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean isCorrectLocal_visited = false;
  /**
   * @attribute syn
   * @aspect WellFormedness
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/WellFormedness.jrag:58
   */
  public boolean isCorrectLocal() {
    if (isCorrectLocal_visited) {
      throw new RuntimeException("Circular definition of attr: isCorrectLocal in class: org.jastadd.ast.AST.SynDecl");
    }
    isCorrectLocal_visited = true;
    try {
    		return (this == getParent().getParent().lookupNOWC(qname()));
    	}
    finally {
      isCorrectLocal_visited = false;
    }
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/NameAnalysis.jrag:17
   */
  public String parentName() {
    if (parentName_visited) {
      throw new RuntimeException("Circular definition of attr: parentName in class: org.jastadd.ast.AST.InhDecl");
    }
    parentName_visited = true;
    String parentName_value = getParent().Define_String_parentName(this, null);

    parentName_visited = false;
    return parentName_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean parentName_visited = false;
  /**
   * @attribute inh
   * @aspect WellFormedness
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/WellFormedness.jrag:6
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
}
