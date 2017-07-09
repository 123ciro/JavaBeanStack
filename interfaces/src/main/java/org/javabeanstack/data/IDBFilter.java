/*
* Copyright (c) 2015-2017 OyM System Group S.A.
* Capitan Cristaldo 464, Asunción, Paraguay
* All rights reserved. 
*
* NOTICE:  All information contained herein is, and remains
* the property of OyM System Group S.A. and its suppliers,
* if any.  The intellectual and technical concepts contained
* herein are proprietary to OyM System Group S.A.
* and its suppliers and protected by trade secret or copyright law.
* Dissemination of this information or reproduction of this material
* is strictly forbidden unless prior written permission is obtained
* from OyM System Group S.A.
 */
package py.com.oym.frame.data;

import java.util.List;

/**
 *
 * @author Jorge Enciso
 */
public interface IDBFilter {
    Number getMainFilter();
    Number getMainSubFilter();
    String getMainFilterExpr();
    String getMainFilterExpr(String alias);
    String getAllFilterExpr();
    String getAllFilterExpr(String alias);
}
