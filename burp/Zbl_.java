package burp;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.stream.Collectors;

class Zbl_ implements Zg5o {
  private final boolean ZT;
  
  private List<Zges> Zp;
  
  private ByteBuffer Zu;
  
  Zbl_(boolean paramBoolean) {
    this.ZT = paramBoolean;
  }
  
  public void Zs(Zr6q paramZr6q) {
    byte[] arrayOfByte = paramZr6q.ZD();
    this.Zp = Zejx.ZV(Zsbj.ZD(arrayOfByte), this.ZT);
    int i = Math.max(0, Zsbj.Zc(arrayOfByte));
    this.Zu = (i < arrayOfByte.length) ? ByteBuffer.wrap(arrayOfByte, i, arrayOfByte.length - i) : ByteBuffer.wrap(Zsuj.Zc);
  }
  
  public void ZS(Zr6h paramZr6h) {
    this.Zp = (List<Zges>)paramZr6h.ZK().stream().map(Zbl_::lambda$visit$0).collect(Collectors.toList());
    this.Zu = ByteBuffer.wrap(paramZr6h.Zw());
  }
  
  boolean ZY() {
    return (this.Zu != null && this.Zu.hasRemaining());
  }
  
  private static Zges lambda$visit$0(Ztnz paramZtnz) {
    return new Zges(paramZtnz.Ze, paramZtnz.ZM);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbl_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */