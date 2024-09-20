/*     */ package com.nimbusds.jose.shaded.asm;
/*     */ 
/*     */ import java.text.DateFormatSymbols;
/*     */ import java.util.Calendar;
/*     */ import java.util.Comparator;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
/*     */ import java.util.HashSet;
/*     */ import java.util.Locale;
/*     */ import java.util.StringTokenizer;
/*     */ import java.util.TimeZone;
/*     */ import java.util.TreeMap;
/*     */ 
/*     */ public class ConvertDate {
/*  15 */   static TreeMap<String, Integer> monthsTable = new TreeMap<>(new StringCmpNS());
/*  16 */   static TreeMap<String, Integer> daysTable = new TreeMap<>(new StringCmpNS());
/*  17 */   private static HashSet<String> voidData = new HashSet<>();
/*     */   
/*     */   public static TimeZone defaultTimeZone;
/*     */   
/*     */   public static class StringCmpNS
/*     */     implements Comparator<String>
/*     */   {
/*     */     public int compare(String o1, String o2) {
/*  25 */       return o1.compareToIgnoreCase(o2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static Integer getMonth(String month) {
/*  30 */     return monthsTable.get(month);
/*     */   }
/*     */   
/*     */   private static Integer parseMonth(String s1) {
/*  34 */     if (Character.isDigit(s1.charAt(0))) {
/*  35 */       return Integer.valueOf(Integer.parseInt(s1) - 1);
/*     */     }
/*  37 */     Integer month = monthsTable.get(s1);
/*  38 */     if (month == null)
/*  39 */       throw new NullPointerException("can not parse " + s1 + " as month"); 
/*  40 */     return Integer.valueOf(month.intValue());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static GregorianCalendar newCalandar() {
/*  48 */     GregorianCalendar cal = new GregorianCalendar(2000, 0, 0, 0, 0, 0);
/*  49 */     if (defaultTimeZone != null)
/*  50 */       cal.setTimeZone(defaultTimeZone); 
/*  51 */     TimeZone TZ = cal.getTimeZone();
/*  52 */     if (TZ == null) {
/*  53 */       TZ = TimeZone.getDefault();
/*     */     }
/*  55 */     cal.setTimeInMillis(-TZ.getRawOffset());
/*  56 */     return cal;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  61 */   static TreeMap<String, TimeZone> timeZoneMapping = new TreeMap<>(); static {
/*  62 */     voidData.add("à");
/*  63 */     voidData.add("at");
/*  64 */     voidData.add("MEZ");
/*  65 */     voidData.add("Uhr");
/*  66 */     voidData.add("h");
/*  67 */     voidData.add("pm");
/*  68 */     voidData.add("PM");
/*  69 */     voidData.add("am");
/*  70 */     voidData.add("AM");
/*  71 */     voidData.add("min");
/*  72 */     voidData.add("um");
/*  73 */     voidData.add("o'clock");
/*     */     
/*  75 */     for (String tz : TimeZone.getAvailableIDs()) {
/*  76 */       timeZoneMapping.put(tz, TimeZone.getTimeZone(tz));
/*     */     }
/*     */     
/*  79 */     for (Locale locale : DateFormatSymbols.getAvailableLocales()) {
/*  80 */       if (!"ja".equals(locale.getLanguage()))
/*     */       {
/*  82 */         if (!"ko".equals(locale.getLanguage()))
/*     */         {
/*  84 */           if (!"zh".equals(locale.getLanguage())) {
/*     */             
/*  86 */             DateFormatSymbols dfs = DateFormatSymbols.getInstance(locale);
/*  87 */             String[] keys = dfs.getMonths(); int i;
/*  88 */             for (i = 0; i < keys.length; i++) {
/*  89 */               if (keys[i].length() != 0)
/*     */               {
/*  91 */                 fillMap(monthsTable, keys[i], Integer.valueOf(i)); } 
/*     */             } 
/*  93 */             keys = dfs.getShortMonths();
/*  94 */             for (i = 0; i < keys.length; i++) {
/*  95 */               String s = keys[i];
/*  96 */               if (s.length() != 0)
/*     */               {
/*  98 */                 if (!Character.isDigit(s.charAt(s.length() - 1))) {
/*     */                   
/* 100 */                   fillMap(monthsTable, keys[i], Integer.valueOf(i));
/* 101 */                   fillMap(monthsTable, keys[i].replace(".", ""), Integer.valueOf(i));
/*     */                 }  } 
/* 103 */             }  keys = dfs.getWeekdays();
/* 104 */             for (i = 0; i < keys.length; i++) {
/* 105 */               String s = keys[i];
/* 106 */               if (s.length() != 0) {
/*     */                 
/* 108 */                 fillMap(daysTable, s, Integer.valueOf(i));
/* 109 */                 fillMap(daysTable, s.replace(".", ""), Integer.valueOf(i));
/*     */               } 
/* 111 */             }  keys = dfs.getShortWeekdays();
/* 112 */             for (i = 0; i < keys.length; i++) {
/* 113 */               String s = keys[i];
/* 114 */               if (s.length() != 0) {
/*     */                 
/* 116 */                 fillMap(daysTable, s, Integer.valueOf(i));
/* 117 */                 fillMap(daysTable, s.replace(".", ""), Integer.valueOf(i));
/*     */               } 
/*     */             } 
/*     */           }  }  } 
/*     */     } 
/*     */   } private static void fillMap(TreeMap<String, Integer> map, String key, Integer value) {
/* 123 */     map.put(key, value);
/* 124 */     key = key.replace("é", "e");
/* 125 */     key = key.replace("û", "u");
/* 126 */     map.put(key, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Date convertToDate(Object obj) {
/* 135 */     if (obj == null)
/* 136 */       return null; 
/* 137 */     if (obj instanceof Date)
/* 138 */       return (Date)obj; 
/* 139 */     if (obj instanceof Number)
/* 140 */       return new Date(((Number)obj).longValue()); 
/* 141 */     if (obj instanceof String) {
/*     */ 
/*     */       
/* 144 */       obj = ((String)obj).replace("p.m.", "pm").replace("a.m.", "am");
/* 145 */       StringTokenizer st = new StringTokenizer((String)obj, " -/:,.+年月日曜時分秒");
/*     */       
/* 147 */       String s1 = "";
/* 148 */       if (!st.hasMoreTokens())
/* 149 */         return null; 
/* 150 */       s1 = st.nextToken();
/* 151 */       if (s1.length() == 4 && Character.isDigit(s1.charAt(0))) {
/* 152 */         return getYYYYMMDD(st, s1);
/*     */       }
/* 154 */       if (daysTable.containsKey(s1)) {
/* 155 */         if (!st.hasMoreTokens())
/* 156 */           return null; 
/* 157 */         s1 = st.nextToken();
/*     */       } 
/* 159 */       if (monthsTable.containsKey(s1)) {
/* 160 */         return getMMDDYYYY(st, s1);
/*     */       }
/* 162 */       if (Character.isDigit(s1.charAt(0)))
/* 163 */         return getDDMMYYYY(st, s1); 
/* 164 */       return null;
/*     */     } 
/* 166 */     throw new RuntimeException("Primitive: Can not convert " + obj.getClass().getName() + " to int");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Date getYYYYMMDD(StringTokenizer st, String s1) {
/* 176 */     GregorianCalendar cal = newCalandar();
/*     */     
/* 178 */     int year = Integer.parseInt(s1);
/* 179 */     cal.set(1, year);
/* 180 */     if (!st.hasMoreTokens())
/* 181 */       return cal.getTime(); 
/* 182 */     s1 = st.nextToken();
/*     */     
/* 184 */     cal.set(2, parseMonth(s1).intValue());
/* 185 */     if (!st.hasMoreTokens()) {
/* 186 */       return cal.getTime();
/*     */     }
/* 188 */     s1 = st.nextToken();
/* 189 */     if (Character.isDigit(s1.charAt(0))) {
/* 190 */       if (s1.length() == 5 && s1.charAt(2) == 'T') {
/*     */         
/* 192 */         int i = Integer.parseInt(s1.substring(0, 2));
/* 193 */         cal.set(5, i);
/* 194 */         return addHour(st, cal, s1.substring(3));
/*     */       } 
/* 196 */       int day = Integer.parseInt(s1);
/* 197 */       cal.set(5, day);
/* 198 */       return addHour(st, cal, null);
/*     */     } 
/* 200 */     return cal.getTime();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int getYear(String s1) {
/* 208 */     int year = Integer.parseInt(s1);
/*     */     
/* 210 */     if (year < 100)
/* 211 */       if (year > 30) {
/* 212 */         year += 2000;
/*     */       } else {
/* 214 */         year += 1900;
/*     */       }  
/* 216 */     return year;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Date getMMDDYYYY(StringTokenizer st, String s1) {
/* 224 */     GregorianCalendar cal = newCalandar();
/*     */     
/* 226 */     Integer month = monthsTable.get(s1);
/* 227 */     if (month == null)
/* 228 */       throw new NullPointerException("can not parse " + s1 + " as month"); 
/* 229 */     cal.set(2, month.intValue());
/* 230 */     if (!st.hasMoreTokens())
/* 231 */       return null; 
/* 232 */     s1 = st.nextToken();
/*     */     
/* 234 */     int day = Integer.parseInt(s1);
/* 235 */     cal.set(5, day);
/*     */     
/* 237 */     if (!st.hasMoreTokens())
/* 238 */       return null; 
/* 239 */     s1 = st.nextToken();
/* 240 */     if (Character.isLetter(s1.charAt(0))) {
/* 241 */       if (!st.hasMoreTokens())
/* 242 */         return null; 
/* 243 */       s1 = st.nextToken();
/*     */     } 
/* 245 */     if (s1.length() == 4) {
/* 246 */       cal.set(1, getYear(s1));
/* 247 */     } else if (s1.length() == 2) {
/* 248 */       return addHour2(st, cal, s1);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 254 */     return addHour(st, cal, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Date getDDMMYYYY(StringTokenizer st, String s1) {
/* 265 */     GregorianCalendar cal = newCalandar();
/*     */     
/* 267 */     int day = Integer.parseInt(s1);
/* 268 */     cal.set(5, day);
/* 269 */     if (!st.hasMoreTokens())
/* 270 */       return null; 
/* 271 */     s1 = st.nextToken();
/* 272 */     cal.set(2, parseMonth(s1).intValue());
/*     */     
/* 274 */     if (!st.hasMoreTokens())
/* 275 */       return null; 
/* 276 */     s1 = st.nextToken();
/* 277 */     cal.set(1, getYear(s1));
/* 278 */     return addHour(st, cal, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Date addHour(StringTokenizer st, Calendar cal, String s1) {
/* 289 */     if (s1 == null) {
/* 290 */       if (!st.hasMoreTokens())
/* 291 */         return cal.getTime(); 
/* 292 */       s1 = st.nextToken();
/*     */     } 
/* 294 */     return addHour2(st, cal, s1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Date addHour2(StringTokenizer st, Calendar cal, String s1) {
/* 304 */     s1 = trySkip(st, s1, cal);
/* 305 */     cal.set(11, Integer.parseInt(s1));
/*     */     
/* 307 */     if (!st.hasMoreTokens())
/* 308 */       return cal.getTime(); 
/* 309 */     s1 = st.nextToken();
/*     */     
/* 311 */     s1 = trySkip(st, s1, cal);
/* 312 */     if (s1 == null) {
/* 313 */       return cal.getTime();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 320 */     cal.set(12, Integer.parseInt(s1));
/*     */     
/* 322 */     if (!st.hasMoreTokens())
/* 323 */       return cal.getTime(); 
/* 324 */     s1 = st.nextToken();
/*     */     
/* 326 */     s1 = trySkip(st, s1, cal);
/* 327 */     if (s1 == null) {
/* 328 */       return cal.getTime();
/*     */     }
/* 330 */     cal.set(13, Integer.parseInt(s1));
/* 331 */     if (!st.hasMoreTokens())
/* 332 */       return cal.getTime(); 
/* 333 */     s1 = st.nextToken();
/*     */     
/* 335 */     s1 = trySkip(st, s1, cal);
/* 336 */     if (s1 == null) {
/* 337 */       return cal.getTime();
/*     */     }
/* 339 */     s1 = trySkip(st, s1, cal);
/*     */ 
/*     */ 
/*     */     
/* 343 */     if (s1.length() == 4 && Character.isDigit(s1.charAt(0))) {
/* 344 */       cal.set(1, getYear(s1));
/*     */     }
/* 346 */     return cal.getTime();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String trySkip(StringTokenizer st, String s1, Calendar cal) {
/*     */     while (true) {
/* 358 */       TimeZone tz = timeZoneMapping.get(s1);
/* 359 */       if (tz != null) {
/* 360 */         cal.setTimeZone(tz);
/* 361 */         if (!st.hasMoreTokens())
/* 362 */           return null; 
/* 363 */         s1 = st.nextToken();
/*     */         continue;
/*     */       } 
/* 366 */       if (voidData.contains(s1)) {
/* 367 */         if (s1.equalsIgnoreCase("pm"))
/* 368 */           cal.add(9, 1); 
/* 369 */         if (s1.equalsIgnoreCase("am"))
/* 370 */           cal.add(9, 0); 
/* 371 */         if (!st.hasMoreTokens())
/* 372 */           return null; 
/* 373 */         s1 = st.nextToken(); continue;
/*     */       }  break;
/*     */     } 
/* 376 */     return s1;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\asm\ConvertDate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */