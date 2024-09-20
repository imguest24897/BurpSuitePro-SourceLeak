package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.renderer.PaintContext;
import org.jetbrains.annotations.NotNull;

public interface HasPaintContext {
  @NotNull
  Mutator<PaintContext> paintContext();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\HasPaintContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */