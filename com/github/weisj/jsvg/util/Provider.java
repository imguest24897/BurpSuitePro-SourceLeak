package com.github.weisj.jsvg.util;

import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface Provider<T> {
  @NotNull
  T get();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsv\\util\Provider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */