package burp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zkb;

class Zb_v {
  private final List<Zb6w> Zu;
  
  private int Zp;
  
  private boolean Zr;
  
  Zb_v(List<String> paramList, List<Zt8g> paramList1) {
    String str = paramList.isEmpty() ? "" : paramList.get(0);
    this.Zp = ZN(str);
    this.Zr = (this.Zp < str.length() && str.charAt(this.Zp) == '?');
    this.Zu = (List<Zb6w>)paramList1.stream().filter(Zb_v::lambda$new$0).map(Zb6w::Zk).collect(Collectors.toList());
  }
  
  List<Zb6w> Zo() {
    return this.Zu;
  }
  
  Zga7 ZU(String paramString1, String paramString2) {
    int[] arrayOfInt = Zb6u.ZI();
    if (this.Zu.isEmpty()) {
      String str1 = this.Zr ? "" : "?";
      int k = this.Zr ? (this.Zp + 1) : this.Zp;
      if (arrayOfInt != null) {
        str1 = "&";
        k = ((Zb6w)this.Zu.get(this.Zu.size() - 1)).ZT;
        int n = k + str1.length();
        Zb6w zb6w2 = Zb6w.ZL(paramString1, paramString2, n);
        this.Zu.add(zb6w2);
        return new Zga7(k, Zkb.Zy(str1 + str1));
      } 
      int m = k + str1.length();
      Zb6w zb6w1 = Zb6w.ZL(paramString1, paramString2, m);
      this.Zu.add(zb6w1);
      return new Zga7(k, Zkb.Zy(str1 + str1));
    } 
    String str = "&";
    int i = ((Zb6w)this.Zu.get(this.Zu.size() - 1)).ZT;
    int j = i + str.length();
    Zb6w zb6w = Zb6w.ZL(paramString1, paramString2, j);
    this.Zu.add(zb6w);
    return new Zga7(i, Zkb.Zy(str + str));
  }
  
  Zrif Zq(int paramInt, String paramString1, String paramString2) {
    Zb6w zb6w1 = this.Zu.get(paramInt);
    Zb6w zb6w2 = Zb6w.ZL(paramString1, paramString2, zb6w1.Zk);
    this.Zu.set(paramInt, zb6w2);
    Zq(paramInt + 1, zb6w2.ZT - zb6w1.ZT);
    return new Zrif(zb6w1.Zk, zb6w1.ZT, Zkb.Zy(zb6w2.toString()));
  }
  
  List<Zmg4> ZY(List<Integer> paramList) {
    ArrayList<Zmg4> arrayList = new ArrayList();
    ArrayList<Integer> arrayList1 = new ArrayList<>(paramList);
    arrayList1.sort(Comparator.reverseOrder());
    int[] arrayOfInt = Zb6u.ZI();
    Iterator<Integer> iterator = arrayList1.iterator();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      Zb6w zb6w = this.Zu.remove(i);
      boolean bool = (i > 0 || this.Zu.isEmpty()) ? true : false;
      int j = bool ? (zb6w.Zk - 1) : zb6w.Zk;
      int k = bool ? zb6w.ZT : (zb6w.ZT + 1);
      this.Zr = !this.Zu.isEmpty();
      Zq(i, j - k);
      arrayList.add(new Zmg4(j, k));
      if (arrayOfInt != null)
        break; 
    } 
    return arrayList;
  }
  
  Zrif ZI(int paramInt1, int paramInt2) {
    int i = Math.min(paramInt1, paramInt2);
    int j = Math.max(paramInt1, paramInt2);
    int[] arrayOfInt = Zb6u.ZI();
    Zb6w zb6w1 = (paramInt1 < paramInt2) ? this.Zu.get(paramInt1) : this.Zu.get(paramInt2);
    Zb6w zb6w2 = (paramInt1 < paramInt2) ? this.Zu.get(paramInt2) : this.Zu.get(paramInt1);
    Zrif zrif = new Zrif(zb6w1.Zk, zb6w2.ZT, Zkb.Zy(zb6w2.toString() + "&" + zb6w2.toString()));
    zb6w2 = zb6w2.ZA(zb6w1.Zk - zb6w2.Zk);
    zb6w1 = zb6w1.ZA(zb6w2.ZH() + 1);
    this.Zu.set(i, zb6w2);
    this.Zu.set(j, zb6w1);
    if (Zbqc.Zwu() == null)
      Zb6u.Zb(new int[5]); 
    return zrif;
  }
  
  void ZQ(int paramInt) {
    this.Zp += paramInt;
    Zq(0, paramInt);
  }
  
  private void Zq(int paramInt1, int paramInt2) {
    int[] arrayOfInt = Zb6u.ZI();
    if (paramInt2 == 0)
      return; 
    int i = paramInt1;
    while (i < this.Zu.size()) {
      this.Zu.set(i, ((Zb6w)this.Zu.get(i)).ZA(paramInt2));
      i++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private static int ZN(String paramString) {
    int[] arrayOfInt = Zb6u.ZI();
    int i = paramString.indexOf(' ');
    if (i == -1)
      return paramString.length(); 
    while (i < paramString.length() && paramString.charAt(i) == ' ') {
      i++;
      if (arrayOfInt != null)
        break; 
    } 
    while (i < paramString.length()) {
      switch (paramString.charAt(i)) {
        case '\n':
        case '\r':
        case ' ':
        case '#':
        case '?':
          return i;
      } 
      i++;
      if (arrayOfInt != null)
        break; 
    } 
    return i;
  }
  
  private static boolean lambda$new$0(Zt8g paramZt8g) {
    return (paramZt8g.ZbQ() == Zrdu.URL_PARAM);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb_v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */