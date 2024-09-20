/*     */ package com.nimbusds.jose.shaded.asm;
/*     */ 
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Method;
/*     */ import java.lang.reflect.Type;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Accessor
/*     */ {
/*     */   protected Field field;
/*     */   protected Method setter;
/*     */   protected Method getter;
/*     */   protected int index;
/*     */   protected Class<?> type;
/*     */   protected Type genericType;
/*     */   protected String fieldName;
/*     */   
/*     */   public int getIndex() {
/*  67 */     return this.index;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isPublic() {
/*  75 */     return (this.setter == null && this.getter == null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isEnum() {
/*  83 */     return this.type.isEnum();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/*  91 */     return this.fieldName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Class<?> getType() {
/*  99 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Type getGenericType() {
/* 107 */     return this.genericType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isUsable() {
/* 114 */     return (this.field != null || this.getter != null || this.setter != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isReadable() {
/* 121 */     return (this.field != null || this.getter != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWritable() {
/* 128 */     return (this.field != null || this.getter != null);
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
/*     */   public Accessor(Class<?> c, Field field, FieldFilter filter) {
/* 140 */     this.fieldName = field.getName();
/* 141 */     int m = field.getModifiers();
/*     */     
/* 143 */     if ((m & 0x88) > 0) {
/*     */       return;
/*     */     }
/* 146 */     if ((m & 0x1) > 0) {
/* 147 */       this.field = field;
/*     */     }
/* 149 */     String name = ASMUtil.getSetterName(field.getName());
/*     */     try {
/* 151 */       this.setter = c.getDeclaredMethod(name, new Class[] { field.getType() });
/* 152 */     } catch (Exception exception) {}
/*     */     
/* 154 */     boolean isBool = field.getType().equals(boolean.class);
/* 155 */     if (isBool) {
/* 156 */       name = ASMUtil.getIsName(field.getName());
/*     */     } else {
/* 158 */       name = ASMUtil.getGetterName(field.getName());
/*     */     } 
/*     */     try {
/* 161 */       this.getter = c.getDeclaredMethod(name, new Class[0]);
/* 162 */     } catch (Exception exception) {}
/*     */     
/* 164 */     if (this.getter == null && isBool) {
/*     */       try {
/* 166 */         this.getter = c.getDeclaredMethod(ASMUtil.getGetterName(field.getName()), new Class[0]);
/* 167 */       } catch (Exception exception) {}
/*     */     }
/*     */ 
/*     */     
/* 171 */     if (this.field == null && this.getter == null && this.setter == null) {
/*     */       return;
/*     */     }
/* 174 */     if (this.getter != null && !filter.canUse(field, this.getter)) {
/* 175 */       this.getter = null;
/*     */     }
/* 177 */     if (this.setter != null && !filter.canUse(field, this.setter)) {
/* 178 */       this.setter = null;
/*     */     }
/*     */     
/* 181 */     if (this.getter == null && this.setter == null && this.field == null) {
/*     */       return;
/*     */     }
/* 184 */     this.type = field.getType();
/* 185 */     this.genericType = field.getGenericType();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\asm\Accessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */