package net.portswigger.swagger.v1.util;

import com.fasterxml.Zu.Zq;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.Path;
import net.portswigger.swagger.v1.models.Response;
import net.portswigger.swagger.v1.models.auth.SecuritySchemeDefinition;
import net.portswigger.swagger.v1.models.parameters.Parameter;
import net.portswigger.swagger.v1.models.properties.Property;

public class DeserializationModule extends Zq {
  public DeserializationModule(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1)
      ZZ(Path.class, new PathDeserializer()); 
    if (paramBoolean2)
      ZZ(Response.class, new ResponseDeserializer()); 
    ZZ(Property.class, new PropertyDeserializer());
    ZZ(Model.class, new ModelDeserializer());
    ZZ(Parameter.class, new ParameterDeserializer());
    ZZ(SecuritySchemeDefinition.class, new SecurityDefinitionDeserializer());
  }
  
  public DeserializationModule() {
    this(true, true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\DeserializationModule.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */