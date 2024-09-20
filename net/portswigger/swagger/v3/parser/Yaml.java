package net.portswigger.swagger.v3.parser;

import com.fasterxml.Zb.Zp;
import com.fasterxml.Zc.Zc;
import com.fasterxml.Zor.Zn;
import com.fasterxml.Zor.Zy6;

public class Yaml {
  static Zy6 mapper;
  
  public static Zy6 mapper() {
    if (mapper == null)
      mapper = ObjectMapperFactory.createYaml(); 
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
      System.out.println(pretty().ZP(paramObject));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\Yaml.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */