package com.epam.training.jp.jpa.excercises.dao.jpaimpl;

import java.util.List;

import com.epam.training.jp.jpa.excercises.dao.MenuDao;
import com.epam.training.jp.jpa.excercises.domain.Food;
import com.epam.training.jp.jpa.excercises.domain.Menu;

public class JpaMenuDao extends GenericJpaDao implements MenuDao {

	@Override
	public List<Menu> getActualMenus() {
		//TODO: implement, use JPQL query
		return entityManager.createQuery("SELECT E FROM Menu E",Menu.class).getResultList();
		
		//throw new UnsupportedOperationException();

	}

	@Override
	public Food findFoodById(int foodId) {
		//TODO: implement
		return entityManager.find(Food.class, foodId);
		//throw new UnsupportedOperationException();

	}

}
