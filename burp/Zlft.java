package burp;

import java.net.UnknownHostException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

abstract class Zlft extends Zlfr {
  private final Zbnt Zj;
  
  protected final byte Zt;
  
  private final byte[] ZS;
  
  private final short ZY;
  
  private Zm82 ZE;
  
  private Zzv5 Zw;
  
  private Zmzk ZN;
  
  private Zrc5 Zl;
  
  private int ZL;
  
  private int ZU;
  
  Zlft(byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, short paramShort, Zbnt paramZbnt) {
    super(paramByte1, paramArrayOfbyte1);
    this.Zt = paramByte2;
    this.ZS = paramArrayOfbyte2;
    this.ZY = paramShort;
    this.Zj = paramZbnt;
  }
  
  public void Zz(Zm82 paramZm82, Zzv5 paramZzv5) {
    this.ZE = paramZm82;
    this.Zw = paramZzv5;
    this.ZN = paramZm82.Zt();
    if (this.Zl == null)
      this.Zl = paramZm82.ZC(Zkb.ZG(this.ZD)); 
  }
  
  boolean ZL() {
    byte b = this.ZE.Zf();
    switch (b) {
      case 1:
        return true;
      case 2:
      case 3:
        return false;
    } 
    Zuh.Zv(false, Zqf.Zr, b);
    return true;
  }
  
  public int Zi() {
    return this.ZL;
  }
  
  boolean ZS(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    Zbqc[] arrayOfZbqc = Zm82.Zb();
    byte b = 0;
    while (b < paramArrayOfbyte1.length) {
      try {
        if (paramArrayOfbyte1[b] == 32)
          paramArrayOfbyte1[b] = 43; 
      } catch (UnknownHostException unknownHostException) {
        throw a(null);
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    Zax zax = new Zax(this.ZN, Zv(this.Zt, this.ZD, this.ZS, paramArrayOfbyte1, paramArrayOfbyte2));
    try {
      switch (this.Zt) {
        case 0:
          try {
            if (this.ZE.ZL(zax))
              return true; 
          } catch (UnknownHostException unknownHostException) {
            throw a(null);
          } 
          break;
        case 1:
          try {
            if (this.ZE.Zx(zax))
              return true; 
          } catch (UnknownHostException unknownHostException) {
            throw a(null);
          } 
          break;
        default:
          Zuh.Zv(false, Zqf.Zk, this.Zt);
          break;
      } 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    try {
      byte[] arrayOfByte1 = this.ZE.Zb(zax).ZiD();
      this.ZL++;
      Zg3d zg3d = this.ZE.Zg(this.ZN, arrayOfByte1);
      if (zg3d.Zb() == Zvom.STREAMING_RESPONSE)
        return false; 
      this.ZU = 0;
      arrayOfByte1 = zg3d.ZR().ZD();
      try {
      
      } catch (UnknownHostException unknownHostException) {
        throw a(null);
      } 
      byte[] arrayOfByte2 = (zg3d.Ze() == null) ? null : zg3d.Ze().Za().ZiD();
      this.ZE.Zm(this);
      Zz1p zz1p = Zekx.Zu(this.ZN, arrayOfByte1, (byte)1, this.Zj);
      Zs68 zs68 = Zmre.ZK(zz1p, arrayOfByte2, Zt0k.HTML_ANALYSIS, this.Zj);
      byte b1 = this.Zl.ZI(this.Zt, this.ZD, this.ZS, paramArrayOfbyte2, zz1p.Zo, zs68, Zyf.Zy(arrayOfByte2));
      if (b1 != 1)
        return false; 
      this.ZE.Zv(zax, arrayOfByte1, arrayOfByte2, zz1p, zs68, this.ZY);
      return true;
    } catch (UnknownHostException unknownHostException) {
      Zah.Zl(unknownHostException, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZR = true;
      return false;
    } catch (Zxxv zxxv) {
      try {
        Zah.Zl(zxxv, Zk_.COMMON_RUNTIME_FAILURE);
        this.ZU++;
        if (this.ZU >= this.Zw.ZR()) {
          Zmgc.ABANDONED_TASK.ZK(this.ZE.Zk(), new Object[] { Zkb.ZG(this.ZD), this });
          this.ZR = true;
        } 
      } catch (UnknownHostException unknownHostException) {
        throw a(null);
      } 
      return false;
    } 
  }
  
  static byte[] Zv(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    byte[] arrayOfByte = null;
    try {
      try {
        int i;
        switch (paramByte) {
          case 0:
            if (paramArrayOfbyte4 == null) {
              arrayOfByte = new byte[paramArrayOfbyte1.length + paramArrayOfbyte3.length + paramArrayOfbyte2.length];
              try {
                System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
                System.arraycopy(paramArrayOfbyte3, 0, arrayOfByte, paramArrayOfbyte1.length, paramArrayOfbyte3.length);
                if (paramArrayOfbyte2.length > 0)
                  System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, paramArrayOfbyte1.length + paramArrayOfbyte3.length, paramArrayOfbyte2.length); 
              } catch (Exception exception) {
                throw a(null);
              } 
            } else {
              arrayOfByte = new byte[paramArrayOfbyte1.length + paramArrayOfbyte3.length + 1 + paramArrayOfbyte4.length + paramArrayOfbyte2.length];
              System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
              System.arraycopy(paramArrayOfbyte3, 0, arrayOfByte, paramArrayOfbyte1.length, paramArrayOfbyte3.length);
              int j = paramArrayOfbyte1.length + paramArrayOfbyte3.length;
              arrayOfByte[j] = 46;
              System.arraycopy(paramArrayOfbyte4, 0, arrayOfByte, ++j, paramArrayOfbyte4.length);
              if (paramArrayOfbyte2.length > 0) {
                j += paramArrayOfbyte4.length;
                System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, j, paramArrayOfbyte2.length);
              } 
            } 
            return arrayOfByte;
          case 1:
            arrayOfByte = new byte[paramArrayOfbyte1.length + paramArrayOfbyte3.length + 1 + paramArrayOfbyte2.length];
            System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
            System.arraycopy(paramArrayOfbyte3, 0, arrayOfByte, paramArrayOfbyte1.length, paramArrayOfbyte3.length);
            i = paramArrayOfbyte1.length + paramArrayOfbyte3.length;
            try {
              arrayOfByte[i] = 47;
              if (paramArrayOfbyte2.length > 0)
                System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, i + 1, paramArrayOfbyte2.length); 
            } catch (Exception exception) {
              throw a(null);
            } 
            return arrayOfByte;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      Zuh.Zv(false, Zqf.Zk, paramByte);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return arrayOfByte;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlft.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */