package com.github.weisj.jsvg.parser;

import javax.swing.JComponent;
import org.jetbrains.annotations.Nullable;

public interface UIFuture<T> {
  boolean checkIfReady(@Nullable JComponent paramJComponent);
  
  T get();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\UIFuture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */