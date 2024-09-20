package com.github.weisj.jsvg.parser;

import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface DomProcessor {
  void process(@NotNull ParsedElement paramParsedElement);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\DomProcessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */