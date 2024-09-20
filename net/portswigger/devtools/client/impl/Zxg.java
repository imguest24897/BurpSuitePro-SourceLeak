package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.browser.Zca;
import net.portswigger.devtools.protocol.types.page.LayoutViewport;

final class Zxg extends Record {
  private final Zca Zh;
  
  private final Zca Ze;
  
  private final Zca Zb;
  
  private final Zca ZM;
  
  public Zxg(List<Double> paramList) {
    this(new Zca(((Double)paramList.get(0)).doubleValue(), ((Double)paramList.get(1)).doubleValue()), new Zca(((Double)paramList.get(2)).doubleValue(), ((Double)paramList.get(3)).doubleValue()), new Zca(((Double)paramList.get(4)).doubleValue(), ((Double)paramList.get(5)).doubleValue()), new Zca(((Double)paramList.get(6)).doubleValue(), ((Double)paramList.get(7)).doubleValue()));
    String str = Zor.ZY();
    if (str != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  private Zxg(Zca paramZca1, Zca paramZca2, Zca paramZca3, Zca paramZca4) {
    this.Zh = paramZca1;
    this.Ze = paramZca2;
    this.Zb = paramZca3;
    this.ZM = paramZca4;
  }
  
  private static List<Zxg> ZJ(List<List<Double>> paramList, LayoutViewport paramLayoutViewport) {
    return (paramList == null) ? Collections.emptyList() : (List<Zxg>)paramList.stream().map(paramLayoutViewport::lambda$fromContentQuadsClippedToViewport$0).collect(Collectors.toList());
  }
  
  private static Zxg ZC(List<Double> paramList, LayoutViewport paramLayoutViewport) {
    return new Zxg((new Zca(((Double)paramList.get(0)).doubleValue(), ((Double)paramList.get(1)).doubleValue())).ZD(0.0D, 0.0D, paramLayoutViewport.clientWidth.intValue(), paramLayoutViewport.clientHeight.intValue()), (new Zca(((Double)paramList.get(2)).doubleValue(), ((Double)paramList.get(3)).doubleValue())).ZD(0.0D, 0.0D, paramLayoutViewport.clientWidth.intValue(), paramLayoutViewport.clientHeight.intValue()), (new Zca(((Double)paramList.get(4)).doubleValue(), ((Double)paramList.get(5)).doubleValue())).ZD(0.0D, 0.0D, paramLayoutViewport.clientWidth.intValue(), paramLayoutViewport.clientHeight.intValue()), (new Zca(((Double)paramList.get(6)).doubleValue(), ((Double)paramList.get(7)).doubleValue())).ZD(0.0D, 0.0D, paramLayoutViewport.clientWidth.intValue(), paramLayoutViewport.clientHeight.intValue()));
  }
  
  private boolean ZU() {
    return (Zb() > 1.0D);
  }
  
  private double Zb() {
    double d = 0.0D;
    d += (this.Zh.ZQ() * this.Ze.ZG() - this.Ze.ZQ() * this.Zh.ZG()) / 2.0D;
    d += (this.Ze.ZQ() * this.Zb.ZG() - this.Zb.ZQ() * this.Ze.ZG()) / 2.0D;
    d += (this.Zb.ZQ() * this.ZM.ZG() - this.ZM.ZQ() * this.Zb.ZG()) / 2.0D;
    d += (this.ZM.ZQ() * this.Zh.ZG() - this.Zh.ZQ() * this.ZM.ZG()) / 2.0D;
    return Math.abs(d);
  }
  
  private Zca Zs() {
    return Zca.ZV(new Zca[] { this.Zh, this.Ze, this.ZM, this.Zb });
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/devtools/client/impl/Zxg;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/devtools/client/impl/Zxg;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/devtools/client/impl/Zxg;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  private static Zxg lambda$fromContentQuadsClippedToViewport$0(LayoutViewport paramLayoutViewport, List<Double> paramList) {
    return ZC(paramList, paramLayoutViewport);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */