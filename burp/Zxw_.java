package burp;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

class Zxw_ {
  private final Zg3_ Zw;
  
  private final AtomicBoolean Zz;
  
  private final Zg3_ ZD;
  
  private final AtomicBoolean Zj;
  
  private final Zs5z Ze;
  
  Zxw_(Zttn paramZttn, Zv8z paramZv8z, Consumer<Zrnd> paramConsumer, String paramString, Zskh paramZskh) {
    this.Zw = Zg3_.ZE(paramConsumer, paramZttn, paramZv8z, paramString);
    this.Zz = new AtomicBoolean();
    this.Ze = new Zs5z(paramZttn, paramZv8z, paramZskh);
    this.ZD = Zg3_.Zo(paramConsumer, this.Ze, paramString);
    this.Zj = new AtomicBoolean();
  }
  
  boolean Zl(Zrnd paramZrnd) {
    if (this.Zj.get()) {
      this.ZD.ZQ(paramZrnd);
      return true;
    } 
    if (this.Zz.get()) {
      this.Zw.ZQ(paramZrnd);
      return true;
    } 
    return false;
  }
  
  void Zu() {
    this.ZD.Zy();
    this.Zw.Zy();
  }
  
  void Zg() {
    this.ZD.Zk();
    this.Zw.Zk();
  }
  
  void Zt() {
    this.ZD.Zx();
    this.Zw.Zx();
  }
  
  void Zm() {
    if (this.Zz.compareAndSet(false, true))
      this.Zw.Zk(); 
  }
  
  List<Zrnd> ZQ() {
    int i = Zgum.Zj();
    if (this.Zz.compareAndSet(true, false)) {
      List<Zrnd> list = this.Zw.Ze();
      return (i != 0) ? Collections.emptyList() : list;
    } 
    return (List)Collections.emptyList();
  }
  
  void Zv(List<Zrnd> paramList, Zlit paramZlit) {
    int i = Zgum.Zj();
    if (this.Zj.compareAndSet(false, true)) {
      Objects.requireNonNull(this.ZD);
      paramList.forEach(this.ZD::ZQ);
      List<Zrnd> list1 = ZQ();
      Objects.requireNonNull(this.ZD);
      list1.forEach(this.ZD::ZQ);
      this.ZD.Zk();
      if (i != 0) {
        list1 = this.ZD.Ze();
        Objects.requireNonNull(this.ZD);
        paramList.forEach(this.ZD::ZQ);
        Objects.requireNonNull(this.ZD);
        list1.forEach(this.ZD::ZQ);
        this.Ze.Zi(paramZlit);
        return;
      } 
      return;
    } 
    List<Zrnd> list = this.ZD.Ze();
    Objects.requireNonNull(this.ZD);
    paramList.forEach(this.ZD::ZQ);
    Objects.requireNonNull(this.ZD);
    list.forEach(this.ZD::ZQ);
    this.Ze.Zi(paramZlit);
  }
  
  List<Zrnd> Zy() {
    int i = Zgum.ZA();
    if (this.Zj.compareAndSet(true, false)) {
      List<Zrnd> list = this.ZD.Ze();
      this.Ze.Zz();
      return (i == 0) ? Collections.emptyList() : list;
    } 
    return (List)Collections.emptyList();
  }
  
  int Zo() {
    int i = 0;
    if (this.ZD != null)
      i = this.ZD.ZV(); 
    if (this.Zw != null)
      i = this.Zw.ZV(); 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxw_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */