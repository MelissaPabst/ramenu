package org.launchcode.ramenu.models.data;

import org.launchcode.ramenu.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderDao extends CrudRepository<Order, Integer> {
}
