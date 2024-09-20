package burp;

import java.util.List;
import java.util.stream.Collectors;

public class Zraa implements Zm7j {
  private final Zkcl ZF;
  
  private final Zl34 ZU;
  
  private final Zr_4 ZC;
  
  private Zl_v Zg;
  
  public Zraa(Zkcl paramZkcl, Zl34 paramZl34, Zr_4 paramZr_4) {
    this.ZF = paramZkcl;
    this.ZU = paramZl34;
    this.ZC = paramZr_4;
  }
  
  public void Zz(Zl_v paramZl_v) {
    this.Zg = paramZl_v;
  }
  
  public void Zm(Ze0 paramZe0) {
    // Byte code:
    //   0: invokestatic Zk : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: aload_0
    //   6: getfield ZF : Lburp/Zkcl;
    //   9: invokeinterface ZN : (Lburp/Zkcl;)V
    //   14: aload_0
    //   15: getfield ZU : Lburp/Zl34;
    //   18: invokeinterface ZjZ : ()Z
    //   23: ifeq -> 64
    //   26: aload_1
    //   27: aload_0
    //   28: invokevirtual Zn : ()Ljava/util/List;
    //   31: aload_0
    //   32: getfield ZU : Lburp/Zl34;
    //   35: aload_0
    //   36: getfield ZC : Lburp/Zr_4;
    //   39: new burp/Ztwg
    //   42: dup
    //   43: iconst_0
    //   44: invokespecial <init> : (Z)V
    //   47: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   52: checkcast burp/Zl34
    //   55: invokeinterface ZX : (Ljava/util/List;Lburp/Zl34;Lburp/Zl34;)V
    //   60: aload_2
    //   61: ifnonnull -> 73
    //   64: aload_1
    //   65: invokestatic emptyList : ()Ljava/util/List;
    //   68: invokeinterface ZW : (Ljava/util/List;)V
    //   73: aload_1
    //   74: iconst_1
    //   75: invokeinterface Zs : (Z)V
    //   80: return
  }
  
  private List<String> Zn() {
    return (List<String>)this.ZU.Zjg().stream().filter(Zg55::ZaS).map(Zg55::ZaD).distinct().collect(Collectors.toList());
  }
  
  public void ZR() {
    this.Zg.ZI();
    this.Zg.ZQ();
    this.Zg.Zg();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zraa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */