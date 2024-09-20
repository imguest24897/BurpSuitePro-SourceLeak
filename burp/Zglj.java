package burp;

import java.util.List;
import net.portswigger.Zkb;

public class Zglj implements Zlvf {
  private final byte[] Zd;
  
  private final Ze3n Zp;
  
  private final Zs2i ZX;
  
  private final Zzud Zw;
  
  private final byte[] ZU;
  
  private final Ze3n Zh;
  
  private final Zzud Za;
  
  private final byte[] Z_;
  
  private final int ZJ;
  
  public Zglj(byte[] paramArrayOfbyte, Ze3n paramZe3n1, Zs2i paramZs2i, Zzud paramZzud1, Ze3n paramZe3n2, Zzud paramZzud2) {
    this(paramArrayOfbyte, paramZe3n1, paramZs2i, paramZzud1, paramZe3n2, paramZzud2, -1);
  }
  
  private Zglj(byte[] paramArrayOfbyte, Ze3n paramZe3n1, Zs2i paramZs2i, Zzud paramZzud1, Ze3n paramZe3n2, Zzud paramZzud2, int paramInt) {
    this.Zd = paramArrayOfbyte;
    this.Zp = paramZe3n1;
    this.ZX = paramZs2i;
    this.Zw = paramZzud1;
    this.Zh = paramZe3n2;
    this.Za = paramZzud2;
    this.ZJ = paramInt;
    this.ZU = Zkb.Zy(paramZe3n1.ZN());
    this.Z_ = Zkb.Zy(paramZe3n2.ZN());
  }
  
  public Zlvf Zm(int paramInt) {
    return new Zglj(this.Zd, this.Zp, this.ZX, this.Zw, this.Zh, this.Za, paramInt);
  }
  
  public Zs2i ZY() {
    return this.ZX;
  }
  
  public Zzud Zd() {
    return this.Zw;
  }
  
  public Zzud ZM() {
    return this.Za;
  }
  
  public <T> T Za(T paramT1, T paramT2) {
    return paramT2;
  }
  
  public Zmzk ZB() {
    return this.Zp.Za();
  }
  
  public byte[] ZD() {
    return this.ZU;
  }
  
  public Zei8<Zrp9> Zq(Zxcg<?> paramZxcg, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    String str = Zlp5.ZA();
    Zvow zvow = this.Zp.ZI().Zp(this.Zd).ZK(paramList1);
    if (this.Zw != null)
      zvow = zvow.Zo(this.Zw.ZT()).ZF(this.Zw.Zx()); 
    if (Zbqc.Zwu() == null)
      Zlp5.ZC("mTVmi"); 
    return new Zm1m(paramZxcg, zvow, this.Zh.Zv((this.ZJ == -1) ? this.Zh.Za() : ((Zefx)this.Za.ZO().get(this.ZJ)).ZT()).ZC(this.Za.Z_()).Zo((this.ZJ == -1) ? this.Za.ZT() : this.Za.ZV().get(this.ZJ)).Z_(paramList2).ZF(this.Za.Zx()), this.ZU, this.Z_);
  }
  
  public Zei8<Zrp9> Zl(Zxcg<?> paramZxcg, List<Zl1r> paramList1, List<Zl1r> paramList2, List<Zl1r> paramList3, List<Zl1r> paramList4) {
    String str = Zlp5.ZA();
    if (str != null)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zm1m(paramZxcg, this.Zp.ZI().Zp(this.Zd).Zo(this.Zw.ZT()).ZK(paramList1).Z_(paramList2).ZF(this.Zw.Zx()), this.Zh.Zv((this.ZJ == -1) ? this.Zh.Za() : ((Zefx)this.Za.ZO().get(this.ZJ)).ZT()).ZC(this.Za.Z_()).Zo((this.ZJ == -1) ? this.Za.ZT() : this.Za.ZV().get(this.ZJ)).ZK(paramList3).Z_(paramList4).ZF(this.Za.Zx()), this.ZU, this.Z_);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zglj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */