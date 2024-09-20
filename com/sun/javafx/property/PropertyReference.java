/*     */ package com.sun.javafx.property;
/*     */ 
/*     */ import com.sun.javafx.reflect.ReflectUtil;
/*     */ import java.lang.reflect.Method;
/*     */ import java.lang.reflect.Modifier;
/*     */ import javafx.beans.property.ReadOnlyProperty;
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
/*     */ public final class PropertyReference<T>
/*     */ {
/*     */   private String name;
/*     */   private Method getter;
/*     */   private Method setter;
/*     */   private Method propertyGetter;
/*     */   private Class<?> clazz;
/*     */   private Class<?> type;
/*     */   private boolean reflected = false;
/*     */   
/*     */   public PropertyReference(Class<?> paramClass, String paramString) {
/*  61 */     if (paramString == null)
/*  62 */       throw new NullPointerException("Name must be specified"); 
/*  63 */     if (paramString.trim().length() == 0)
/*  64 */       throw new IllegalArgumentException("Name must be specified"); 
/*  65 */     if (paramClass == null)
/*  66 */       throw new NullPointerException("Class must be specified"); 
/*  67 */     ReflectUtil.checkPackageAccess(paramClass);
/*  68 */     this.name = paramString;
/*  69 */     this.clazz = paramClass;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWritable() {
/*  78 */     reflect();
/*  79 */     return (this.setter != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isReadable() {
/*  88 */     reflect();
/*  89 */     return (this.getter != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasProperty() {
/*  99 */     reflect();
/* 100 */     return (this.propertyGetter != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 109 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class<?> getContainingClass() {
/* 118 */     return this.clazz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class<?> getType() {
/* 128 */     reflect();
/* 129 */     return this.type;
/*     */   }
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
/*     */   public void set(Object paramObject, T paramT) {
/* 143 */     if (!isWritable()) {
/* 144 */       throw new IllegalStateException("Cannot write to readonly property " + this.name);
/*     */     }
/* 146 */     assert this.setter != null;
/*     */     try {
/* 148 */       MethodHelper.invoke(this.setter, paramObject, new Object[] { paramT });
/* 149 */     } catch (Exception exception) {
/* 150 */       throw new RuntimeException(exception);
/*     */     } 
/*     */   }
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
/*     */   public T get(Object paramObject) {
/* 166 */     if (!isReadable()) {
/* 167 */       throw new IllegalStateException("Cannot read from unreadable property " + this.name);
/*     */     }
/* 169 */     assert this.getter != null;
/*     */     try {
/* 171 */       return (T)MethodHelper.invoke(this.getter, paramObject, (Object[])null);
/* 172 */     } catch (Exception exception) {
/* 173 */       throw new RuntimeException(exception);
/*     */     } 
/*     */   }
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
/*     */   public ReadOnlyProperty<T> getProperty(Object paramObject) {
/* 190 */     if (!hasProperty())
/* 191 */       throw new IllegalStateException("Cannot get property " + this.name); 
/* 192 */     assert this.propertyGetter != null;
/*     */     try {
/* 194 */       return (ReadOnlyProperty<T>)MethodHelper.invoke(this.propertyGetter, paramObject, (Object[])null);
/* 195 */     } catch (Exception exception) {
/* 196 */       throw new RuntimeException(exception);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 205 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void reflect() {
/* 211 */     if (!this.reflected) {
/* 212 */       this.reflected = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 219 */         String str1 = (this.name.length() == 1) ? this.name.substring(0, 1).toUpperCase() : ("" + Character.toUpperCase(this.name.charAt(0)) + Character.toUpperCase(this.name.charAt(0)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 227 */         this.type = null;
/*     */         
/* 229 */         String str2 = "get" + str1;
/*     */         try {
/* 231 */           Method method = this.clazz.getMethod(str2, new Class[0]);
/* 232 */           if (Modifier.isPublic(method.getModifiers())) {
/* 233 */             this.getter = method;
/*     */           }
/* 235 */         } catch (NoSuchMethodException noSuchMethodException) {}
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 240 */         if (this.getter == null) {
/* 241 */           str2 = "is" + str1;
/*     */           try {
/* 243 */             Method method = this.clazz.getMethod(str2, new Class[0]);
/* 244 */             if (Modifier.isPublic(method.getModifiers())) {
/* 245 */               this.getter = method;
/*     */             }
/* 247 */           } catch (NoSuchMethodException noSuchMethodException) {}
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 255 */         String str3 = "set" + str1;
/*     */ 
/*     */ 
/*     */         
/* 259 */         if (this.getter != null) {
/* 260 */           this.type = this.getter.getReturnType();
/*     */           try {
/* 262 */             Method method = this.clazz.getMethod(str3, new Class[] { this.type });
/* 263 */             if (Modifier.isPublic(method.getModifiers())) {
/* 264 */               this.setter = method;
/*     */             }
/* 266 */           } catch (NoSuchMethodException noSuchMethodException) {}
/*     */         }
/*     */         else {
/*     */           
/* 270 */           Method[] arrayOfMethod = this.clazz.getMethods();
/* 271 */           for (Method method : arrayOfMethod) {
/* 272 */             Class[] arrayOfClass = method.getParameterTypes();
/* 273 */             if (str3.equals(method.getName()) && arrayOfClass.length == 1 && 
/*     */               
/* 275 */               Modifier.isPublic(method.getModifiers())) {
/*     */               
/* 277 */               this.setter = method;
/* 278 */               this.type = arrayOfClass[0];
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 285 */         String str4 = this.name + "Property";
/*     */         try {
/* 287 */           Method method = this.clazz.getMethod(str4, new Class[0]);
/* 288 */           if (Modifier.isPublic(method.getModifiers()))
/* 289 */           { this.propertyGetter = method; }
/*     */           else
/* 291 */           { this.propertyGetter = null; } 
/* 292 */         } catch (NoSuchMethodException noSuchMethodException) {}
/*     */       
/*     */       }
/* 295 */       catch (RuntimeException runtimeException) {
/* 296 */         System.err.println("Failed to introspect property " + this.name);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 306 */     if (this == paramObject) {
/* 307 */       return true;
/*     */     }
/* 309 */     if (!(paramObject instanceof PropertyReference)) {
/* 310 */       return false;
/*     */     }
/* 312 */     PropertyReference propertyReference = (PropertyReference)paramObject;
/* 313 */     if (this.name != propertyReference.name && (this.name == null || 
/* 314 */       !this.name.equals(propertyReference.name))) {
/* 315 */       return false;
/*     */     }
/* 317 */     if (this.clazz != propertyReference.clazz && (this.clazz == null || 
/* 318 */       !this.clazz.equals(propertyReference.clazz))) {
/* 319 */       return false;
/*     */     }
/* 321 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 329 */     int i = 5;
/* 330 */     i = 97 * i + ((this.name != null) ? this.name.hashCode() : 0);
/* 331 */     i = 97 * i + ((this.clazz != null) ? this.clazz.hashCode() : 0);
/* 332 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\PropertyReference.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */