package com.rajeev.location.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.rajeev.location.entity.Location;


public interface LocationReposgatry extends JpaRepository<Location, Integer>{
	@Query(value="SELECT Type, COUNT(*) from location GROUP by Type",nativeQuery = true)   
	public List<Object[]> findAndTypeCount();
	@Query(value="select * from location where location.id=?",nativeQuery=true)
		public Integer findOne(Integer id);
}

