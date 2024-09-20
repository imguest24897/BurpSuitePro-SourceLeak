/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Locale;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.binding.StringBinding;
/*     */ import javafx.beans.binding.StringExpression;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.FXCollections;
/*     */ import javafx.collections.ObservableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class StringFormatter
/*     */   extends StringBinding
/*     */ {
/*     */   private static Object extractValue(Object paramObject) {
/*  42 */     return (paramObject instanceof ObservableValue) ? ((ObservableValue)paramObject).getValue() : paramObject;
/*     */   }
/*     */   
/*     */   private static Object[] extractValues(Object[] paramArrayOfObject) {
/*  46 */     int i = paramArrayOfObject.length;
/*  47 */     Object[] arrayOfObject = new Object[i];
/*  48 */     for (byte b = 0; b < i; b++) {
/*  49 */       arrayOfObject[b] = extractValue(paramArrayOfObject[b]);
/*     */     }
/*  51 */     return arrayOfObject;
/*     */   }
/*     */   
/*     */   private static ObservableValue<?>[] extractDependencies(Object... paramVarArgs) {
/*  55 */     ArrayList<ObservableValue> arrayList = new ArrayList();
/*  56 */     for (Object object : paramVarArgs) {
/*  57 */       if (object instanceof ObservableValue) {
/*  58 */         arrayList.add((ObservableValue)object);
/*     */       }
/*     */     } 
/*  61 */     return (ObservableValue<?>[])arrayList.<ObservableValue>toArray(new ObservableValue[arrayList.size()]);
/*     */   }
/*     */   
/*     */   public static StringExpression convert(final ObservableValue<?> observableValue) {
/*  65 */     if (observableValue == null) {
/*  66 */       throw new NullPointerException("ObservableValue must be specified");
/*     */     }
/*  68 */     if (observableValue instanceof StringExpression) {
/*  69 */       return (StringExpression)observableValue;
/*     */     }
/*  71 */     return (StringExpression)new StringBinding()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/*  78 */           unbind(new Observable[] { (Observable)this.val$observableValue });
/*     */         }
/*     */ 
/*     */         
/*     */         protected String computeValue() {
/*  83 */           Object object = observableValue.getValue();
/*  84 */           return (object == null) ? "null" : object.toString();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableValue<?>> getDependencies() {
/*  89 */           return FXCollections.singletonObservableList(observableValue);
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public static StringExpression concat(Object... args) {
/*  96 */     if (args == null || args.length == 0) {
/*  97 */       return StringConstant.valueOf("");
/*     */     }
/*  99 */     if (args.length == 1) {
/* 100 */       Object object = args[0];
/* 101 */       return (object instanceof ObservableValue) ? convert((ObservableValue)object) : 
/* 102 */         StringConstant.valueOf(object.toString());
/*     */     } 
/* 104 */     if ((extractDependencies(args)).length == 0) {
/* 105 */       StringBuilder stringBuilder = new StringBuilder();
/* 106 */       for (Object object : args) {
/* 107 */         stringBuilder.append(object);
/*     */       }
/* 109 */       return StringConstant.valueOf(stringBuilder.toString());
/*     */     } 
/* 111 */     return (StringExpression)new StringFormatter()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 118 */           unbind((Observable[])StringFormatter.extractDependencies(args));
/*     */         }
/*     */ 
/*     */         
/*     */         protected String computeValue() {
/* 123 */           StringBuilder stringBuilder = new StringBuilder();
/* 124 */           for (Object object : args) {
/* 125 */             stringBuilder.append(StringFormatter.extractValue(object));
/*     */           }
/* 127 */           return stringBuilder.toString();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableValue<?>> getDependencies() {
/* 132 */           return FXCollections.unmodifiableObservableList(
/* 133 */               FXCollections.observableArrayList((Object[])StringFormatter.extractDependencies(args)));
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   public static StringExpression format(final Locale locale, final String format, Object... args) {
/* 139 */     if (format == null) {
/* 140 */       throw new NullPointerException("Format cannot be null.");
/*     */     }
/* 142 */     if ((extractDependencies(args)).length == 0) {
/* 143 */       return StringConstant.valueOf(String.format(locale, format, args));
/*     */     }
/* 145 */     StringFormatter stringFormatter = new StringFormatter()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 152 */           unbind((Observable[])StringFormatter.extractDependencies(args));
/*     */         }
/*     */ 
/*     */         
/*     */         protected String computeValue() {
/* 157 */           Object[] arrayOfObject = StringFormatter.extractValues(args);
/* 158 */           return String.format(locale, format, arrayOfObject);
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableValue<?>> getDependencies() {
/* 163 */           return FXCollections.unmodifiableObservableList(
/* 164 */               FXCollections.observableArrayList((Object[])StringFormatter.extractDependencies(args)));
/*     */         }
/*     */       };
/*     */     
/* 168 */     stringFormatter.get();
/* 169 */     return (StringExpression)stringFormatter;
/*     */   }
/*     */   
/*     */   public static StringExpression format(final String format, Object... args) {
/* 173 */     if (format == null) {
/* 174 */       throw new NullPointerException("Format cannot be null.");
/*     */     }
/* 176 */     if ((extractDependencies(args)).length == 0) {
/* 177 */       return StringConstant.valueOf(String.format(format, args));
/*     */     }
/* 179 */     StringFormatter stringFormatter = new StringFormatter()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 186 */           unbind((Observable[])StringFormatter.extractDependencies(args));
/*     */         }
/*     */ 
/*     */         
/*     */         protected String computeValue() {
/* 191 */           Object[] arrayOfObject = StringFormatter.extractValues(args);
/* 192 */           return String.format(format, arrayOfObject);
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableValue<?>> getDependencies() {
/* 197 */           return FXCollections.unmodifiableObservableList(
/* 198 */               FXCollections.observableArrayList((Object[])StringFormatter.extractDependencies(args)));
/*     */         }
/*     */       };
/*     */     
/* 202 */     stringFormatter.get();
/* 203 */     return (StringExpression)stringFormatter;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\StringFormatter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */