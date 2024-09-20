package burp;

import java.util.Iterator;
import java.util.List;
import net.portswigger.Zsy;

public class Zsfo {
  private final List<Byte> ZS;
  
  private final Zmxc ZB;
  
  private final Zxpw Zk;
  
  private final Zxs7 Zu;
  
  private final Zmhe ZE;
  
  private final Zkqd Za;
  
  public Zsfo(Zmxc paramZmxc, Zxpw paramZxpw, List<Byte> paramList, Zxs7 paramZxs7, Zmhe paramZmhe, Zbnt paramZbnt, Zsy paramZsy, Zmsb paramZmsb) {
    this.ZB = paramZmxc;
    this.Zk = paramZxpw;
    this.ZS = paramList;
    this.Zu = paramZxs7;
    Zbqc[] arrayOfZbqc = Zxpw.Za();
    this.ZE = paramZmhe;
    Zk8u zk8u = Zk8u.Zh(paramZmhe);
    this.Za = new Zkqd(paramZsy, new Zxk6(paramZmsb, new Zzhl(paramZxpw), paramZmhe, paramZbnt, paramZsy, zk8u.ZM, paramZxs7), zk8u.ZC);
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public void Zs() {
    Zbqc[] arrayOfZbqc = Zxpw.Za();
    if (this.Zk.Zr()) {
      Zb();
      if (arrayOfZbqc != null) {
        ZK();
        return;
      } 
      return;
    } 
    ZK();
  }
  
  private void Zb() {
    Zku6 zku6 = Zn(this.Zk.ZF, this.Zk.ZD);
    Zstu zstu = zku6.ZI((byte)2).Za();
    Zbqc[] arrayOfZbqc = Zxpw.Za();
    for (Zkv8 zkv8 : zku6.ZP((byte)2)) {
      if (this.ZS.contains(Byte.valueOf((zkv8.Zw()).ZX)))
        continue; 
      int i = Zlt_.ZN(zstu, this.Zk.ZD, 0, (zkv8.Zw()).Z_);
      int j = Math.max(0, (zkv8.Zw()).Z_ - (this.Zk.Zt()).length * 4);
      if (i < j)
        i = j; 
      int k = Zlt_.ZN(zstu, this.Zk.ZS, i, (zkv8.Zw()).Z_);
      if (k == -1)
        Z_(zkv8, zku6.ZX(), this.ZB, zku6); 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private void ZK() {
    Zku6 zku6 = Zn(this.Zk.ZF, this.Zk.ZD);
    Iterator<Zkv8> iterator = zku6.ZP((byte)2).iterator();
    Zbqc[] arrayOfZbqc = Zxpw.Za();
    while (iterator.hasNext()) {
      Zkv8 zkv8 = iterator.next();
      if ((zkv8.Zw()).Z_ != -1 && !this.ZS.contains(Byte.valueOf((zkv8.Zw()).ZX)))
        Z_(zkv8, zku6.ZX(), this.ZB, zku6); 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private void Z_(Zkv8 paramZkv8, Zk8m paramZk8m, Zmxc paramZmxc, Zku6 paramZku6) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload #4
    //   5: aload_3
    //   6: <illegal opcode> Zu : (Lburp/Zsfo;Lburp/Zkv8;Lburp/Zk8m;Lburp/Zku6;Lburp/Zmxc;)Lburp/Ze8t;
    //   11: invokestatic Zi : (Lburp/Ze8t;)V
    //   14: return
  }
  
  public Zku6 Zn(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return (new Ztsh(this.ZE, (byte)1, paramArrayOfbyte1, (byte)2, (byte)2)).ZQ(Zxar.Zg(paramArrayOfbyte2));
  }
  
  private void lambda$doTemplateInjectionChecks$0(Zkv8 paramZkv8, Zk8m paramZk8m, Zku6 paramZku6, Zmxc paramZmxc, Byte paramByte) {
    if (paramZkv8 != null && (paramZkv8.Zw()).ZX == paramByte.byteValue()) {
      Zsov zsov = this.Za.Zv(paramByte.byteValue(), Zsjk.APPEND, paramZk8m, this.Zu, paramZkv8, paramZku6);
      if (zsov != null && paramZmxc.Zr(paramByte.byteValue()))
        paramZmxc.ZK(paramByte.byteValue(), zsov); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */