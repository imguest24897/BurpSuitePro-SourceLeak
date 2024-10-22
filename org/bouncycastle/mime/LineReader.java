package org.bouncycastle.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Strings;

class LineReader {
  private final InputStream src;
  
  private int lastC = -1;
  
  LineReader(InputStream paramInputStream) {
    this.src = paramInputStream;
  }
  
  String readLine() throws IOException {
    int i;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    if (this.lastC != -1) {
      if (this.lastC == 13)
        return ""; 
      i = this.lastC;
      this.lastC = -1;
    } else {
      i = this.src.read();
    } 
    while (i >= 0 && i != 13 && i != 10) {
      byteArrayOutputStream.write(i);
      i = this.src.read();
    } 
    if (i == 13) {
      int j = this.src.read();
      if (j != 10 && j >= 0)
        this.lastC = j; 
    } 
    return (i < 0) ? null : Strings.fromUTF8ByteArray(byteArrayOutputStream.toByteArray());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\LineReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */