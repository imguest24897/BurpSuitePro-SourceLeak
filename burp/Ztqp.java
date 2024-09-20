package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztqp implements Zku6 {
  private final Zlvf ZK;
  
  private final byte[] Zb;
  
  private final Zb6q Zs;
  
  private final Zb6q Zk;
  
  private final List<Zkv8> Zg;
  
  private final boolean[] ZP;
  
  private final boolean Zc;
  
  private final List<Zkv8> ZJ;
  
  private final boolean[] Zu;
  
  private Zk8m ZT;
  
  public Ztqp(byte[] paramArrayOfbyte, Zb6q paramZb6q1, Zb6q paramZb6q2, Zlvf paramZlvf) {
    this.ZK = paramZlvf;
    this.Zg = new ArrayList<>();
    String str = Zz_p.Zl();
    this.ZP = new boolean[26];
    this.Zc = (paramZb6q2 != null);
    this.ZJ = new ArrayList<>();
    this.Zu = new boolean[26];
    this.Zb = paramArrayOfbyte;
    this.Zs = paramZb6q1;
    this.Zk = paramZb6q2;
    if (Zbqc.Zwu() == null)
      Zz_p.Za("DXRa8"); 
  }
  
  public Zlvf ZV() {
    return this.ZK;
  }
  
  public void Zg(Zkv8 paramZkv8, byte paramByte) {
    String str = Zz_p.Zl();
    switch (paramByte) {
      case 1:
        this.ZJ.add(paramZkv8);
        this.Zu[(paramZkv8.Zw()).ZX] = true;
        if (str != null);
        return;
      case 2:
        this.Zg.add(paramZkv8);
        this.ZP[(paramZkv8.Zw()).ZX] = true;
        if (str != null)
          break; 
        return;
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
  }
  
  public boolean Zk(byte paramByte1, byte paramByte2) {
    switch (paramByte1) {
      case 1:
        return this.Zc ? this.Zu[paramByte2] : this.ZP[paramByte2];
      case 2:
        return this.ZP[paramByte2];
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte1);
    return false;
  }
  
  public List<Zkv8> ZP(byte paramByte) {
    switch (paramByte) {
      case 1:
        return this.Zc ? this.ZJ : this.Zg;
      case 2:
        return this.Zg;
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return this.Zg;
  }
  
  public Zb6q ZI(byte paramByte) {
    switch (paramByte) {
      case 1:
        return (this.Zk == null) ? this.Zs : this.Zk;
      case 2:
        return this.Zs;
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return this.Zs;
  }
  
  public boolean Zn() {
    return (this.Zk != null);
  }
  
  public Zkv8 ZX(byte paramByte, Zgl6 paramZgl6) {
    List<Zkv8> list = ZP(paramByte);
    Iterator<Zkv8> iterator = list.iterator();
    String str = Zz_p.Zl();
    while (iterator.hasNext()) {
      Zkv8 zkv8 = iterator.next();
      if (paramZgl6.Zv(zkv8))
        return zkv8; 
      if (str != null)
        break; 
    } 
    return null;
  }
  
  public boolean Zo(Zkv8 paramZkv8) {
    Zstu zstu = ZI((byte)2).Za();
    int i = (paramZkv8.Zw()).ZY;
    String str = Zz_p.Zl();
    while (i < (paramZkv8.Zw()).Z_) {
      if (zstu.Zp(i) > 32)
        return false; 
      i++;
      if (str != null)
        break; 
    } 
    return true;
  }
  
  public boolean Zh() {
    return !ZP((byte)2).isEmpty();
  }
  
  public boolean Zq() {
    return !ZP((byte)1).isEmpty();
  }
  
  public boolean Zu() {
    return (Zq() || Zh());
  }
  
  public byte[] ZY() {
    return this.Zb;
  }
  
  public Zk8m ZX() {
    return this.ZT;
  }
  
  public void ZK(Zk8m paramZk8m) {
    this.ZT = paramZk8m;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztqp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */