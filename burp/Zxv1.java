package burp;

import java.awt.Component;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zxv1 extends Zxsr implements Zvo1 {
  private static final String a;
  
  protected Zxv1(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public long ZYQ() {
    return this.Za.ZL(this, Zkp_.ZG);
  }
  
  public int[] ZYt() {
    int i = this.Za.Zx(this, Zkp_.Zd);
    int j = this.Za.Zx(this, Zkp_.ZM);
    return new int[] { i, j };
  }
  
  public void ZU(int[] paramArrayOfint) {
    int i = 0;
    int j = 0;
    if (paramArrayOfint != null) {
      i = paramArrayOfint[0];
      j = paramArrayOfint[1];
    } 
    this.Za.ZM(this, Zkp_.Zd, i);
    this.Za.ZM(this, Zkp_.ZM, j);
  }
  
  public String ZYN() {
    return this.Za.Zf(this, Zkp_.Zx);
  }
  
  public String ZYT() {
    return this.Za.Zf(this, Zkp_.Zy);
  }
  
  public String ZYG() {
    return this.Za.Zf(this, Zkp_.Zh);
  }
  
  public Zeew Ze2() {
    return Zeew.REPEATER;
  }
  
  public Zlit ZlL() {
    return this.Za.<Zlit>ZJ(this, Zkp_.ZQ);
  }
  
  public short Zl7() {
    return this.Za.ZQ(this, Zkp_.ZV);
  }
  
  public int Zlq() {
    return this.Za.Zx(this, Zkp_.Zc);
  }
  
  public long ZoB() {
    return this.Za.ZL(this, Zkp_.ZE);
  }
  
  public Zmzk Zod() {
    return this.Za.<Zmzk>ZJ(this, Zkp_.ZJ);
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
  
  public Zbr Zo3() {
    Zefg<Zk94> zefg = (Zefg)this.Za.ZJ(this, Zkp_.ZC);
    Zstu zstu = this.Za.<Zstu>ZA(this, Zkp_.Za);
    byte b = this.Za.ZL(this, Zkp_.ZR);
    return Zbr.ZK(zefg, zstu, Zkyt.Zf(b));
  }
  
  public Zstu Zos() {
    Zefg zefg = (Zefg)this.Za.ZJ(this, Zkp_.ZC);
    Zuh.ZT((zefg == null), Zqf.Zr, a);
    return this.Za.<Zstu>ZA(this, Zkp_.Za);
  }
  
  public Zstu ZoO() {
    return this.Za.<Zstu>ZA(this, Zkp_.ZS);
  }
  
  public String ZIx() {
    return null;
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
  
  public boolean Zd(Zz28 paramZz28) {
    return paramZz28.ZG(ZlL());
  }
  
  static {
    // Byte code:
    //   0: bipush #66
    //   2: ldc '(w\\tbZzL\\rsvK6w2\\tca$\\rwZa\\trZp@s2svY'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxv1.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #56
    //   82: goto -> 112
    //   85: bipush #80
    //   87: goto -> 112
    //   90: bipush #53
    //   92: goto -> 112
    //   95: bipush #34
    //   97: goto -> 112
    //   100: bipush #46
    //   102: goto -> 112
    //   105: bipush #39
    //   107: goto -> 112
    //   110: bipush #84
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxv1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */