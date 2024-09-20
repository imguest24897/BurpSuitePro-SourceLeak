package net.portswigger.swagger.v1.util.jackson.mixin;

import com.fasterxml.Zyl;
import com.fasterxml.Zyx;

public abstract class OriginalRefMixin {
  @Zyx
  public abstract String get$ref();
  
  @Zyl("$ref")
  public abstract String getOriginalRef();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\jackson\mixin\OriginalRefMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */