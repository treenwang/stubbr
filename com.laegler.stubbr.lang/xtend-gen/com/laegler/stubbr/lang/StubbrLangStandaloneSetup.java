/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang;

import com.laegler.stubbr.lang.StubbrLangStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class StubbrLangStandaloneSetup extends StubbrLangStandaloneSetupGenerated {
  public static void doSetup() {
    StubbrLangStandaloneSetup _stubbrLangStandaloneSetup = new StubbrLangStandaloneSetup();
    _stubbrLangStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
