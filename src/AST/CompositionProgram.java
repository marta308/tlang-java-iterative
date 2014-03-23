/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.3 */
package AST;

/**
 * @ast node
 * @declaredat /home/marta/workspace/TLang_iterative/src/spec/CompositionLang.ast:7
 * @production CompositionProgram : {@link ASTNode} ::= <span class="component">Composers:{@link Composer}*</span>;

 */
public class CompositionProgram extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel internal
   */
  public CompositionProgram clone() throws CloneNotSupportedException {
    CompositionProgram node = (CompositionProgram) super.clone();
    node.nextComposition_visited = false;
    node.getRoot_visited = false;
    return node;
  }
  /**
   * @apilevel internal
   */
  public CompositionProgram copy() {
    try {
      CompositionProgram node = (CompositionProgram) clone();
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
  public CompositionProgram fullCopy() {
    CompositionProgram tree = (CompositionProgram) copy();
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
  public CompositionProgram() {
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
  public CompositionProgram(List<Composer> p0) {
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
    nextComposition_visited = false;
    getRoot_visited = false;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * Replaces the Composers list.
   * @param list The new list node to be used as the Composers list.
   * @apilevel high-level
   */
  public void setComposersList(List<Composer> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Composers list.
   * @return Number of children in the Composers list.
   * @apilevel high-level
   */
  public int getNumComposers() {
    return getComposersList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Composers list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Composers list.
   * @apilevel low-level
   */
  public int getNumComposersNoTransform() {
    return getComposersListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Composers list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Composers list.
   * @apilevel high-level
   */
  public Composer getComposers(int i) {
    return (Composer) getComposersList().getChild(i);
  }
  /**
   * Check whether the Composers list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasComposers() {
    return getComposersList().getNumChild() != 0;
  }
  /**
   * Append an element to the Composers list.
   * @param node The element to append to the Composers list.
   * @apilevel high-level
   */
  public void addComposers(Composer node) {
    List<Composer> list = (parent == null || state == null) ? getComposersListNoTransform() : getComposersList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addComposersNoTransform(Composer node) {
    List<Composer> list = getComposersListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Composers list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setComposers(Composer node, int i) {
    List<Composer> list = getComposersList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Composers list.
   * @return The node representing the Composers list.
   * @apilevel high-level
   */
  public List<Composer> getComposersList() {
    List<Composer> list = (List<Composer>) getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Composers list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Composers list.
   * @apilevel low-level
   */
  public List<Composer> getComposersListNoTransform() {
    return (List<Composer>) getChildNoTransform(0);
  }
  /**
   * Retrieves the Composers list.
   * @return The node representing the Composers list.
   * @apilevel high-level
   */
  public List<Composer> getComposerss() {
    return getComposersList();
  }
  /**
   * Retrieves the Composers list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Composers list.
   * @apilevel low-level
   */
  public List<Composer> getComposerssNoTransform() {
    return getComposersListNoTransform();
  }
  /**
   * @apilevel internal
   */
  protected boolean nextComposition_visited = false;
  /**
   * @attribute syn
   * @aspect Compositions
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Compositions.jrag:21
   */
  public Composer nextComposition() {
    if (nextComposition_visited) {
      throw new RuntimeException("Circular definition of attr: nextComposition in class: org.jastadd.ast.AST.SynDecl");
    }
    nextComposition_visited = true;
    try {
    		Composer next = null;
    		for (int i = 0; i < getNumComposers(); i++){
    			next = getComposers(i);
    			if(!next.isExhausted())
    				return next;
    		}
    		return null;
    	}
    finally {
      nextComposition_visited = false;
    }
  }
  /**
   * @attribute inh
   * @aspect Compositions
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Compositions.jrag:4
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
  /**
   * @declaredat /home/marta/workspace/TLang_iterative/src/spec/Compositions.jrag:7
   * @apilevel internal
   */
  public Root Define_Root_getRoot(ASTNode caller, ASTNode child) {
    if (caller == getComposersListNoTransform()) {
      int i = caller.getIndexOfChild(child);
      return getRoot();
    }
    else {
      return getParent().Define_Root_getRoot(this, caller);
    }
  }
}
