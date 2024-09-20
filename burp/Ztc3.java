package burp;

import burp.api.montoya.http.message.ContentType;
import burp.api.montoya.http.message.MimeType;
import burp.api.montoya.http.message.params.HttpParameterType;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztc3 {
  public static short Zv(MimeType paramMimeType) {
    if (paramMimeType == null)
      return 1; 
    switch (Zef4.Zd[paramMimeType.ordinal()]) {
      case 1:
        return 0;
      case 2:
        return 1;
      case 3:
        return 2;
      case 4:
        return 256;
      case 5:
        return 257;
      case 6:
        return 258;
      case 7:
        return 259;
      case 8:
        return 260;
      case 9:
        return 261;
      case 10:
        return 262;
      case 11:
        return 263;
      case 12:
        return 512;
      case 13:
        return 513;
      case 14:
        return 514;
      case 15:
        return 515;
      case 16:
        return 516;
      case 17:
        return 517;
      case 18:
        return 518;
      case 19:
        return 768;
      case 20:
        return 769;
      case 21:
        return 1026;
      case 22:
        return 1025;
      case 23:
        return 1280;
      case 24:
        return 1536;
      case 25:
        return 1537;
    } 
    Zuh.ZT(false, Zqf.Zk, paramMimeType.toString());
    return 1;
  }
  
  public static MimeType Zp(short paramShort) {
    switch (paramShort) {
      case 0:
        return MimeType.NONE;
      case 1:
        return MimeType.UNRECOGNIZED;
      case 2:
        return MimeType.AMBIGUOUS;
      case 256:
        return MimeType.HTML;
      case 257:
        return MimeType.PLAIN_TEXT;
      case 258:
        return MimeType.CSS;
      case 259:
        return MimeType.SCRIPT;
      case 260:
        return MimeType.JSON;
      case 261:
        return MimeType.RTF;
      case 262:
        return MimeType.XML;
      case 263:
        return MimeType.YAML;
      case 512:
        return MimeType.IMAGE_UNKNOWN;
      case 513:
        return MimeType.IMAGE_JPEG;
      case 514:
        return MimeType.IMAGE_GIF;
      case 515:
        return MimeType.IMAGE_PNG;
      case 516:
        return MimeType.IMAGE_BMP;
      case 517:
        return MimeType.IMAGE_TIFF;
      case 518:
        return MimeType.IMAGE_SVG_XML;
      case 768:
        return MimeType.SOUND;
      case 769:
        return MimeType.VIDEO;
      case 1025:
        return MimeType.APPLICATION_UNKNOWN;
      case 1026:
        return MimeType.APPLICATION_FLASH;
      case 1280:
        return MimeType.LEGACY_SER_AMF;
      case 1536:
        return MimeType.FONT_WOFF;
      case 1537:
        return MimeType.FONT_WOFF2;
    } 
    Zuh.Zv(false, Zqf.Zr, paramShort);
    return MimeType.UNRECOGNIZED;
  }
  
  public static ContentType Zu(Zsba paramZsba) {
    switch (Zef4.ZP[paramZsba.ordinal()]) {
      case 1:
        return ContentType.URL_ENCODED;
      case 2:
        return ContentType.MULTIPART;
      case 3:
        return ContentType.XML;
      case 4:
        return ContentType.AMF;
      case 5:
        return ContentType.JSON;
      case 6:
        return ContentType.NONE;
    } 
    Zuh.Zv(false, Zqf.Zr, paramZsba.Zi());
    return ContentType.NONE;
  }
  
  public static HttpParameterType Zc(Zrdu paramZrdu) {
    switch (Zef4.ZU[paramZrdu.ordinal()]) {
      case 1:
        return HttpParameterType.URL;
      case 2:
      case 3:
        return HttpParameterType.BODY;
      case 4:
        return HttpParameterType.COOKIE;
      case 5:
        return HttpParameterType.XML;
      case 6:
        return HttpParameterType.XML_ATTRIBUTE;
      case 7:
        return HttpParameterType.MULTIPART_ATTRIBUTE;
      case 8:
        return HttpParameterType.JSON;
    } 
    Zuh.ZT(false, Zqf.Zk, paramZrdu.toString());
    return HttpParameterType.URL;
  }
  
  public static ZonedDateTime Za(Date paramDate) {
    return (paramDate == null) ? null : ZonedDateTime.ofInstant(paramDate.toInstant(), ZoneId.systemDefault());
  }
  
  public static Date ZA(ZonedDateTime paramZonedDateTime) {
    return (paramZonedDateTime == null) ? null : Date.from(paramZonedDateTime.toInstant());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztc3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */