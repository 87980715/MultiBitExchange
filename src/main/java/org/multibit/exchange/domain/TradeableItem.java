package org.multibit.exchange.domain;

/**
 * <p>TradeableItem provides the following to the domain model:</p>
 * <ul>
 * <li>A ValueObjct representing an item that may be traded.</li>
 * </ul>
 *
 * @since 0.0.1
 *         
 */
public class TradeableItem {

  private final String symbol;

  public TradeableItem(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TradeableItem that = (TradeableItem) o;

    if (!symbol.equals(that.symbol)) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return symbol.hashCode();
  }

  @Override
  public String toString() {
    return "TradeableItem{" +
        "symbol='" + symbol + '\'' +
        '}';
  }
}
