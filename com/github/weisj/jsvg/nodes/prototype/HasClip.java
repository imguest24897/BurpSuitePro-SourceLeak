package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.nodes.ClipPath;
import com.github.weisj.jsvg.nodes.Mask;
import org.jetbrains.annotations.Nullable;

public interface HasClip {
  @Nullable
  ClipPath clipPath();
  
  @Nullable
  Mask mask();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\HasClip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */