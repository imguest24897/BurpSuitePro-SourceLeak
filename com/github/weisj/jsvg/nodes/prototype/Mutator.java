package com.github.weisj.jsvg.nodes.prototype;

import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface Mutator<T> {
  @NotNull
  T mutate(@NotNull T paramT);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\Mutator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */