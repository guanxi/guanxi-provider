//: "The contents of this file are subject to the Mozilla Public License
//: Version 1.1 (the "License"); you may not use this file except in
//: compliance with the License. You may obtain a copy of the License at
//: http://www.mozilla.org/MPL/
//:
//: Software distributed under the License is distributed on an "AS IS"
//: basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
//: License for the specific language governing rights and limitations
//: under the License.
//:
//: The Original Code is Guanxi (http://www.guanxi.uhi.ac.uk).
//:
//: The Initial Developer of the Original Code is Alistair Young alistair@codebrane.com
//: All Rights Reserved.
//:

package org.guanxi.security.provider;

import java.security.Provider;

/**
 * Trust subsystem for use in servlet containers. This allows the flow of
 * incoming certificates on a secure connection to be managed and passed
 * to the application.
 *
 * To install the provider, copy the jar to JAVA_HOME/jre/lib/ext and
 * add this to JAVA_HOME/lib/security/java.security:
 * security.provider.x=org.guanxi.security.provider.GuanxiProvider
 * where x is the value of the previous provider incremented.
 *
 * @author alistair
 */
public class GuanxiProvider extends Provider {
  private static final String PROVIDER_NAME = "Guanxi Security Provider";
  private static final String PROVIDER_INFO = "Guanxi Security Provider";
  private static final double PROVIDER_VERSION = 1.0;

  public GuanxiProvider() {
    super(PROVIDER_NAME, PROVIDER_VERSION, PROVIDER_INFO);

    // Register our trust subsystem
    put("TrustManagerFactory.GuanxiProvider", GuanxiTrustManagerFactory.class.getName());
  }
}
