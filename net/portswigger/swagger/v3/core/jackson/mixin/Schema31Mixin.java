package net.portswigger.swagger.v3.core.jackson.mixin;

import com.fasterxml.Zqg;
import com.fasterxml.Zv8;
import com.fasterxml.Zva;
import com.fasterxml.Zvm;
import com.fasterxml.Zw.Zv;
import com.fasterxml.Zy1;
import com.fasterxml.Zyi;
import com.fasterxml.Zyx;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

@Zva(value = {"type", "format", "if", "then", "else"}, Za = true)
public abstract class Schema31Mixin {
  @Zyx
  public abstract Map<String, Object> getJsonSchema();
  
  @Zyx
  public abstract Boolean getNullable();
  
  @Zyx
  public abstract Boolean getExclusiveMinimum();
  
  @Zyx
  public abstract Boolean getExclusiveMaximum();
  
  @Zy1("exclusiveMinimum")
  public abstract BigDecimal getExclusiveMinimumValue();
  
  @Zy1("exclusiveMaximum")
  public abstract BigDecimal getExclusiveMaximumValue();
  
  @Zyx
  public abstract String getType();
  
  @Zy1("type")
  @Zv(Zo = Schema31Mixin$TypeSerializer.class)
  public abstract Set<String> getTypes();
  
  @Zyi
  public abstract Map<String, Object> getExtensions();
  
  @Zv8
  public abstract void addExtension(String paramString, Object paramObject);
  
  @Zyx
  public abstract boolean getExampleSetFlag();
  
  @Zvm(value = Zqg.NON_NULL, Zg = Zqg.ALWAYS)
  public abstract Object getExample();
  
  @Zyx
  public abstract Object getJsonSchemaImpl();
  
  @Zyx
  public abstract Boolean getBooleanSchemaValue();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\core\jackson\mixin\Schema31Mixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */