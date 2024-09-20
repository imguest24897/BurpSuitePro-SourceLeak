package net.portswigger.swagger;

import burp.Zbqc;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class NetUtils {
  public static InetAddress getHostByName(String paramString) throws UnknownHostException {
    return InetAddress.getByName(paramString);
  }
  
  public static String getHostFromUrl(String paramString) throws MalformedURLException {
    String str2 = (new URL(paramString)).getHost();
    String str1 = StringUtils.ZU();
    try {
      if (str2.length() > 2)
        try {
          if (str2.startsWith("["))
            try {
              if (str2.endsWith("]"))
                return str2.substring(1, str2.length() - 1); 
            } catch (MalformedURLException malformedURLException) {
              throw a(null);
            }  
        } catch (MalformedURLException malformedURLException) {
          throw a(null);
        }  
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    try {
      if (Zbqc.Zwu() == null)
        StringUtils.Zu("GGv9F"); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    return str2;
  }
  
  public static String setHost(String paramString1, String paramString2) throws MalformedURLException {
    URL uRL = new URL(paramString1);
    String str = StringUtils.ZU();
    try {
      if (isIPv6(paramString2))
        return paramString1.replace(uRL.getHost(), "[" + paramString2 + "]"); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    try {
      if (str == null)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    return paramString1.replace(uRL.getHost(), paramString2);
  }
  
  public static boolean isIPv4(String paramString) {
    boolean bool = false;
    if (paramString != null)
      try {
        InetAddress inetAddress = InetAddress.getByName(paramString);
        bool = inetAddress instanceof java.net.Inet4Address;
      } catch (UnknownHostException unknownHostException) {
        return false;
      }  
    return bool;
  }
  
  public static boolean isIPv6(String paramString) {
    boolean bool = false;
    if (paramString != null)
      try {
        InetAddress inetAddress = InetAddress.getByName(paramString);
        bool = inetAddress instanceof java.net.Inet6Address;
      } catch (UnknownHostException unknownHostException) {
        return false;
      }  
    return bool;
  }
  
  public static boolean isUniqueLocalAddress(InetAddress paramInetAddress) {
    if (paramInetAddress instanceof java.net.Inet4Address)
      return false; 
    byte[] arrayOfByte = paramInetAddress.getAddress();
    return ((arrayOfByte[0] & 0xFF) == 252 || (arrayOfByte[0] & 0xFF) == 253);
  }
  
  public static boolean isNAT64Address(InetAddress paramInetAddress) {
    if (paramInetAddress instanceof java.net.Inet4Address)
      return false; 
    byte[] arrayOfByte = paramInetAddress.getAddress();
    return ((arrayOfByte[0] & 0xFF) == 0 && (arrayOfByte[1] & 0xFF) == 100 && (arrayOfByte[2] & 0xFF) == 255 && (arrayOfByte[3] & 0xFF) == 155);
  }
  
  private static MalformedURLException a(MalformedURLException paramMalformedURLException) {
    return paramMalformedURLException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\NetUtils.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */