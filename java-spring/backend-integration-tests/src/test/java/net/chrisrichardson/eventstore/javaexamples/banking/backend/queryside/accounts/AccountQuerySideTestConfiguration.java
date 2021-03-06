package net.chrisrichardson.eventstore.javaexamples.banking.backend.queryside.accounts;

import io.eventuate.javaclient.spring.jdbc.EventuateJdbcEventStoreConfiguration;
import net.chrisrichardson.eventstore.javaexamples.banking.backend.commandside.accounts.AccountConfiguration;
import net.chrisrichardson.eventstore.javaexamples.banking.backend.commandside.transactions.MoneyTransferConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AccountConfiguration.class, MoneyTransferConfiguration.class, EventuateJdbcEventStoreConfiguration.class,
        QuerySideAccountConfiguration.class})
@EnableAutoConfiguration
public class AccountQuerySideTestConfiguration {
}
