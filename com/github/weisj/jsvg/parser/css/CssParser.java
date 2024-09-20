package com.github.weisj.jsvg.parser.css;

import java.util.List;
import org.jetbrains.annotations.NotNull;

public interface CssParser {
  @NotNull
  StyleSheet parse(@NotNull List<char[]> paramList);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\css\CssParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */