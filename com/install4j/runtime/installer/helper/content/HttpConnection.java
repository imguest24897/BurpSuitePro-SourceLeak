package com.install4j.runtime.installer.helper.content;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public interface HttpConnection {
  void connect() throws IOException;
  
  URL getURL();
  
  InputStream getInputStream() throws IOException;
  
  InputStream getErrorStream() throws IOException;
  
  int getResponseCode() throws IOException;
  
  Map<String, List<String>> getHeaderFields();
  
  String getHeaderField(String paramString);
  
  String getContentEncoding();
  
  String getContentType();
  
  void setRequestMethod(String paramString) throws ProtocolException;
  
  void setFollowRedirects(boolean paramBoolean);
  
  void setRequestProperty(String paramString1, String paramString2);
  
  void addRequestProperty(String paramString1, String paramString2);
  
  void setDoOutput(long paramLong);
  
  OutputStream getOutputStream() throws IOException;
  
  void setUseCaches(boolean paramBoolean);
  
  void setConnectTimeout(int paramInt);
  
  void setReadTimeout(int paramInt);
  
  long getContentLengthLong();
  
  void close();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\HttpConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */