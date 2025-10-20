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

/** Classe di metodi di utilità per array. */
public class ArrayUtils {

  /** Costruttore privato per impedire l'istanziazione. */
  private ArrayUtils() {}

  /*
   * Specify and implement a method that given a sorted array of integers and a
   * value, returns the index of the value if it is present in the array.
   *
   * Hint: https://research.google/blog/extra-extra-read-all-about-it-nearly-all-binary-searches-and-mergesorts-are-broken/
   */

  /**
   * Cerca un indice di un intero (fornito come secondo argomento) in un array ordinatio di interi
   * (fornito come secondo argomento)
   *
   * <p>Se l'array contiene l'intero fornito, restituisce il primo indice in cui si trova l'intero.
   * (non è detto che sia la prima istanza del valore all'interno dell'array). Se il valore non è
   * presente nell'array, restituisce {@code -1}. Il valore restituito è negativo se e solo se
   * l'intero cercato non è presente nell'array.
   *
   * @param haystack l'array ordinato di interi non vuoto
   * @param needle l'intero da cercare
   * @return l'indice di {@code needle} se presente nell'array alrtimenti {@code -1}
   */
  static int binarySearch(final int[] haystack, final int needle) {
    int lo = 0;
    int hi = haystack.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (needle < haystack[mid]) hi = mid - 1;
      else if (needle > haystack[mid]) lo = mid + 1;
      else return mid;
    }
    return -1;
  }
}
