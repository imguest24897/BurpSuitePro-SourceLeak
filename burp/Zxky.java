package burp;

import java.util.Comparator;

class Zxky<T> implements Comparator<Object> {
  private final Class<T> ZG;
  
  private final Comparator<T> Zh;
  
  private Zxky(Class<T> paramClass, Comparator<T> paramComparator) {
    this.ZG = paramClass;
    this.Zh = paramComparator;
  }
  
  static <T> Zxky<T> ZB(Class<T> paramClass, Comparator<T> paramComparator) {
    return new Zxky<>(paramClass, paramComparator);
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    return (this.ZG.isInstance(paramObject1) && this.ZG.isInstance(paramObject2)) ? this.Zh.compare(this.ZG.cast(paramObject1), this.ZG.cast(paramObject2)) : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxky.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */