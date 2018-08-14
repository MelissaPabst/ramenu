package org.launchcode.ramenu.models.data;

import org.launchcode.ramenu.models.RamenOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface RamenOrderDao extends CrudRepository<RamenOrder, Integer> {
}
