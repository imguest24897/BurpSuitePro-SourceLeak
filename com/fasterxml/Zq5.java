package com.fasterxml;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class Zq5 {
  public static Collection<Map.Entry<Class<?>, Object>> ZX() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    hashMap.put(URL.class, new Zs5(URL.class));
    hashMap.put(URI.class, new Zs5(URI.class));
    hashMap.put(Currency.class, new Zs5(Currency.class));
    hashMap.put(UUID.class, new Zsh());
    hashMap.put(Pattern.class, new Zs5(Pattern.class));
    hashMap.put(Locale.class, new Zs5(Locale.class));
    hashMap.put(AtomicBoolean.class, Zs7.class);
    hashMap.put(AtomicInteger.class, Zsp.class);
    hashMap.put(AtomicLong.class, Zsl.class);
    hashMap.put(File.class, Zst.class);
    hashMap.put(Class.class, Zsv.class);
    hashMap.put(Void.class, Zzx.Zo);
    hashMap.put(void.class, Zzx.Zo);
    return (Collection)hashMap.entrySet();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */