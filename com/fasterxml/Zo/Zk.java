package com.fasterxml.Zo;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zmi;
import com.fasterxml.Zor.Zy4;
import com.fasterxml.Zr.Zm;
import com.fasterxml.Zy4;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Zk {
  protected final InputStream Zb;
  
  protected final byte[] ZY;
  
  protected final int Zu;
  
  protected final int ZQ;
  
  protected final Zy4 Zh;
  
  protected final Zm ZR;
  
  protected Zk(InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, Zy4 paramZy4, Zm paramZm) {
    this.Zb = paramInputStream;
    this.ZY = paramArrayOfbyte;
    this.Zu = paramInt1;
    this.ZQ = paramInt2;
    this.Zh = paramZy4;
    this.ZR = paramZm;
  }
  
  public boolean Zk() {
    return (this.Zh != null);
  }
  
  public Zy4 ZU() {
    return this.Zh;
  }
  
  public Zg ZM() throws IOException {
    try {
      if (this.Zh == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zmi zmi = this.Zh.ZE();
    try {
      if (this.Zb == null)
        return zmi.Zr(this.ZY, this.Zu, this.ZQ); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return zmi.Zn(ZY());
  }
  
  public InputStream ZY() {
    return (InputStream)((this.Zb == null) ? new ByteArrayInputStream(this.ZY, this.Zu, this.ZQ) : new Zy4(null, this.Zb, this.ZY, this.Zu, this.ZQ));
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */