package com.lti.misc;
import java.lang.reflect.Method;
import java.text.Annotation;

import com.lti.misc.Emp;
public class TesterAnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class e = Emp.class;
		java.lang.annotation.Annotation[] ann = e.getAnnotations();
		
		Method [] methods = e.getMethods();
		for(Method m:methods)
		{
			java.lang.annotation.Annotation[] m_ann = m.getAnnotations();
			for(java.lang.annotation.Annotation m_an: m_ann)
			{
				System.out.println(m_an.toString());
			}
		}
		
	}

}
