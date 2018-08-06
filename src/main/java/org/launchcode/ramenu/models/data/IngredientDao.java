package org.launchcode.ramenu.models.data;

import org.launchcode.ramenu.models.Ingredient;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface IngredientDao extends CrudRepository<Ingredient, Integer> {

    List<Ingredient> findAll();
}
