/*

Copyright 2025 Massimo Santini

This file is part of "Programmazione 2 @ UniMI" teaching material.

This is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This material is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this file.  If not, see <https://www.gnu.org/licenses/>.

*/

package it.unimi.di.prog2.e05;

/** Utility class for computing mathematical functions. */
public class MathFunctions {

  /** Costruttore privato per impedire l'istanziazione. */
  private MathFunctions() {}

  /* Specify and implement a method that given a positive number returns an approximation
   * of its square root.
   *
   * Hint: https://en.wikipedia.org/wiki/Bisection_method
   */

  /**
   * Dato un numero estrae se possibile la radice quandrata con un'approssimazione di {@literal
   * \(10^{-6}\) }
   *
   * @param num {@literal \( numero \geq 0 \)}
   * @return restituisce la radice quadrata approssimata di {@code num} tale che {@literal \( y -
   *     num^2 \leq 1+10^{-6} \) }
   */
  public static double sqrt(double num) {
    double inferiore = 0;
    double superiore = num;
    double mezzo = 0;
    while (superiore - inferiore >= 1e-6) {
      mezzo = (superiore + inferiore) / 2;
      if (mezzo * mezzo - num > 0) {
        superiore = mezzo;
      } else {
        inferiore = mezzo;
      }
    }
    return mezzo;
  }
}
