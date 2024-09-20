package com.install4j.runtime.installer.platform.win32.wininet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface WinInetCall extends AutoCloseable {
  int getResponseCode() throws IOException;
  
  @Nullable
  String getResponseMessage() throws IOException;
  
  @Nullable
  String getLastHeader(String paramString);
  
  @NotNull
  List<String> getHeaders(String paramString);
  
  @NotNull
  Map<String, List<String>> getAllHeaders();
  
  @Nullable
  OutputStream getOutputStream() throws IOException;
  
  @NotNull
  InputStream getInputStream() throws IOException;
  
  void close();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\wininet\WinInetCall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */