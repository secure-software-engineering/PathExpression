/*******************************************************************************
 * Copyright (c) 2018 Fraunhofer IEM, Paderborn, Germany.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Johannes Spaeth - initial API and implementation
 *******************************************************************************/

package pathexpression;

public class Epsilon<V> implements IRegEx<V> {

  public Epsilon() {
  }

  @Override
  public String toString() {
    return "EPS";
  }

  @Override
  public int hashCode() {
    return 2012345681;
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof Epsilon;
  }
}
