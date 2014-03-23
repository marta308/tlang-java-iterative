/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.3 */
package AST;

/**
 * @ast node
 * @declaredat /home/marta/workspace/TLang_iterative/src/spec/CompositionLang.ast:10
 * @production Composer : {@link ASTNode} ::= <span class="component">&lt;TargetName:String&gt;</span> <span class="component">&lt;SourceName:String&gt;</span>;

 */
public abstract class Composer extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel internal
   */
  public Composer clone() throws CloneNotSupportedException {
    Composer node = (Composer) super.clone();
    node.getSource_visited = false;
    node.getTarget_visited = false;
    node.isExhausted_visited = false;
    node.getRoot_visited = false;
    return node;
  }
  /**
   */
  public Composer() {
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
  public Composer(String p0, String p1) {
    setTargetName(p0);
    setSourceName(p1);
  }
  /**
   */
  public Composer(beaver.Symbol p0, beaver.Symbol p1) {
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
    getSource_visited = false;
    getTarget_visited = false;
    isExhausted_visited = false;
    getRoot_visited = false;
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
   * @apilevel internal
   */
  protected String tokenString_TargetName;
  /**
   */
  public int TargetNamestart;
  /**
   */
  public int TargetNameend;
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
   * @apilevel internal
   */
  protected String tokenString_SourceName;
  /**
   */
  public int SourceNamestart;
  /**
   */
  public int SourceNameend;
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
  /**
   * @apilevel internal
   */
  protected boolean getSource_visited = false;
  /**
   * @attribute syn
   * @aspect Compositions
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Compositions.jrag:9
   */
  public java.util.List<Declaration> getSource() {
    if (getSource_visited) {
      throw new RuntimeException("Circular definition of attr: getSource in class: org.jastadd.ast.AST.SynDecl");
    }
    getSource_visited = true;
    try {
    		return getRoot().lookup(getSourceName());
    	}
    finally {
      getSource_visited = false;
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean getTarget_visited = false;
  /**
   * @attribute syn
   * @aspect Compositions
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Compositions.jrag:13
   */
  public java.util.List<Declaration> getTarget() {
    if (getTarget_visited) {
      throw new RuntimeException("Circular definition of attr: getTarget in class: org.jastadd.ast.AST.SynDecl");
    }
    getTarget_visited = true;
    try {
    		return getRoot().lookup(getTargetName());
    	}
    finally {
      getTarget_visited = false;
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean isExhausted_visited = false;
  /**
   * @attribute syn
   * @aspect Compositions
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Compositions.jrag:17
   */
  public boolean isExhausted() {
    if (isExhausted_visited) {
      throw new RuntimeException("Circular definition of attr: isExhausted in class: org.jastadd.ast.AST.SynDecl");
    }
    isExhausted_visited = true;
    try {
    		return getTarget().isEmpty();
    	}
    finally {
      isExhausted_visited = false;
    }
  }
  /**
   * @attribute inh
   * @aspect Compositions
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Compositions.jrag:6
   */
  public Root getRoot() {
    if (getRoot_visited) {
      throw new RuntimeException("Circular definition of attr: getRoot in class: org.jastadd.ast.AST.InhDecl");
    }
    getRoot_visited = true;
    Root getRoot_value = getParent().Define_Root_getRoot(this, null);

    getRoot_visited = false;
    return getRoot_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean getRoot_visited = false;
}
