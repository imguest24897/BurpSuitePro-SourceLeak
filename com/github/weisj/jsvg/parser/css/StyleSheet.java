package com.github.weisj.jsvg.parser.css;

import com.github.weisj.jsvg.parser.ParsedElement;
import org.jetbrains.annotations.NotNull;

public interface StyleSheet {
  void forEachMatchingRule(@NotNull ParsedElement paramParsedElement, @NotNull RuleConsumer paramRuleConsumer);
  
  public static interface RuleConsumer {
    void applyRule(@NotNull StyleProperty param1StyleProperty);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\css\StyleSheet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */