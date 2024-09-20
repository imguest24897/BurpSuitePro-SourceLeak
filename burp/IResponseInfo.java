package burp;

import java.util.List;

public interface IResponseInfo {
  List<String> getHeaders();
  
  int getBodyOffset();
  
  short getStatusCode();
  
  List<ICookie> getCookies();
  
  String getStatedMimeType();
  
  String getInferredMimeType();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IResponseInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */