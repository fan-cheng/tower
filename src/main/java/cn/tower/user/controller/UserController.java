package cn.tower.user.controller;

import cn.tower.base.utils.ResultFactory;
import cn.tower.user.model.UserModel;
import cn.tower.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/findUserList",method = RequestMethod.GET)
    @ResponseBody
    public Object findUserList(int pageNo){
        List<UserModel> userModels = service.findByPage(pageNo,null);
        logger.info("userModels_info=="+userModels);
        logger.debug("userModels_debug=="+userModels);
        logger.error("userModels_error=="+userModels);
        return ResultFactory.requestResult(userModels);
    }
}
