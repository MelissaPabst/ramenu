package org.launchcode.ramenu.models.data;

import org.launchcode.ramenu.models.Ingredient;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface IngredientDao  {

    List<Ingredient> findAll();
}
