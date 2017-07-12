package com.omm.finder.Action;

import com.omm.finder.exception.BusinessException;
import com.omm.finder.model.Problem;
import com.omm.finder.service.problem.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;




/**
 * Created by li on 2017/7/12.
 */
@Controller
@RequestMapping("/problem")
public class ProblemAction {
    @Autowired
    ProblemService problemService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public
    @ResponseBody
    String updatePersonalInfo(
            @RequestBody Problem problem) throws BusinessException {
        problemService.saveProblem(problem);
        return "success";
    }


}
