package net.portswigger.swagger.v3.core.jackson.mixin;

import com.fasterxml.Zqg;
import com.fasterxml.Zv8;
import com.fasterxml.Zvm;
import com.fasterxml.Zyi;
import com.fasterxml.Zyx;
import java.util.Map;

public abstract class MediaTypeMixin {
  @Zyi
  public abstract Map<String, Object> getExtensions();
  
  @Zv8
  public abstract void addExtension(String paramString, Object paramObject);
  
  @Zyx
  public abstract boolean getExampleSetFlag();
  
  @Zvm(value = Zqg.NON_NULL, Zg = Zqg.ALWAYS)
  public abstract Object getExample();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\core\jackson\mixin\MediaTypeMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */