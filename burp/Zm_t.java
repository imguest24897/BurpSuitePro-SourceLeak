package burp;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.portswigger.Zip;
import net.portswigger.Zm2;

public class Zm_t implements Zgbu {
  private static final Map<Zip, Collection<? extends Zvs>> Zc = new Zznh();
  
  private static final Map<Zip, List<? extends Zvs>> Zo = new Zra6();
  
  private final Zkq4 ZJ;
  
  public Zm_t(Zkq4 paramZkq4) {
    this.ZJ = paramZkq4;
  }
  
  public void Zp() {
    // Byte code:
    //   0: invokestatic Zz : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: getstatic burp/Zthk.Zy : [I
    //   7: aload_0
    //   8: getfield ZJ : Lburp/Zkq4;
    //   11: invokeinterface ZqT : ()Lburp/Zlk4;
    //   16: invokevirtual ordinal : ()I
    //   19: iaload
    //   20: tableswitch default -> 74, 1 -> 48, 2 -> 58, 3 -> 68
    //   48: getstatic burp/Zrrh.SCANNER_OPTIMIZATION_SCAN_SPEED_NORMAL : Lburp/Zrrh;
    //   51: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   54: aload_1
    //   55: ifnull -> 74
    //   58: getstatic burp/Zrrh.SCANNER_OPTIMIZATION_SCAN_SPEED_FAST : Lburp/Zrrh;
    //   61: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   64: aload_1
    //   65: ifnull -> 74
    //   68: getstatic burp/Zrrh.SCANNER_OPTIMIZATION_SCAN_SPEED_THOROUGH : Lburp/Zrrh;
    //   71: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   74: getstatic burp/Zthk.Za : [I
    //   77: aload_0
    //   78: getfield ZJ : Lburp/Zkq4;
    //   81: invokeinterface ZqM : ()Lburp/Zeko;
    //   86: invokevirtual ordinal : ()I
    //   89: iaload
    //   90: tableswitch default -> 142, 1 -> 116, 2 -> 126, 3 -> 136
    //   116: getstatic burp/Zrrh.SCANNER_OPTIMIZATION_SCAN_ACCURACY_NORMAL : Lburp/Zrrh;
    //   119: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   122: aload_1
    //   123: ifnull -> 142
    //   126: getstatic burp/Zrrh.SCANNER_OPTIMIZATION_SCAN_ACCURACY_MINIMIZE_FALSE_POSITIVES : Lburp/Zrrh;
    //   129: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   132: aload_1
    //   133: ifnull -> 142
    //   136: getstatic burp/Zrrh.SCANNER_OPTIMIZATION_SCAN_ACCURACY_MINIMIZE_FALSE_NEGATIVES : Lburp/Zrrh;
    //   139: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   142: aload_0
    //   143: getfield ZJ : Lburp/Zkq4;
    //   146: invokeinterface Zqo : ()Z
    //   151: ifne -> 160
    //   154: getstatic burp/Zrrh.SCANNER_OPTIMIZATION_INTELLIGENT_ATTACK_SELECTION_DISABLED : Lburp/Zrrh;
    //   157: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   160: getstatic burp/Zm_t.Zc : Ljava/util/Map;
    //   163: invokeinterface entrySet : ()Ljava/util/Set;
    //   168: invokeinterface iterator : ()Ljava/util/Iterator;
    //   173: astore_2
    //   174: aload_2
    //   175: invokeinterface hasNext : ()Z
    //   180: ifeq -> 219
    //   183: aload_2
    //   184: invokeinterface next : ()Ljava/lang/Object;
    //   189: checkcast java/util/Map$Entry
    //   192: astore_3
    //   193: aload_0
    //   194: aload_3
    //   195: invokeinterface getKey : ()Ljava/lang/Object;
    //   200: checkcast net/portswigger/Zip
    //   203: aload_3
    //   204: invokeinterface getValue : ()Ljava/lang/Object;
    //   209: checkcast java/util/Collection
    //   212: invokevirtual Za : (Lnet/portswigger/Zip;Ljava/util/Collection;)V
    //   215: aload_1
    //   216: ifnull -> 174
    //   219: return
  }
  
  public void Zd() {
    String[] arrayOfString = Zmhb.Zz();
    for (Map.Entry<Zip, List<? extends Zvs>> entry : Zo.entrySet()) {
      Za((Zip)entry.getKey(), (Collection<? extends Zvs>)entry.getValue());
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private void Za(Zip paramZip, Collection<? extends Zvs> paramCollection) {
    String[] arrayOfString = Zmhb.Zz();
    if (paramCollection.isEmpty())
      return; 
    for (Zvs zvs : paramCollection) {
      if (this.ZJ.Zr(zvs))
        return; 
      if (arrayOfString != null)
        break; 
    } 
    Zm2.ZC(paramZip);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm_t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */