package burp;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.stream.Collectors;

class Zld implements Zg5o {
  private final boolean Zm;
  
  private List<Zges> ZE;
  
  private ByteBuffer Zb;
  
  Zld(boolean paramBoolean) {
    this.Zm = paramBoolean;
  }
  
  public void Zs(Zr6q paramZr6q) {
    byte[] arrayOfByte = paramZr6q.ZD();
    this.ZE = Zejx.ZV(Zsbj.ZD(arrayOfByte), this.Zm);
    int i = Math.max(0, Zsbj.Zc(arrayOfByte));
    this.Zb = (i < arrayOfByte.length) ? ByteBuffer.wrap(arrayOfByte, i, arrayOfByte.length - i) : ByteBuffer.wrap(Zbpm.ZY);
  }
  
  public void ZS(Zr6h paramZr6h) {
    this.ZE = (List<Zges>)paramZr6h.ZK().stream().map(Zld::lambda$visit$0).collect(Collectors.toList());
    this.Zb = ByteBuffer.wrap(paramZr6h.Zw());
  }
  
  boolean Zm() {
    return (this.Zb != null && this.Zb.hasRemaining());
  }
  
  private static Zges lambda$visit$0(Ztnz paramZtnz) {
    return new Zges(paramZtnz.Ze, paramZtnz.ZM);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zld.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */