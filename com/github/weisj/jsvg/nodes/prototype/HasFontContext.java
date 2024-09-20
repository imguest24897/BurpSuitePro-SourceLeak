package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
import org.jetbrains.annotations.NotNull;

public interface HasFontContext {
  @NotNull
  Mutator<MeasurableFontSpec> fontSpec();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\HasFontContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */