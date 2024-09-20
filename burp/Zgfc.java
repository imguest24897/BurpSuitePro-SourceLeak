package burp;

public class Zgfc {
  static long Zy(Zl5x paramZl5x, long paramLong1, long paramLong2) {
    long l = Ze(paramZl5x, paramLong1, paramLong2);
    l++;
    l <<= 4 * paramZl5x.Zn();
    return l;
  }
  
  static long Ze(Zl5x paramZl5x, long paramLong1, long paramLong2) {
    long l = paramLong1 & paramLong2;
    l >>= 4 * paramZl5x.Zn();
    return l;
  }
  
  static long Zu(Zl5x paramZl5x) {
    long l = 15L;
    l <<= 4 * paramZl5x.Zn();
    return l;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgfc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */