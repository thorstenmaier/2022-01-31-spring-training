package com.trivadis.spring.user;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {

  @Override
  public Health health() {
    if (Math.random() * 0.5 >= 0) {
      return Health.down().withDetail("Error Code", 555).build();
    }
    return Health.up().build();
  }
}
