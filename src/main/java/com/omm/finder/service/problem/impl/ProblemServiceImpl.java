package com.omm.finder.service.problem.impl;

import com.omm.finder.dao.problem.ProblemRepository;
import com.omm.finder.exception.BusinessException;
import com.omm.finder.model.Problem;
import com.omm.finder.service.problem.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by li on 2017/7/12.
 */
@Service(value = "problemService")

public class ProblemServiceImpl implements ProblemService {
    @Autowired
    ProblemRepository problemRepository;

    @Override
    public void saveProblem(Problem problem) throws BusinessException {
        try {
            problemRepository.save(problem);
        } catch (Exception e) {
            throw new BusinessException("添加失败");
        }
    }
}
