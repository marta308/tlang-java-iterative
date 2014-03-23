/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.3 */
package AST;

/**
 * @ast node
 * @declaredat /home/marta/workspace/TLang_iterative/src/spec/TLang.ast:7
 * @production FieldOrHookDeclaration : {@link Declaration};

 */
public abstract class FieldOrHookDeclaration extends Declaration implements Cloneable {
  /**
   * @apilevel internal
   */
  public FieldOrHookDeclaration clone() throws CloneNotSupportedException {
    FieldOrHookDeclaration node = (FieldOrHookDeclaration) super.clone();
    node.isCorrect_visited = false;
    return node;
  }
  /**
   */
  public FieldOrHookDeclaration() {
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
  public FieldOrHookDeclaration(String p0) {
    setName(p0);
  }
  /**
   */
  public FieldOrHookDeclaration(beaver.Symbol p0) {
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
    		return this.isCorrectLocal();
    	}
    finally {
      isCorrect_visited = false;
    }
  }
}
