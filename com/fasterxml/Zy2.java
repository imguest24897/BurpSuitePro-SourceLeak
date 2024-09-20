package com.fasterxml;

import com.fasterxml.Zc.Zg;
import com.fasterxml.Zc.Zl;
import com.fasterxml.Zc.Zo;
import java.io.IOException;
import java.io.Writer;

public final class Zy2 extends Writer implements Zl {
  private final Zg ZT;
  
  public Zy2(Zo paramZo) {
    this.ZT = new Zg(paramZo);
  }
  
  public Zo ZT() {
    return this.ZT.ZC();
  }
  
  public Writer append(char paramChar) throws IOException {
    write(paramChar);
    return this;
  }
  
  public Writer append(CharSequence paramCharSequence) throws IOException {
    String str = paramCharSequence.toString();
    this.ZT.Zn(str, 0, str.length());
    return this;
  }
  
  public Writer append(CharSequence paramCharSequence, int paramInt1, int paramInt2) throws IOException {
    String str = paramCharSequence.subSequence(paramInt1, paramInt2).toString();
    this.ZT.Zn(str, 0, str.length());
    return this;
  }
  
  public void close() {}
  
  public void flush() {}
  
  public void write(char[] paramArrayOfchar) throws IOException {
    this.ZT.Zx(paramArrayOfchar, 0, paramArrayOfchar.length);
  }
  
  public void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    this.ZT.Zx(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  public void write(int paramInt) throws IOException {
    this.ZT.ZA((char)paramInt);
  }
  
  public void write(String paramString) throws IOException {
    this.ZT.Zn(paramString, 0, paramString.length());
  }
  
  public void write(String paramString, int paramInt1, int paramInt2) throws IOException {
    this.ZT.Zn(paramString, paramInt1, paramInt2);
  }
  
  public String Zb() throws IOException {
    String str = this.ZT.ZK();
    this.ZT.Zw();
    return str;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */