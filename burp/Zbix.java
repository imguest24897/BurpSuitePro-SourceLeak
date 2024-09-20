package burp;

import java.io.File;
import java.nio.MappedByteBuffer;

public class Zbix implements Zggw {
  private final Zrnb ZT;
  
  private final File ZL;
  
  private final int Zl;
  
  private final int ZM;
  
  private final Zlrc Zp;
  
  private final Zk9w Zo;
  
  Zbix(Zrnb paramZrnb, File paramFile, int paramInt1, int paramInt2, Zlrc paramZlrc, Zk9w paramZk9w) {
    this.ZT = paramZrnb;
    this.ZL = paramFile;
    this.Zl = paramInt1;
    this.ZM = paramInt2;
    this.Zp = paramZlrc;
    this.Zo = paramZk9w;
  }
  
  public Zzt5 Zj(MappedByteBuffer paramMappedByteBuffer) throws Zev3 {
    Zz59.Zf(paramMappedByteBuffer, this.ZT, this.ZL);
    long l1 = paramMappedByteBuffer.getLong(48);
    long l2 = paramMappedByteBuffer.getLong(56);
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    try {
      if (l1 >= 0L)
        try {
          if (l2 >= 0L) {
            Zzqa zzqa = new Zzqa(this.ZL, l1, this.Zl, this.ZM, this.Zo, this.Zp);
            zzqa.ZK(paramMappedByteBuffer, this.ZT);
            int i = (int)(l2 / l1);
            try {
              if (l2 > i * l1)
                i++; 
            } catch (Zev3 zev3) {
              throw a(null);
            } 
            try {
              if (arrayOfZbqc != null)
                Zbqc.Zr(new Zbqc[2]); 
            } catch (Zev3 zev3) {
              throw a(null);
            } 
            return new Zzt5(i, l1, zzqa);
          } 
          throw new Zev1(this.ZL);
        } catch (Zev3 zev3) {
          throw a(null);
        }  
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    throw new Zev1(this.ZL);
  }
  
  private static Zev3 a(Zev3 paramZev3) {
    return paramZev3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbix.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */