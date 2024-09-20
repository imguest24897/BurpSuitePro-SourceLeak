package burp;

import java.util.ArrayDeque;
import java.util.Deque;

public class Zk2g implements Ztz {
  private final StringBuilder ZC = new StringBuilder();
  
  private final Deque<Ztz0> ZO = new ArrayDeque<>();
  
  private final Deque<Ztz0> ZK = new ArrayDeque<>();
  
  private int ZD;
  
  public void Zb(String paramString) {
    this.ZC.setLength(0);
    this.ZC.append(paramString);
    this.ZO.clear();
    this.ZK.clear();
    this.ZD = paramString.length();
  }
  
  public String ZY() {
    return this.ZC.toString();
  }
  
  public void ZN(int paramInt, String paramString) {
    ZG(new Ztz0(paramString, paramInt, Zm_s.INSERT));
    this.ZC.insert(paramInt, paramString);
    this.ZD = paramInt + paramString.length();
    this.ZK.clear();
  }
  
  public void Zh(int paramInt1, int paramInt2) {
    String str = this.ZC.substring(paramInt1, paramInt1 + paramInt2);
    ZG(new Ztz0(str, paramInt1, Zm_s.REMOVE));
    this.ZC.delete(paramInt1, paramInt1 + paramInt2);
    this.ZD = paramInt1;
    this.ZK.clear();
  }
  
  public void Ze() {
    if (!this.ZK.isEmpty()) {
      Ztz0 ztz0 = this.ZK.pop();
      ZK(ztz0);
      this.ZO.push(ztz0);
    } 
  }
  
  public void Zp() {
    if (!this.ZO.isEmpty()) {
      Ztz0 ztz0 = this.ZO.pop();
      ZQ(ztz0);
      this.ZK.push(ztz0);
    } 
  }
  
  public int ZZ() {
    return this.ZD;
  }
  
  private void ZK(Ztz0 paramZtz0) {
    String[] arrayOfString = Zbds.Ze();
    if (paramZtz0.ZX == Zm_s.INSERT) {
      this.ZC.insert(paramZtz0.Zc, paramZtz0.Zb);
      this.ZD = paramZtz0.Zc + paramZtz0.Zb.length();
      if (arrayOfString == null) {
        this.ZC.delete(paramZtz0.Zc, paramZtz0.Zc + paramZtz0.Zb.length());
        this.ZD = paramZtz0.Zc;
        return;
      } 
      return;
    } 
    this.ZC.delete(paramZtz0.Zc, paramZtz0.Zc + paramZtz0.Zb.length());
    this.ZD = paramZtz0.Zc;
  }
  
  private void ZQ(Ztz0 paramZtz0) {
    String[] arrayOfString = Zbds.Ze();
    if (paramZtz0.ZX == Zm_s.INSERT) {
      this.ZC.delete(paramZtz0.Zc, paramZtz0.Zc + paramZtz0.Zb.length());
      this.ZD = paramZtz0.Zc;
      if (arrayOfString == null) {
        this.ZC.insert(paramZtz0.Zc, paramZtz0.Zb);
        this.ZD = paramZtz0.Zc + paramZtz0.Zb.length();
        return;
      } 
      return;
    } 
    this.ZC.insert(paramZtz0.Zc, paramZtz0.Zb);
    this.ZD = paramZtz0.Zc + paramZtz0.Zb.length();
  }
  
  private void ZG(Ztz0 paramZtz0) {
    if (!this.ZO.isEmpty()) {
      Ztz0 ztz0 = this.ZO.peek();
      if (ztz0.ZA(paramZtz0)) {
        this.ZO.pop();
        this.ZO.push(ztz0.Ze(paramZtz0));
        return;
      } 
    } 
    this.ZO.push(paramZtz0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk2g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */