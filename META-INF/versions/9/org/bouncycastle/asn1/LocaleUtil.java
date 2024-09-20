package META-INF.versions.9.org.bouncycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.util.Longs;

public class LocaleUtil {
  private static final Map localeCache = new HashMap<>();
  
  public static Locale EN_Locale = forEN();
  
  private static Locale forEN() {
    if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage()))
      return Locale.getDefault(); 
    Locale[] arrayOfLocale = Locale.getAvailableLocales();
    for (byte b = 0; b != arrayOfLocale.length; b++) {
      if ("en".equalsIgnoreCase(arrayOfLocale[b].getLanguage()))
        return arrayOfLocale[b]; 
    } 
    return Locale.getDefault();
  }
  
  static Date epochAdjust(Date paramDate) throws ParseException {
    Locale locale = Locale.getDefault();
    if (locale == null)
      return paramDate; 
    synchronized (localeCache) {
      Long long_ = (Long)localeCache.get(locale);
      if (long_ == null) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        long l = simpleDateFormat.parse("19700101000000GMT+00:00").getTime();
        long_ = longValueOf(l);
        localeCache.put(locale, long_);
      } 
      if (long_.longValue() != 0L)
        return new Date(paramDate.getTime() - long_.longValue()); 
      return paramDate;
    } 
  }
  
  private static Long longValueOf(long paramLong) {
    return Longs.valueOf(paramLong);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\LocaleUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */