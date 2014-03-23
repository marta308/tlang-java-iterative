/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.3 */
package AST;

/**
 * @ast node
 * @declaredat /home/marta/workspace/TLang_iterative/src/spec/TLang.ast:10
 * @production FieldDeclaration : {@link FieldOrHookDeclaration};

 */
public class FieldDeclaration extends FieldOrHookDeclaration implements Cloneable {
  /**
   * @apilevel internal
   */
  public FieldDeclaration clone() throws CloneNotSupportedException {
    FieldDeclaration node = (FieldDeclaration) super.clone();
    node.qname_visited = false;
    return node;
  }
  /**
   * @apilevel internal
   */
  public FieldDeclaration copy() {
    try {
      FieldDeclaration node = (FieldDeclaration) clone();
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
  public FieldDeclaration fullCopy() {
    FieldDeclaration tree = (FieldDeclaration) copy();
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
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/PrettyPrint.jrag:43
   */
  public void pp(java.io.Writer writer, int indent) throws java.io.IOException{
  	for(int i = 0; i < indent; i++)
  		writer.write("- ");
    writer.write("FieldDeclaration: " + getName() + "\n");
  }
  /**
   */
  public FieldDeclaration() {
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
  public FieldDeclaration(String p0) {
    setName(p0);
  }
  /**
   */
  public FieldDeclaration(beaver.Symbol p0) {
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
    qname_visited = false;
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
}
