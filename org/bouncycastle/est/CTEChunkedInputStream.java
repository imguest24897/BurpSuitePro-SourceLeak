package org.bouncycastle.est;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CTEChunkedInputStream extends InputStream {
  private InputStream src;
  
  int chunkLen = 0;
  
  public CTEChunkedInputStream(InputStream paramInputStream) {
    this.src = paramInputStream;
  }
  
  private String readEOL() throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    while (true) {
      i = this.src.read();
      if (i == -1)
        return (byteArrayOutputStream.size() == 0) ? null : byteArrayOutputStream.toString().trim(); 
      byteArrayOutputStream.write(i & 0xFF);
      if (i == 10)
        return byteArrayOutputStream.toString().trim(); 
    } 
  }
  
  public int read() throws IOException {
    if (this.chunkLen == Integer.MIN_VALUE)
      return -1; 
    if (this.chunkLen == 0) {
      String str = null;
      do {
        str = readEOL();
      } while (str != null && str.length() == 0);
      if (str == null)
        return -1; 
      this.chunkLen = Integer.parseInt(str.trim(), 16);
      if (this.chunkLen == 0) {
        readEOL();
        this.chunkLen = Integer.MIN_VALUE;
        return -1;
      } 
    } 
    int i = this.src.read();
    this.chunkLen--;
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\est\CTEChunkedInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */