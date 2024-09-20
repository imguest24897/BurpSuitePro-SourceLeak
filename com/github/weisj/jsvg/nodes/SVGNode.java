package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface SVGNode {
  @NotNull
  String tagName();
  
  @Nullable
  String id();
  
  void build(@NotNull AttributeNode paramAttributeNode);
  
  void addContent(char[] paramArrayOfchar);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\SVGNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */