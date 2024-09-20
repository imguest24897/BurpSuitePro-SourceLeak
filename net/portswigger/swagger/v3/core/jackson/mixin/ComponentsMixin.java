package net.portswigger.swagger.v3.core.jackson.mixin;

import com.fasterxml.Zv8;
import com.fasterxml.Zw.Zv;
import com.fasterxml.Zyi;
import com.fasterxml.Zyx;
import java.util.Map;
import net.portswigger.swagger.v3.core.jackson.CallbackSerializer;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;

public abstract class ComponentsMixin {
  @Zyi
  public abstract Map<String, Object> getExtensions();
  
  @Zv8
  public abstract void addExtension(String paramString, Object paramObject);
  
  @Zv(Zu = CallbackSerializer.class)
  public abstract Map<String, Callback> getCallbacks();
  
  @Zyx
  public abstract Map<String, PathItem> getPathItems();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\core\jackson\mixin\ComponentsMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */