package net.portswigger.swagger.v3.core.jackson.mixin;

import com.fasterxml.Zqi;
import com.fasterxml.Zyx;
import com.fasterxml.Zzv;
import java.util.Map;

public abstract class DateSchemaMixin {
  @Zzv(Zb = Zqi.STRING, ZH = "yyyy-MM-dd")
  public abstract Object getExample();
  
  @Zyx
  public abstract Object getJsonSchemaImpl();
  
  @Zyx
  public abstract Map<String, Object> getJsonSchema();
  
  @Zyx
  public abstract Boolean getBooleanSchemaValue();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\core\jackson\mixin\DateSchemaMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */