package burp;

import java.net.URL;
import java.util.List;

public interface IRequestInfo {
  public static final byte CONTENT_TYPE_NONE = 0;
  
  public static final byte CONTENT_TYPE_URL_ENCODED = 1;
  
  public static final byte CONTENT_TYPE_MULTIPART = 2;
  
  public static final byte CONTENT_TYPE_XML = 3;
  
  public static final byte CONTENT_TYPE_JSON = 4;
  
  public static final byte CONTENT_TYPE_AMF = 5;
  
  public static final byte CONTENT_TYPE_UNKNOWN = -1;
  
  String getMethod();
  
  URL getUrl();
  
  List<String> getHeaders();
  
  List<IParameter> getParameters();
  
  int getBodyOffset();
  
  byte getContentType();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IRequestInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */