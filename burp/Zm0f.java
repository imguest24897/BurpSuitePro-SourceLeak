package burp;

import java.util.List;
import net.portswigger.Zoq;

public class Zm0f {
  private final List<Zg8y> Z_;
  
  private final Zlat Zt;
  
  private final Zoq<Zbj5> Zl;
  
  private static int[] Zc;
  
  private Zm0f(Zlat paramZlat, List<Zg8y> paramList, Zoq<Zbj5> paramZoq) {
    this.Zt = paramZlat;
    this.Z_ = paramList;
    this.Zl = paramZoq;
  }
  
  public Zlat Zl() {
    return this.Zt;
  }
  
  public List<Zg8y> ZQ() {
    return this.Z_;
  }
  
  public Zbj5 ZI() {
    return (Zbj5)this.Zl.Zz();
  }
  
  private static Zbj5 Zj(Zz36 paramZz36, Zlat paramZlat, List<Zg8y> paramList) {
    Zkmn zkmn = paramZz36.Za();
    Zmvb zmvb = paramZz36.Zr();
    Ze5n ze5n = paramZlat.ZQ();
    Zlk0 zlk0 = Zlk0.ZK(Ze0_.ZW(paramList));
    return Zbj5.Zo(zkmn, zmvb, ze5n, zlk0.Zg(), 0);
  }
  
  public static Zm0f Zd(Zz36 paramZz36, Zlat paramZlat, List<Zg8y> paramList) {
    // Byte code:
    //   0: invokestatic Zf : ()[I
    //   3: astore_3
    //   4: new burp/Zm0f
    //   7: dup
    //   8: aload_1
    //   9: aload_2
    //   10: aload_0
    //   11: aload_1
    //   12: aload_2
    //   13: <illegal opcode> get : (Lburp/Zz36;Lburp/Zlat;Ljava/util/List;)Ljava/util/function/Supplier;
    //   18: invokestatic ZZ : (Ljava/util/function/Supplier;)Lnet/portswigger/Zoq;
    //   21: invokespecial <init> : (Lburp/Zlat;Ljava/util/List;Lnet/portswigger/Zoq;)V
    //   24: invokestatic Zwu : ()[Lburp/Zbqc;
    //   27: ifnonnull -> 36
    //   30: iconst_4
    //   31: newarray int
    //   33: invokestatic ZE : ([I)V
    //   36: areturn
  }
  
  private static Zbj5 lambda$agentOutcomeFrom$0(Zz36 paramZz36, Zlat paramZlat, List<Zg8y> paramList) {
    return Zj(paramZz36, paramZlat, paramList);
  }
  
  public static void ZE(int[] paramArrayOfint) {
    Zc = paramArrayOfint;
  }
  
  public static int[] Zf() {
    return Zc;
  }
  
  static {
    if (Zf() == null)
      ZE(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm0f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */