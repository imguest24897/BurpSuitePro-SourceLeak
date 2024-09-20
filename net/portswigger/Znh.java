package net.portswigger;

import burp.Zbqc;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

public class Znh {
  private final int Zp;
  
  private final Inflater ZY;
  
  private byte[] Zy;
  
  public Znh(int paramInt) {
    this.Zp = paramInt;
    this.ZY = new Inflater(true);
  }
  
  public void Zc(byte[] paramArrayOfbyte) {
    this.Zy = paramArrayOfbyte;
  }
  
  public byte[] Zw() throws Zgm {
    Zbqc[] arrayOfZbqc = Zhf.ZE();
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      try {
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream, this.ZY, this.Zp);
        try {
          inflaterOutputStream.write(this.Zy, 0, this.Zy.length);
          inflaterOutputStream.flush();
          byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
          inflaterOutputStream.close();
          byteArrayOutputStream.close();
          if (arrayOfZbqc == null)
            Zbqc.Zr(new Zbqc[3]); 
          return arrayOfByte;
        } catch (Throwable throwable) {
          try {
            inflaterOutputStream.close();
          } catch (Throwable throwable1) {
            throwable.addSuppressed(throwable1);
          } 
          throw throwable;
        } 
      } catch (Throwable throwable) {
        try {
          byteArrayOutputStream.close();
        } catch (Throwable throwable1) {
          throwable.addSuppressed(throwable1);
        } 
        throw throwable;
      } 
    } catch (IOException iOException) {
      throw new Zgm(iOException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Znh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */