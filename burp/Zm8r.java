package burp;

import java.io.File;
import java.nio.MappedByteBuffer;

public class Zm8r implements Zggw {
  private final File ZV;
  
  private final int Zw;
  
  private final int Zi;
  
  Zm8r(File paramFile, int paramInt1, int paramInt2) {
    this.ZV = paramFile;
    this.Zw = paramInt1;
    this.Zi = paramInt2;
  }
  
  public Zzt5 Zj(MappedByteBuffer paramMappedByteBuffer) {
    Zzqa zzqa = new Zzqa(this.ZV, Long.MAX_VALUE, this.Zw, this.Zi, Zk9w.ON_CLOSE, Zlrc.Za);
    return new Zzt5(1, Long.MAX_VALUE, zzqa);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm8r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */