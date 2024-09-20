package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.geometry.size.Length;
import com.google.errorprone.annotations.Immutable;
import org.jetbrains.annotations.NotNull;

@Immutable
public interface FontSize {
  @NotNull
  Length size(@NotNull Length paramLength);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\FontSize.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */