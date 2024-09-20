package burp;

import java.net.URL;

public interface IHttpRequestResponse {
  byte[] getRequest();
  
  void setRequest(byte[] paramArrayOfbyte);
  
  byte[] getResponse();
  
  void setResponse(byte[] paramArrayOfbyte);
  
  String getComment();
  
  void setComment(String paramString);
  
  String getHighlight();
  
  void setHighlight(String paramString);
  
  IHttpService getHttpService();
  
  void setHttpService(IHttpService paramIHttpService);
  
  @Deprecated
  String getHost();
  
  @Deprecated
  int getPort();
  
  @Deprecated
  String getProtocol();
  
  @Deprecated
  void setHost(String paramString);
  
  @Deprecated
  void setPort(int paramInt);
  
  @Deprecated
  void setProtocol(String paramString);
  
  @Deprecated
  URL getUrl();
  
  @Deprecated
  short getStatusCode();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IHttpRequestResponse.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */