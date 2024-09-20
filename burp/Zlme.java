package burp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zlme {
  private final Zxgd Zl;
  
  private final int ZJ;
  
  private final List<Zmp> ZV;
  
  private final Zg3d Zb;
  
  private final List<Ze75> Zq;
  
  private static int ZS;
  
  private Zlme(Zxgd paramZxgd, int paramInt, List<Zmp> paramList, Zg3d paramZg3d, List<Ze75> paramList1) {
    this.Zl = paramZxgd;
    this.ZJ = paramInt;
    this.ZV = paramList;
    this.Zb = paramZg3d;
    this.Zq = paramList1;
  }
  
  static Zlme Zf() {
    return new Zlme(Zxgd.ZZ(), 0, Collections.emptyList(), null, Collections.emptyList());
  }
  
  Zlme Zy(Zeni paramZeni, Zg3d paramZg3d) {
    Zxgd zxgd = this.Zl.ZY(paramZeni.ZY());
    int j = this.ZJ | paramZeni.Zz();
    LinkedList<Zmp> linkedList = new LinkedList<>(this.ZV);
    Objects.requireNonNull(paramZeni);
    linkedList.add(paramZeni::Zy);
    Zg3d zg3d = paramZg3d;
    LinkedList<Ze75> linkedList1 = new LinkedList<>(this.Zq);
    int i = ZP();
    Objects.requireNonNull(paramZeni);
    linkedList1.add(paramZeni::Zj);
    if (i == 0)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zlme(zxgd, j, linkedList, zg3d, linkedList1);
  }
  
  Zxgd Za() {
    return this.Zl;
  }
  
  public int ZR() {
    return this.ZJ;
  }
  
  public List<Zl1r> ZT(Ze3n paramZe3n) {
    return (List<Zl1r>)this.ZV.stream().flatMap(paramZe3n::lambda$getBaseRequestHighlightBuilders$0).collect(Collectors.toList());
  }
  
  public Optional<Zvow> ZN(Ze3n paramZe3n) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zb : Lburp/Zg3d;
    //   4: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   7: aload_0
    //   8: aload_1
    //   9: <illegal opcode> apply : (Lburp/Zlme;Lburp/Ze3n;)Ljava/util/function/Function;
    //   14: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   17: areturn
  }
  
  private Zvow lambda$getReportableIssuedRequestResponse$3(Ze3n paramZe3n, Zg3d paramZg3d) {
    return paramZe3n.ZI().ZC(paramZg3d.ZR()).Zu((paramZg3d.Ze() == null) ? null : paramZg3d.Ze().Za()).ZK(Zex2.ZT(paramZg3d.ZR(), this::lambda$getReportableIssuedRequestResponse$2)).Zj(false);
  }
  
  private List lambda$getReportableIssuedRequestResponse$2(Zr6q paramZr6q) {
    return (List)this.Zq.stream().flatMap(paramZr6q::lambda$getReportableIssuedRequestResponse$1).collect(Collectors.toList());
  }
  
  private static Stream lambda$getReportableIssuedRequestResponse$1(Zr6q paramZr6q, Ze75 paramZe75) {
    return paramZe75.apply(paramZr6q).stream();
  }
  
  private static Stream lambda$getBaseRequestHighlightBuilders$0(Ze3n paramZe3n, Zmp paramZmp) {
    return paramZmp.apply(paramZe3n).stream();
  }
  
  public static void ZE(int paramInt) {
    ZS = paramInt;
  }
  
  public static int ZP() {
    return ZS;
  }
  
  public static int Zg() {
    int i = ZP();
    return (i == 0) ? 126 : 0;
  }
  
  static {
    if (ZP() == 0)
      ZE(104); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlme.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */