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

import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

/**
 * Handles the flow of incoming X509 certificates from a secure
 * connection. This implementation does not validate and accepts
 * everything thrown at it. This means the certificates are free
 * to be passed to whatever application requires them.
 *
 * @author alistair
 */
public class GuanxiX509TrustManager implements X509TrustManager {
  /** {@inheritDoc} */
  public void checkClientTrusted(X509Certificate[] chain, String authType) {
  }

  /** {@inheritDoc} */
  public void checkServerTrusted(X509Certificate[] chain, String authType) {
  }

  /** {@inheritDoc} */
  public X509Certificate[] getAcceptedIssuers() {
    // We'll accept anything, it's the application that does the validation
    return new X509Certificate[] {};
  }
}
