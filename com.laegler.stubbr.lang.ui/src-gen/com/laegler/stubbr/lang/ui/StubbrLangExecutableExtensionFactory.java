/*
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.ui;

import com.google.inject.Injector;
import com.laegler.stubbr.lang.ui.internal.LangActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StubbrLangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return LangActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return LangActivator.getInstance().getInjector(LangActivator.COM_LAEGLER_STUBBR_LANG_STUBBRLANG);
	}
	
}