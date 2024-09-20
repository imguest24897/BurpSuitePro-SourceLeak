package net.portswigger.swagger.v1.util;

import com.fasterxml.Zor.Zy6;
import net.portswigger.swagger.v1.models.RefModel;
import net.portswigger.swagger.v1.models.RefPath;
import net.portswigger.swagger.v1.models.RefResponse;
import net.portswigger.swagger.v1.models.parameters.RefParameter;
import net.portswigger.swagger.v1.models.properties.RefProperty;
import net.portswigger.swagger.v1.util.jackson.mixin.IgnoreOriginalRefMixin;
import net.portswigger.swagger.v1.util.jackson.mixin.OriginalRefMixin;

public abstract class ReferenceSerializationConfigurer {
  private static void serializeAs(Class<?> paramClass, Zy6 paramZy6) {
    paramZy6.Zx(RefModel.class, paramClass);
    paramZy6.Zx(RefProperty.class, paramClass);
    paramZy6.Zx(RefPath.class, paramClass);
    paramZy6.Zx(RefParameter.class, paramClass);
    paramZy6.Zx(RefResponse.class, paramClass);
  }
  
  public static void serializeAsOriginalRef() {
    serializeAs(OriginalRefMixin.class, Json.mapper());
    serializeAs(OriginalRefMixin.class, Yaml.mapper());
  }
  
  public static void serializeAsComputedRef() {
    serializeAs(IgnoreOriginalRefMixin.class, Json.mapper());
    serializeAs(IgnoreOriginalRefMixin.class, Yaml.mapper());
  }
  
  public static void serializeAsOriginalRef(Zy6 paramZy6) {
    serializeAs(OriginalRefMixin.class, paramZy6);
  }
  
  public static void serializeAsComputedRef(Zy6 paramZy6) {
    serializeAs(IgnoreOriginalRefMixin.class, paramZy6);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\ReferenceSerializationConfigurer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */