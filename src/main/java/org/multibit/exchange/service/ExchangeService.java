package org.multibit.exchange.service;

import org.multibit.exchange.domain.model.Currency;
import org.multibit.exchange.domain.model.CurrencyPair;
import org.multibit.exchange.domain.model.ExchangeId;
import org.multibit.exchange.domain.model.SecurityOrder;
import org.multibit.exchange.domain.model.Ticker;

/**
 * <p>Service to provide the following to the applications in the infrastructure layer:</p>
 * <ul>
 * <li>Core exchange services.</li>
 * </ul>
 *
 * @since 0.0.1
 *         
 */
public interface ExchangeService {

  void initializeExchange(ExchangeId identifier);

  void registerCurrencyPair(ExchangeId exchangeId, Ticker ticker, Currency baseCurrency, Currency counterCurrency);

  void placeOrder(ExchangeId exchangeId, SecurityOrder order);

  void registerCurrencyPair(ExchangeId exchangeId, CurrencyPair pair);
}
