package net.portswigger.swagger.v3.core.jackson.mixin;

import com.fasterxml.Zv8;
import com.fasterxml.Zw.Zv;
import com.fasterxml.Zyi;
import java.util.Map;
import net.portswigger.swagger.v3.core.jackson.PathsSerializer;
import net.portswigger.swagger.v3.oas.models.Paths;

public abstract class OpenAPI31Mixin {
  @Zyi
  public abstract Map<String, Object> getExtensions();
  
  @Zv8
  public abstract void addExtension(String paramString, Object paramObject);
  
  @Zv(Zo = PathsSerializer.class)
  public abstract Paths getPaths();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\core\jackson\mixin\OpenAPI31Mixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */