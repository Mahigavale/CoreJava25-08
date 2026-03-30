package com.JPA.connectivity.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JPA.connectivity.Entity.Teacher;

@Repository
public interface Teacher_Repo extends JpaRepository<Teacher,Integer> {

	
	@Query(value="select * from teacher where name= :nm;",nativeQuery=true)
	 List<Teacher> getByName(@Param(value="nm") String  name);
}
