package com.duyi;

import com.duyi.annotation.MyAnnotation;
import com.duyi.annotation.MyAnnotation1;
import com.duyi.domian.User;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MainTest6 {
	public static void main(String[] args) throws NoSuchFieldException {
		Class user = User.class;
		//得到实体类对应的数据库表名
		MyAnnotation myAnnotation = (MyAnnotation) user.getAnnotation(MyAnnotation.class);
		System.out.println("数据库表名：" + myAnnotation.value());
		
		//得到数据库表的字段
		Field[] fields = user.getDeclaredFields();
		for (Field field : fields) {
			MyAnnotation1 myAnnotation1 = field.getAnnotation(MyAnnotation1.class);
			System.out.println("字段名：" + myAnnotation1.columnName() + "\t" + "类型：" + myAnnotation1.type() + "\t" + "长度：" + myAnnotation1.length());
		}
		
	}
}
