/*     */ package com.ejt.internal.util;
/*     */ 
/*     */ import java.text.NumberFormat;
/*     */ import java.text.ParseException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class CmdLineParser {
/*     */   public static abstract class OptionException extends Exception { private OptionException(String msg) {
/*  13 */       super(msg);
/*     */     } }
/*     */   
/*     */   public static class UnknownOptionException extends OptionException { private String optionName;
/*     */     
/*     */     private UnknownOptionException(String optionName) {
/*  19 */       this(optionName, "Unknown option '" + optionName + "'");
/*     */     }
/*     */     
/*     */     private UnknownOptionException(String optionName, String msg) {
/*  23 */       super(msg);
/*  24 */       this.optionName = optionName;
/*     */     }
/*     */     
/*     */     public String getOptionName() {
/*  28 */       return this.optionName;
/*     */     } }
/*     */ 
/*     */   
/*     */   public static class UnknownSuboptionException
/*     */     extends UnknownOptionException
/*     */   {
/*     */     private char suboption;
/*     */     
/*     */     private UnknownSuboptionException(String option, char suboption) {
/*  38 */       super(option, "Illegal option: '" + suboption + "' in '" + option + "'");
/*  39 */       this.suboption = suboption;
/*     */     }
/*     */ 
/*     */     
/*     */     public char getSuboption() {
/*  44 */       return this.suboption;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class NotFlagException extends UnknownOptionException {
/*     */     private char notFlag;
/*     */     
/*     */     private NotFlagException(String option, char flag) {
/*  52 */       super(option, "Illegal option: '" + option + "', '" + flag + "' requires a value");
/*  53 */       this.notFlag = flag;
/*     */     }
/*     */ 
/*     */     
/*     */     public char getOptionChar() {
/*  58 */       return this.notFlag;
/*     */     } }
/*     */   public static class IllegalOptionValueException extends OptionException { private CmdLineParser.Option option;
/*     */     private String value;
/*     */     
/*     */     public IllegalOptionValueException(CmdLineParser.Option opt, String value) {
/*  64 */       super("Illegal value '" + value + "' for option " + ((opt.shortForm() != null) ? ("-" + opt.shortForm() + "/") : "") + "--" + opt.longForm());
/*  65 */       this.option = opt;
/*  66 */       this.value = value;
/*     */     }
/*     */     
/*     */     public CmdLineParser.Option getOption() {
/*  70 */       return this.option;
/*     */     }
/*     */     
/*     */     public String getValue() {
/*  74 */       return this.value;
/*     */     } }
/*     */ 
/*     */   
/*     */   public static abstract class Option {
/*     */     private String shortForm;
/*     */     private String longForm;
/*     */     private boolean wantsValue;
/*     */     
/*     */     protected Option(String longForm, boolean wantsValue) {
/*  84 */       this((String)null, longForm, wantsValue);
/*     */     }
/*     */     
/*     */     protected Option(char shortForm, String longForm, boolean wantsValue) {
/*  88 */       this(String.valueOf(shortForm), longForm, wantsValue);
/*     */     }
/*     */     
/*     */     private Option(String shortForm, String longForm, boolean wantsValue) {
/*  92 */       if (longForm == null) {
/*  93 */         throw new IllegalArgumentException("Null longForm not allowed");
/*     */       }
/*  95 */       this.shortForm = shortForm;
/*  96 */       this.longForm = longForm;
/*  97 */       this.wantsValue = wantsValue;
/*     */     }
/*     */     
/*     */     public String shortForm() {
/* 101 */       return this.shortForm;
/*     */     }
/*     */     
/*     */     public String longForm() {
/* 105 */       return this.longForm;
/*     */     }
/*     */     
/*     */     public boolean wantsValue() {
/* 109 */       return this.wantsValue;
/*     */     }
/*     */     
/*     */     public final Object getValue(String arg, Locale locale) throws CmdLineParser.IllegalOptionValueException {
/* 113 */       if (this.wantsValue) {
/* 114 */         if (arg == null) {
/* 115 */           throw new CmdLineParser.IllegalOptionValueException(this, "");
/*     */         }
/* 117 */         return parseValue(arg, locale);
/*     */       } 
/* 119 */       return Boolean.TRUE;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Object parseValue(String arg, Locale locale) throws CmdLineParser.IllegalOptionValueException {
/* 124 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public static class BooleanOption
/*     */       extends Option
/*     */     {
/*     */       public BooleanOption(char shortForm, String longForm) {
/* 133 */         super(shortForm, longForm, false);
/*     */       }
/*     */       
/*     */       public BooleanOption(String longForm) {
/* 137 */         super(longForm, false);
/*     */       }
/*     */     }
/*     */     
/*     */     public static class IntegerOption extends Option {
/*     */       public IntegerOption(char shortForm, String longForm) {
/* 143 */         super(shortForm, longForm, true);
/*     */       }
/*     */       
/*     */       public IntegerOption(String longForm) {
/* 147 */         super(longForm, true);
/*     */       }
/*     */ 
/*     */       
/*     */       protected Object parseValue(String arg, Locale locale) throws CmdLineParser.IllegalOptionValueException {
/*     */         try {
/* 153 */           return new Integer(arg);
/* 154 */         } catch (NumberFormatException e) {
/* 155 */           throw new CmdLineParser.IllegalOptionValueException(this, arg);
/*     */         } 
/*     */       }
/*     */     }
/*     */     
/*     */     public static class LongOption extends Option {
/*     */       public LongOption(char shortForm, String longForm) {
/* 162 */         super(shortForm, longForm, true);
/*     */       }
/*     */       
/*     */       public LongOption(String longForm) {
/* 166 */         super(longForm, true);
/*     */       }
/*     */ 
/*     */       
/*     */       protected Object parseValue(String arg, Locale locale) throws CmdLineParser.IllegalOptionValueException {
/*     */         try {
/* 172 */           return new Long(arg);
/* 173 */         } catch (NumberFormatException e) {
/* 174 */           throw new CmdLineParser.IllegalOptionValueException(this, arg);
/*     */         } 
/*     */       }
/*     */     }
/*     */     
/*     */     public static class DoubleOption extends Option {
/*     */       public DoubleOption(char shortForm, String longForm) {
/* 181 */         super(shortForm, longForm, true);
/*     */       }
/*     */       
/*     */       public DoubleOption(String longForm) {
/* 185 */         super(longForm, true);
/*     */       }
/*     */ 
/*     */       
/*     */       protected Object parseValue(String arg, Locale locale) throws CmdLineParser.IllegalOptionValueException {
/*     */         try {
/* 191 */           NumberFormat format = NumberFormat.getNumberInstance(locale);
/* 192 */           Number num = format.parse(arg);
/* 193 */           return Double.valueOf(num.doubleValue());
/* 194 */         } catch (ParseException e) {
/* 195 */           throw new CmdLineParser.IllegalOptionValueException(this, arg);
/*     */         } 
/*     */       }
/*     */     }
/*     */     
/*     */     public static class StringOption extends Option {
/*     */       public StringOption(char shortForm, String longForm) {
/* 202 */         super(shortForm, longForm, true);
/*     */       }
/*     */       
/*     */       public StringOption(String longForm) {
/* 206 */         super(longForm, true);
/*     */       }
/*     */       
/*     */       protected Object parseValue(String arg, Locale locale)
/*     */       {
/* 211 */         return arg; } } } public static class BooleanOption extends Option { public BooleanOption(char shortForm, String longForm) { super(shortForm, longForm, false); } public BooleanOption(String longForm) { super(longForm, false); } } public static class IntegerOption extends Option { public IntegerOption(char shortForm, String longForm) { super(shortForm, longForm, true); } public IntegerOption(String longForm) { super(longForm, true); } protected Object parseValue(String arg, Locale locale) throws CmdLineParser.IllegalOptionValueException { try { return new Integer(arg); } catch (NumberFormatException e) { throw new CmdLineParser.IllegalOptionValueException(this, arg); }  } } public static class LongOption extends Option { public LongOption(char shortForm, String longForm) { super(shortForm, longForm, true); } public LongOption(String longForm) { super(longForm, true); } protected Object parseValue(String arg, Locale locale) throws CmdLineParser.IllegalOptionValueException { try { return new Long(arg); } catch (NumberFormatException e) { throw new CmdLineParser.IllegalOptionValueException(this, arg); }  } } public static class DoubleOption extends Option { public DoubleOption(char shortForm, String longForm) { super(shortForm, longForm, true); } public DoubleOption(String longForm) { super(longForm, true); } protected Object parseValue(String arg, Locale locale) throws CmdLineParser.IllegalOptionValueException { try { NumberFormat format = NumberFormat.getNumberInstance(locale); Number num = format.parse(arg); return Double.valueOf(num.doubleValue()); } catch (ParseException e) { throw new CmdLineParser.IllegalOptionValueException(this, arg); }  } } public static class StringOption extends Option { protected Object parseValue(String arg, Locale locale) { return arg; }
/*     */      public StringOption(char shortForm, String longForm) {
/*     */       super(shortForm, longForm, true);
/*     */     } public StringOption(String longForm) {
/*     */       super(longForm, true);
/*     */     } } public final Option addOption(Option opt) {
/* 217 */     if (opt.shortForm() != null) {
/* 218 */       this.options.put("-" + opt.shortForm(), opt);
/*     */     }
/* 220 */     this.options.put("--" + opt.longForm(), opt);
/* 221 */     return opt;
/*     */   }
/*     */ 
/*     */   
/*     */   public final Option addStringOption(char shortForm, String longForm) {
/* 226 */     return addOption(new Option.StringOption(shortForm, longForm));
/*     */   }
/*     */ 
/*     */   
/*     */   public final Option addStringOption(String longForm) {
/* 231 */     return addOption(new Option.StringOption(longForm));
/*     */   }
/*     */ 
/*     */   
/*     */   public final Option addIntegerOption(char shortForm, String longForm) {
/* 236 */     return addOption(new Option.IntegerOption(shortForm, longForm));
/*     */   }
/*     */ 
/*     */   
/*     */   public final Option addIntegerOption(String longForm) {
/* 241 */     return addOption(new Option.IntegerOption(longForm));
/*     */   }
/*     */ 
/*     */   
/*     */   public final Option addLongOption(char shortForm, String longForm) {
/* 246 */     return addOption(new Option.LongOption(shortForm, longForm));
/*     */   }
/*     */ 
/*     */   
/*     */   public final Option addLongOption(String longForm) {
/* 251 */     return addOption(new Option.LongOption(longForm));
/*     */   }
/*     */ 
/*     */   
/*     */   public final Option addDoubleOption(char shortForm, String longForm) {
/* 256 */     return addOption(new Option.DoubleOption(shortForm, longForm));
/*     */   }
/*     */ 
/*     */   
/*     */   public final Option addDoubleOption(String longForm) {
/* 261 */     return addOption(new Option.DoubleOption(longForm));
/*     */   }
/*     */ 
/*     */   
/*     */   public final Option addBooleanOption(char shortForm, String longForm) {
/* 266 */     return addOption(new Option.BooleanOption(shortForm, longForm));
/*     */   }
/*     */ 
/*     */   
/*     */   public final Option addBooleanOption(String longForm) {
/* 271 */     return addOption(new Option.BooleanOption(longForm));
/*     */   }
/*     */   
/*     */   public final Object getOptionValue(Option o) {
/* 275 */     return getOptionValue(o, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Object getNonNullOptionValue(Option o, @NotNull Object def) {
/* 280 */     Object optionValue = getOptionValue(o, def);
/* 281 */     if (optionValue != null) {
/* 282 */       return optionValue;
/*     */     }
/* 284 */     return def;
/*     */   }
/*     */ 
/*     */   
/*     */   public final Object getOptionValue(Option o, Object def) {
/* 289 */     List<Object> v = this.values.get(o.longForm());
/* 290 */     if (v == null)
/* 291 */       return def; 
/* 292 */     if (v.isEmpty()) {
/* 293 */       return null;
/*     */     }
/* 295 */     Object result = v.get(0);
/* 296 */     v.remove(0);
/* 297 */     return result;
/*     */   }
/*     */ 
/*     */   
/*     */   public final List<Object> getOptionValues(Option option) {
/* 302 */     List<Object> result = new ArrayList();
/*     */     while (true) {
/* 304 */       Object o = getOptionValue(option, null);
/* 305 */       if (o == null) {
/* 306 */         return result;
/*     */       }
/* 308 */       result.add(o);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final String[] getRemainingArgs() {
/* 315 */     return this.remainingArgs;
/*     */   }
/*     */   
/*     */   public final void parse(String[] argv) throws IllegalOptionValueException, UnknownOptionException {
/* 319 */     parse(argv, Locale.getDefault());
/*     */   }
/*     */   
/*     */   public final void parse(String[] argv, Locale locale) throws IllegalOptionValueException, UnknownOptionException {
/* 323 */     List<String> otherArgs = new ArrayList<String>();
/* 324 */     int position = 0;
/* 325 */     this.values = new HashMap<String, List<Object>>(10);
/* 326 */     while (position < argv.length) {
/* 327 */       String curArg = argv[position];
/* 328 */       if (curArg.startsWith("-")) {
/* 329 */         Object value; if (curArg.equals("--")) {
/* 330 */           position++;
/*     */           break;
/*     */         } 
/* 333 */         String valueArg = null;
/* 334 */         if (curArg.startsWith("--")) {
/* 335 */           int equalsPos = curArg.indexOf("=");
/* 336 */           if (equalsPos != -1) {
/* 337 */             valueArg = curArg.substring(equalsPos + 1);
/* 338 */             curArg = curArg.substring(0, equalsPos);
/*     */           } 
/* 340 */         } else if (curArg.length() > 2) {
/* 341 */           for (int i = 1; i < curArg.length(); i++) {
/* 342 */             Option option = this.options.get("-" + curArg.charAt(i));
/* 343 */             if (option == null) {
/* 344 */               throw new UnknownSuboptionException(curArg, curArg.charAt(i));
/*     */             }
/* 346 */             if (option.wantsValue()) {
/* 347 */               throw new NotFlagException(curArg, curArg.charAt(i));
/*     */             }
/* 349 */             addValue(option, option.getValue(null, locale));
/*     */           } 
/*     */           
/* 352 */           position++;
/*     */           
/*     */           continue;
/*     */         } 
/* 356 */         Option opt = this.options.get(curArg);
/* 357 */         if (opt == null) {
/* 358 */           throw new UnknownOptionException(curArg);
/*     */         }
/*     */         
/* 361 */         if (opt.wantsValue()) {
/*     */           
/* 363 */           position++;
/* 364 */           if (valueArg == null && position < argv.length) {
/* 365 */             valueArg = argv[position];
/*     */           }
/*     */           
/* 368 */           value = opt.getValue(valueArg, locale);
/*     */         } else {
/* 370 */           value = opt.getValue(null, locale);
/*     */         } 
/*     */         
/* 373 */         addValue(opt, value);
/*     */       } else {
/*     */         
/* 376 */         otherArgs.add(curArg);
/*     */       } 
/* 378 */       position++;
/*     */     } 
/* 380 */     for (; position < argv.length; position++) {
/* 381 */       otherArgs.add(argv[position]);
/*     */     }
/* 383 */     this.remainingArgs = otherArgs.<String>toArray(new String[0]);
/*     */   }
/*     */   
/*     */   private void addValue(Option opt, Object value) {
/* 387 */     String lf = opt.longForm();
/* 388 */     List<Object> v = this.values.get(lf);
/* 389 */     if (v == null) {
/* 390 */       v = new ArrayList();
/* 391 */       this.values.put(lf, v);
/*     */     } 
/* 393 */     v.add(value);
/*     */   }
/*     */   
/* 396 */   private String[] remainingArgs = null;
/* 397 */   private Map<Object, Option> options = new HashMap<Object, Option>(10);
/* 398 */   private Map<String, List<Object>> values = new HashMap<String, List<Object>>(10);
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\interna\\util\CmdLineParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */