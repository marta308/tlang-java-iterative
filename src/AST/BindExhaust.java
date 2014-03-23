/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.3 */
package AST;

/**
 * @ast node
 * @declaredat /home/marta/workspace/TLang_iterative/src/spec/CompositionLang.ast:16
 * @production BindExhaust : {@link Composer};

 */
public class BindExhaust extends Composer implements Cloneable {
  /**
   * @apilevel internal
   */
  public BindExhaust clone() throws CloneNotSupportedException {
    BindExhaust node = (BindExhaust) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   */
  public BindExhaust copy() {
    try {
      BindExhaust node = (BindExhaust) clone();
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
  public BindExhaust fullCopy() {
    BindExhaust tree = (BindExhaust) copy();
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
   */
  public BindExhaust() {
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
  public BindExhaust(String p0, String p1) {
    setTargetName(p0);
    setSourceName(p1);
  }
  /**
   */
  public BindExhaust(beaver.Symbol p0, beaver.Symbol p1) {
    setTargetName(p0);
    setSourceName(p1);
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
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * Replaces the lexeme TargetName.
   * @param value The new value for the lexeme TargetName.
   * @apilevel high-level
   */
  public void setTargetName(String value) {
    tokenString_TargetName = value;
  }
  /**
   * JastAdd-internal setter for lexeme TargetName using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme TargetName
   * @apilevel internal
   */
  public void setTargetName(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setTargetName is only valid for String lexemes");
    tokenString_TargetName = (String)symbol.value;
    TargetNamestart = symbol.getStart();
    TargetNameend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme TargetName.
   * @return The value for the lexeme TargetName.
   * @apilevel high-level
   */
  public String getTargetName() {
    return tokenString_TargetName != null ? tokenString_TargetName : "";
  }
  /**
   * Replaces the lexeme SourceName.
   * @param value The new value for the lexeme SourceName.
   * @apilevel high-level
   */
  public void setSourceName(String value) {
    tokenString_SourceName = value;
  }
  /**
   * JastAdd-internal setter for lexeme SourceName using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme SourceName
   * @apilevel internal
   */
  public void setSourceName(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setSourceName is only valid for String lexemes");
    tokenString_SourceName = (String)symbol.value;
    SourceNamestart = symbol.getStart();
    SourceNameend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme SourceName.
   * @return The value for the lexeme SourceName.
   * @apilevel high-level
   */
  public String getSourceName() {
    return tokenString_SourceName != null ? tokenString_SourceName : "";
  }
}
