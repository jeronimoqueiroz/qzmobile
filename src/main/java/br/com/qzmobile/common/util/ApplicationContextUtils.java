package br.com.qzmobile.common.util;

import org.springframework.context.ApplicationContext;

public class ApplicationContextUtils {
	
	/**
	 * The application context; care should be taken to ensure that 
	 * 1) this variable is assigned exactly once (in the {@link #setContext(ApplicationContext)} method, 
	 * 2) the context is never reassigned to {@code null}, 
	 * 3) access to the field is thread-safe (no race conditions can occur)
	 */
	private static org.springframework.context.ApplicationContext context = null;

	
	public static ApplicationContext getContext() {
		if (isInitialized()) {
			throw new IllegalStateException("Context nao inicicalizado ainda, verificar se esta carregando os beans ao inicializar o server");
		}
		return context;
	}

	
	public static boolean isInitialized() {
		return context == null;
	}

	
	public static <T> T getBean(final String name, final Class<T> requiredType) {
		if (requiredType == null) {
			throw new IllegalArgumentException("requiredType is null");
		}
		return (T) getContext().getBean(name, requiredType);
	}

	
	public static Object getBean(final String name) {
		return getContext().getBean(name);
	}

	
	public static boolean isSingleton(final String name) {
		return getContext().isSingleton(name);
	}

	
	public static boolean isPrototype(final String name) {
		return getContext().isPrototype(name);
	}

	static synchronized void setContext(final ApplicationContext theContext) {
		if (theContext == null) {
			throw new IllegalArgumentException("theContext is null");
		}
		if (context == null) {
			context = theContext;
		}
	}

	
	private ApplicationContextUtils() {
		throw new AssertionError(); // NON-INSTANTIABLE UTILITY CLASS
	}

}
