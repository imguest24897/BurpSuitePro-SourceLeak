package burp;

import java.time.Instant;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

class Zm1i {
  private final String ZW;
  
  private final List<Zges> Zj;
  
  private final List<byte[]> Zd;
  
  private final Instant ZK;
  
  private final Instant Zu;
  
  private final boolean Zq;
  
  private final boolean ZN;
  
  private final Zlxi ZG;
  
  private final int ZY;
  
  private final boolean ZM;
  
  private Zm1i(String paramString, List<Zges> paramList, List<byte[]> paramList1, Instant paramInstant1, Instant paramInstant2, boolean paramBoolean1, boolean paramBoolean2, Zlxi paramZlxi, int paramInt, boolean paramBoolean3) {
    this.ZW = paramString;
    this.Zj = paramList;
    this.Zd = paramList1;
    this.ZK = paramInstant1;
    this.Zu = paramInstant2;
    this.Zq = paramBoolean1;
    this.ZN = paramBoolean2;
    this.ZG = paramZlxi;
    this.ZY = paramInt;
    this.ZM = paramBoolean3;
  }
  
  boolean Za() {
    return (this.ZW.isEmpty() && this.Zj.isEmpty() && this.Zd.isEmpty());
  }
  
  String Zx() {
    return this.ZW;
  }
  
  Instant Zc() {
    return this.ZK;
  }
  
  Instant Z_() {
    return this.Zu;
  }
  
  boolean Zg() {
    return this.Zq;
  }
  
  boolean Zo() {
    return this.ZN;
  }
  
  Zlxi Zh() {
    return this.ZG;
  }
  
  void Zh(Consumer<byte[]> paramConsumer) {
    this.Zd.forEach((Consumer)paramConsumer);
  }
  
  Stream<Zges> Zd() {
    return this.Zj.stream();
  }
  
  boolean Ze() {
    return (this.ZY > 1);
  }
  
  boolean Zq() {
    return this.ZM;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm1i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */