package burp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsub {
  private final Zmdu Zr;
  
  private final Set<Zvs> Zs;
  
  public Zsub(Ztai paramZtai, Zmdu paramZmdu) {
    this.Zr = paramZmdu;
    this.Zs = new HashSet<>();
    String[] arrayOfString = Zrko.ZO();
    Zzu2[] arrayOfZzu2 = Zzu2.values();
    int i = arrayOfZzu2.length;
    byte b = 0;
    while (b < i) {
      Zzu2 zzu2 = arrayOfZzu2[b];
      if (zzu2.Zb() instanceof Zmmq)
        switch (Zzrk.Zl[paramZmdu.ordinal()]) {
          case 1:
          
          case 2:
          case 3:
          
          default:
            Zuh.ZT(false, Zqf.Zr, paramZmdu.toString());
            break;
        }  
      b++;
      continue;
      if (arrayOfString == null)
        break; 
    } 
  }
  
  public List<Zgud> Zh(List<Zgud> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_1
    //   5: invokespecial <init> : (Ljava/util/Collection;)V
    //   8: astore_3
    //   9: invokestatic ZO : ()[Ljava/lang/String;
    //   12: aload_3
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #4
    //   20: astore_2
    //   21: aload #4
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 125
    //   31: aload #4
    //   33: invokeinterface next : ()Ljava/lang/Object;
    //   38: checkcast burp/Zgud
    //   41: astore #5
    //   43: aload #5
    //   45: instanceof burp/Zrkj
    //   48: ifeq -> 84
    //   51: aload #5
    //   53: checkcast burp/Zrkj
    //   56: getfield Zw : Lburp/Zsw6;
    //   59: invokevirtual Zn : ()Lburp/Zvs;
    //   62: astore #6
    //   64: aload_0
    //   65: aload #6
    //   67: invokevirtual ZD : (Lburp/Zvs;)Z
    //   70: ifeq -> 80
    //   73: aload #4
    //   75: invokeinterface remove : ()V
    //   80: aload_2
    //   81: ifnonnull -> 121
    //   84: aload #5
    //   86: instanceof burp/Zrkf
    //   89: ifeq -> 121
    //   92: aload #5
    //   94: checkcast burp/Zrkf
    //   97: getfield Zj : Lburp/Zsw6;
    //   100: invokevirtual Zn : ()Lburp/Zvs;
    //   103: astore #6
    //   105: aload_0
    //   106: aload #6
    //   108: invokevirtual ZD : (Lburp/Zvs;)Z
    //   111: ifeq -> 121
    //   114: aload #4
    //   116: invokeinterface remove : ()V
    //   121: aload_2
    //   122: ifnonnull -> 21
    //   125: aload_3
    //   126: areturn
  }
  
  private boolean ZD(Zvs paramZvs) {
    Zvs zvs = Zi(paramZvs);
    switch (Zzrk.Zl[this.Zr.ordinal()]) {
      case 2:
        return this.Zs.contains(Zzu2.ZZ(zvs.ZS() + 1));
      case 3:
        return this.Zs.contains(Zzu2.ZZ(zvs.ZS() + 2));
      case 1:
        return this.Zs.contains(zvs);
    } 
    Zuh.ZT(false, Zqf.Zr, this.Zr.toString());
    return false;
  }
  
  private static Zvs Zi(Zvs paramZvs) {
    int i = paramZvs.ZS() & 0xF;
    return Zzu2.ZZ(paramZvs.ZS() - i);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsub.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */