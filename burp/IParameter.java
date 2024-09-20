package burp;

public interface IParameter {
  public static final byte PARAM_URL = 0;
  
  public static final byte PARAM_BODY = 1;
  
  public static final byte PARAM_COOKIE = 2;
  
  public static final byte PARAM_XML = 3;
  
  public static final byte PARAM_XML_ATTR = 4;
  
  public static final byte PARAM_MULTIPART_ATTR = 5;
  
  public static final byte PARAM_JSON = 6;
  
  byte getType();
  
  String getName();
  
  String getValue();
  
  int getNameStart();
  
  int getNameEnd();
  
  int getValueStart();
  
  int getValueEnd();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IParameter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */