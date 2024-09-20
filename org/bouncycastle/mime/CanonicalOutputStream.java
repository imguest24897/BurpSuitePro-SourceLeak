package org.bouncycastle.mime;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.mime.smime.SMimeParserContext;

public class CanonicalOutputStream extends FilterOutputStream {
  protected int lastb = -1;
  
  protected static byte[] newline = new byte[2];
  
  private final boolean is7Bit;
  
  public CanonicalOutputStream(SMimeParserContext paramSMimeParserContext, Headers paramHeaders, OutputStream paramOutputStream) {
    super(paramOutputStream);
    if (paramHeaders.getContentType() != null) {
      this.is7Bit = (paramHeaders.getContentType() != null && !paramHeaders.getContentType().equals("binary"));
    } else {
      this.is7Bit = paramSMimeParserContext.getDefaultContentTransferEncoding().equals("7bit");
    } 
  }
  
  public void write(int paramInt) throws IOException {
    if (this.is7Bit) {
      if (paramInt == 13) {
        this.out.write(newline);
      } else if (paramInt == 10) {
        if (this.lastb != 13)
          this.out.write(newline); 
      } else {
        this.out.write(paramInt);
      } 
    } else {
      this.out.write(paramInt);
    } 
    this.lastb = paramInt;
  }
  
  public void write(byte[] paramArrayOfbyte) throws IOException {
    write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    for (int i = paramInt1; i != paramInt1 + paramInt2; i++)
      write(paramArrayOfbyte[i]); 
  }
  
  public void writeln() throws IOException {
    this.out.write(newline);
  }
  
  static {
    newline[0] = 13;
    newline[1] = 10;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\CanonicalOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */