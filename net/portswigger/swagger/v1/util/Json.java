package net.portswigger.swagger.v1.util;

import com.fasterxml.Zb.Zp;
import com.fasterxml.Zc.Zc;
import com.fasterxml.Zor.Zn;
import com.fasterxml.Zor.Zy6;

public class Json {
  private static Zy6 mapper;
  
  private static Zy6 pathMapper;
  
  private static Zy6 responseMapper;
  
  private static int Zx;
  
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
  
  protected static Zy6 pathMapper() {
    if (pathMapper == null)
      pathMapper = ObjectMapperFactory.createJson(false, true); 
    return pathMapper;
  }
  
  protected static Zy6 responseMapper() {
    if (responseMapper == null)
      responseMapper = ObjectMapperFactory.createJson(false, false); 
    return responseMapper;
  }
  
  public static void ZP(int paramInt) {
    Zx = paramInt;
  }
  
  public static int Zu() {
    return Zx;
  }
  
  public static int ZQ() {
    int i = Zu();
    return (i == 0) ? 37 : 0;
  }
  
  static {
    if (ZQ() != 0)
      ZP(33); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\Json.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */