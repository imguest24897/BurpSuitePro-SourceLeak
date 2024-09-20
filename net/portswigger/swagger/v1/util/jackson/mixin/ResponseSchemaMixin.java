package net.portswigger.swagger.v1.util.jackson.mixin;

import com.fasterxml.Zvi;
import com.fasterxml.Zyl;
import com.fasterxml.Zyx;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.properties.Property;

public abstract class ResponseSchemaMixin {
  private static int[] Zz;
  
  @Zyx
  public abstract Property getSchema();
  
  @Zyx
  public abstract void setSchema(Property paramProperty);
  
  @Zyl("schema")
  public abstract Model getResponseSchema();
  
  @Zvi("schema")
  public abstract void setResponseSchema(Model paramModel);
  
  public static void Zs(int[] paramArrayOfint) {
    Zz = paramArrayOfint;
  }
  
  public static int[] Zd() {
    return Zz;
  }
  
  static {
    if (Zd() == null)
      Zs(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\jackson\mixin\ResponseSchemaMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */