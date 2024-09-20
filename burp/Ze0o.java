package burp;

import java.util.List;
import net.portswigger.Zkb;

public class Ze0o implements Zlvf {
  private final Ze3n Zn;
  
  private final byte[] Zp;
  
  private final byte[] ZB;
  
  private final Zzud Zl;
  
  private final int ZT;
  
  private final Zs2i ZF;
  
  public Ze0o(Ze3n paramZe3n, byte[] paramArrayOfbyte, Zzud paramZzud, Zs2i paramZs2i) {
    this(paramZe3n, Zkb.Zy(paramZe3n.ZN()), paramArrayOfbyte, paramZzud, -1, paramZs2i);
  }
  
  private Ze0o(Ze3n paramZe3n, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zzud paramZzud, int paramInt, Zs2i paramZs2i) {
    this.Zn = paramZe3n;
    this.Zp = paramArrayOfbyte1;
    this.ZB = paramArrayOfbyte2;
    this.Zl = paramZzud;
    this.ZT = paramInt;
    this.ZF = paramZs2i;
  }
  
  public Zs2i ZY() {
    return this.ZF;
  }
  
  public Zlvf Zm(int paramInt) {
    return new Ze0o(this.Zn, this.Zp, this.ZB, this.Zl, paramInt, this.ZF);
  }
  
  public Zzud Zd() {
    return ZM();
  }
  
  public Zzud ZM() {
    return this.Zl;
  }
  
  public <T> T Za(T paramT1, T paramT2) {
    return paramT1;
  }
  
  public Zmzk ZB() {
    return this.Zn.Za();
  }
  
  public byte[] ZD() {
    return this.Zp;
  }
  
  public Zei8 Zq(Zxcg<?> paramZxcg, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    return new Zt2w(paramZxcg, this.Zn.Zv((this.ZT == -1) ? this.Zn.Za() : ((Zefx)this.Zl.ZO().get(this.ZT)).ZT()).Zp(this.ZB).Zo((this.ZT == -1) ? this.Zl.ZT() : this.Zl.ZV().get(this.ZT)).ZK(paramList1).Z_(paramList2).ZF(this.Zl.Zx()));
  }
  
  public Zei8 Zl(Zxcg<?> paramZxcg, List<Zl1r> paramList1, List<Zl1r> paramList2, List<Zl1r> paramList3, List<Zl1r> paramList4) {
    paramList1.addAll(paramList3);
    paramList2.addAll(paramList4);
    return new Zt2w(paramZxcg, this.Zn.Zv((this.ZT == -1) ? this.Zn.Za() : ((Zefx)this.Zl.ZO().get(this.ZT)).ZT()).Zp(this.ZB).Zo((this.ZT == -1) ? this.Zl.ZT() : this.Zl.ZV().get(this.ZT)).ZK(paramList1).Z_(paramList2).ZF(this.Zl.Zx()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze0o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */