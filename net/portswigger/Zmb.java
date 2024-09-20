package net.portswigger;

import burp.Zbqc;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class Zmb {
  private final Deflater ZT = new Deflater(-1, true);
  
  private byte[] ZD;
  
  public void ZU(byte[] paramArrayOfbyte) {
    this.ZD = paramArrayOfbyte;
  }
  
  public byte[] Zd() throws Zgm {
    Zbqc[] arrayOfZbqc = Zhf.ZE();
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      try {
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, this.ZT);
        try {
          deflaterOutputStream.write(this.ZD, 0, this.ZD.length);
          deflaterOutputStream.close();
          byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
          deflaterOutputStream.close();
          byteArrayOutputStream.close();
          if (Zbqc.Zwu() == null)
            Zhf.ZP(new Zbqc[1]); 
          return arrayOfByte;
        } catch (Throwable throwable) {
          try {
            deflaterOutputStream.close();
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zmb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */