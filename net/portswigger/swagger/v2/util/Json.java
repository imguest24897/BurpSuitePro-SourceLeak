package net.portswigger.swagger.v2.util;

import com.fasterxml.Zb.Zmt;
import com.fasterxml.Zb.Zp;
import com.fasterxml.Zc.Zc;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zn;
import com.fasterxml.Zor.Zy6;
import java.util.Map;

public class Json {
  private static Zy6 mapper;
  
  public static Zy6 mapper() {
    if (mapper == null)
      mapper = ObjectMapperFactory.createJson(); 
    return mapper;
  }
  
  public static Zn pretty() {
    return mapper().ZD((Zp)new Zc());
  }
  
  public static String pretty(Object paramObject) {
    try {
      return pretty().ZP(paramObject);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public static void prettyPrint(Object paramObject) {
    try {
      System.out.println(pretty().ZP(paramObject).replace("\r", ""));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static Map<String, Object> jsonSchemaAsMap(Zb paramZb) {
    try {
      return (Map<String, Object>)mapper().Za(mapper().ZA(paramZb), Map.class);
    } catch (Zmt zmt) {
      return null;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\Json.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */