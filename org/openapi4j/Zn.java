package org.openapi4j;

import java.net.MalformedURLException;
import java.net.URL;

class Zn {
  static URL ZO(URL paramURL, String paramString) throws Zp0 {
    try {
      if (paramString == null)
        return paramURL; 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    try {
      return new URL(paramURL, paramString);
    } catch (MalformedURLException malformedURLException) {
      throw new Zpa(malformedURLException);
    } 
  }
  
  static String Zb(URL paramURL, String paramString) {
    try {
      return ZO(paramURL, paramString).toString();
    } catch (Zp0 zp0) {
      try {
      
      } catch (Zp0 zp01) {
        throw a(null);
      } 
      return (paramURL == null) ? null : paramURL.toString();
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */