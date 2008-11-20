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

import javax.net.ssl.TrustManagerFactorySpi;
import javax.net.ssl.TrustManager;
import javax.net.ssl.ManagerFactoryParameters;
import java.security.KeyStore;

/**
 * Instantiates our trust manager implementations
 *
 * @author alistair
 */
public class GuanxiTrustManagerFactory extends TrustManagerFactorySpi {
  public GuanxiTrustManagerFactory() {}

  /** {@inheritDoc} */
  protected void engineInit(KeyStore ks) {
  }

  /** {@inheritDoc} */
  protected void engineInit(ManagerFactoryParameters spec) {
  }

  /** {@inheritDoc} */
  protected TrustManager[] engineGetTrustManagers() {
    return new TrustManager[] {new GuanxiX509TrustManager()};
  }
}
