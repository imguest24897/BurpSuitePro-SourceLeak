package net.portswigger.javatooling.api;

import java.util.List;
import java.util.Optional;

public final class JavadocNode extends Record {
  private final String text;
  
  private final Optional<JavadocTag> tag;
  
  private final List<JavadocNode> children;
  
  public JavadocNode(String paramString) {
    this(paramString, Optional.empty(), List.of());
  }
  
  public JavadocNode(String paramString, Optional<JavadocTag> paramOptional, List<JavadocNode> paramList) {
    this.text = paramString;
    this.tag = paramOptional;
    this.children = paramList;
  }
  
  public boolean isLeaf() {
    return this.children.isEmpty();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/javatooling/api/JavadocNode;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/javatooling/api/JavadocNode;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/javatooling/api/JavadocNode;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String text() {
    return this.text;
  }
  
  public Optional<JavadocTag> tag() {
    return this.tag;
  }
  
  public List<JavadocNode> children() {
    return this.children;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\api\JavadocNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */