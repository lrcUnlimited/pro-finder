package com.omm.finder.dao.problem;

import com.omm.finder.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by li on 2017/7/12.
 */
@Transactional
@Repository
public interface ProblemRepository extends JpaRepository<Problem, Integer> {
}
