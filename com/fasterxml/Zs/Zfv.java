package com.fasterxml.Zs;

import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Zfv {
  private static final HashSet<String> ZX = new HashSet<>();
  
  public static Zyo<?> ZP(Zyg paramZyg, Class<?> paramClass, String paramString) throws Zy_ {
    if (ZX.contains(paramString)) {
      Zub<?> zub = Zub.Zb(paramClass);
      try {
        if (zub != null)
          return zub; 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      try {
        if (paramClass == UUID.class)
          return new Zuf(); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      try {
        if (paramClass == StackTraceElement.class)
          return Zfu.Zp(paramZyg); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      try {
        if (paramClass == AtomicBoolean.class)
          return new Zuv(); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      try {
        if (paramClass == AtomicInteger.class)
          return new Zug(); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      try {
        if (paramClass == AtomicLong.class)
          return new Zu4(); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      try {
        if (paramClass == ByteBuffer.class)
          return new Zu2(); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      try {
        if (paramClass == Void.class)
          return Zu8.Za; 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  static {
    Class[] arrayOfClass = { UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, StackTraceElement.class, ByteBuffer.class, Void.class };
    for (Class clazz : arrayOfClass)
      ZX.add(clazz.getName()); 
    for (Class<?> clazz : Zub.Zr())
      ZX.add(clazz.getName()); 
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zfv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */