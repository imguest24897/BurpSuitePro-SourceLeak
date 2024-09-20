package net.portswigger.swagger.v3.core.jackson.mixin;

import com.fasterxml.Zv8;
import com.fasterxml.Zvm;
import com.fasterxml.Zw.Zv;
import com.fasterxml.Zyi;
import com.fasterxml.Zyx;
import java.util.Map;
import net.portswigger.swagger.v3.core.jackson.PathsSerializer;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.Paths;

public abstract class OpenAPIMixin {
  @Zyi
  @Zvm
  public abstract Map<String, Object> getExtensions();
  
  @Zv8
  public abstract void addExtension(String paramString, Object paramObject);
  
  @Zv(Zo = PathsSerializer.class)
  public abstract Paths getPaths();
  
  @Zyx
  public abstract Map<String, PathItem> getWebhooks();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\core\jackson\mixin\OpenAPIMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */