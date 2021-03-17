package find_friend.controller;

import find_friend.po.Need;
import find_friend.po.ResultModel;
import find_friend.repository.NeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by mengwei on 2018/4/12.
 */
@RestController
@RequestMapping("need")
public class NeedController {
    @Autowired
    private NeedRepository needRepository;

    @PostMapping(value = "/release")
    public ResponseEntity<ResultModel> release(Need need) throws ServletException {
        needRepository.save(need);
        return new ResponseEntity<>(ResultModel.ok("需求发布成功"), HttpStatus.OK);
    }
}
