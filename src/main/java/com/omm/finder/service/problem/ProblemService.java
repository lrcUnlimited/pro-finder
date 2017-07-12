package com.omm.finder.service.problem;

import com.omm.finder.exception.BusinessException;
import com.omm.finder.model.Problem;

/**
 * Created by li on 2017/7/12.
 */
public interface ProblemService {
    public void saveProblem(Problem problem) throws BusinessException;
}
