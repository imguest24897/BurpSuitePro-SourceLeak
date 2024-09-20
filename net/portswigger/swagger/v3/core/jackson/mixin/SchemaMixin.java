package net.portswigger.swagger.v3.core.jackson.mixin;

import com.fasterxml.Zqg;
import com.fasterxml.Zv8;
import com.fasterxml.Zvm;
import com.fasterxml.Zyi;
import com.fasterxml.Zyx;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.portswigger.swagger.v3.oas.models.media.Schema;

public abstract class SchemaMixin {
  private static boolean ZZ;
  
  @Zyi
  public abstract Map<String, Object> getExtensions();
  
  @Zv8
  public abstract void addExtension(String paramString, Object paramObject);
  
  @Zyx
  public abstract boolean getExampleSetFlag();
  
  @Zvm(value = Zqg.NON_NULL, Zg = Zqg.ALWAYS)
  public abstract Object getExample();
  
  @Zyx
  public abstract Map<String, Object> getJsonSchema();
  
  @Zyx
  public abstract BigDecimal getExclusiveMinimumValue();
  
  @Zyx
  public abstract BigDecimal getExclusiveMaximumValue();
  
  @Zyx
  public abstract Schema getContains();
  
  @Zyx
  public abstract String get$id();
  
  @Zyx
  public abstract String get$anchor();
  
  @Zyx
  public abstract String get$schema();
  
  @Zyx
  public abstract Set<String> getTypes();
  
  @Zyx
  public abstract Map<String, Schema> getPatternProperties();
  
  @Zyx
  public abstract Object getJsonSchemaImpl();
  
  @Zyx
  public abstract List<Schema> getPrefixItems();
  
  @Zyx
  public abstract String getContentEncoding();
  
  @Zyx
  public abstract String getContentMediaType();
  
  @Zyx
  public abstract Schema getContentSchema();
  
  @Zyx
  public abstract Schema getPropertyNames();
  
  @Zyx
  public abstract Object getUnevaluatedProperties();
  
  @Zyx
  public abstract Integer getMaxContains();
  
  @Zyx
  public abstract Integer getMinContains();
  
  @Zyx
  public abstract Schema getAdditionalItems();
  
  @Zyx
  public abstract Schema getUnevaluatedItems();
  
  @Zyx
  public abstract Schema getIf();
  
  @Zyx
  public abstract Schema getElse();
  
  @Zyx
  public abstract Schema getThen();
  
  @Zyx
  public abstract Map<String, Schema> getDependentSchemas();
  
  @Zyx
  public abstract Map<String, List<String>> getDependentRequired();
  
  @Zyx
  public abstract String get$comment();
  
  @Zyx
  public abstract List<Object> getExamples();
  
  @Zyx
  public abstract Object getConst();
  
  @Zyx
  public abstract Boolean getBooleanSchemaValue();
  
  public static void Zd(boolean paramBoolean) {
    ZZ = paramBoolean;
  }
  
  public static boolean ZC() {
    return ZZ;
  }
  
  public static boolean ZH() {
    boolean bool = ZC();
    return !bool;
  }
  
  static {
    if (!ZH())
      Zd(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\core\jackson\mixin\SchemaMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */